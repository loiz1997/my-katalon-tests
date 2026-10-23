import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable

Map<String, String> createdProducts = GlobalVariable.createdProducts
Collection<String> idsToDelete = createdProducts.values()

assert idsToDelete.size() > 0 : "No Product IDs found in GlobalVariable.createdProducts to delete!"

sleep(1000)

int successCount = 0

for (String id : idsToDelete) {
    String targetUrl = "https://api.restful-api.dev/objects/" + id

    RequestObject deleteRequest = new RequestObject("DynamicDeleteRequest")
    deleteRequest.setRestUrl(targetUrl)
    deleteRequest.setRestRequestMethod("DELETE")

    List<TestObjectProperty> headers = [
        new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json"),
        new TestObjectProperty("User-Agent", ConditionType.EQUALS, "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
    ]
    deleteRequest.setHttpHeaderProperties(headers)

    def response = WS.sendRequest(deleteRequest)
    int statusCode = response.getStatusCode()

    if (statusCode == 200 || statusCode == 204) {
        successCount++
        println("SUCCESS: Deleted product ID -> ${id}")
        
        // VERIFY DELETION VIA GET REQUEST
        RequestObject getRequest = new RequestObject("DynamicGetRequest")
        getRequest.setRestUrl(targetUrl)
        getRequest.setRestRequestMethod("GET")
        getRequest.setHttpHeaderProperties(headers)
        
        def getResponse = WS.sendRequest(getRequest)
        
        // Expect 404 Not Found since the object was deleted
        WS.verifyResponseStatusCode(getResponse, 404)
        println("VERIFIED: GET request for deleted ID ${id} returned 404 Not Found.")
    }
}

WS.verifyEqual(successCount, idsToDelete.size())
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

// Clear old map entries at the start
GlobalVariable.createdProducts.clear()

TestData products = findTestData('Data Files/API/Products')
JsonSlurper slurper = new JsonSlurper()
int rowCount = products.getRowNumbers()

for (int row = 1; row <= rowCount; row++) {
    String name = products.getValue('name', row)
    int year = products.getValue('year', row) as int
    double price = products.getValue('price', row) as double
    String cpuModel = products.getValue('cpu_model', row)
    String hardDiskSize = products.getValue('hard_disk_size', row)

    String jsonBody = new JsonBuilder([
        name: name,
        data: [
            year: year,
            price: price,
            'CPU model': cpuModel,
            'Hard disk size': hardDiskSize
        ]
    ]).toString()

    RequestObject request = findTestObject('API/REST/RestAPICollection/POST_RestAPI')
    
    // Explicitly set clean target URL
    request.setRestUrl('https://api.restful-api.dev/objects')
    request.setBodyContent(new HttpTextBodyContent(jsonBody, 'UTF-8', 'application/json'))

    // Add User-Agent and Content-Type to pass 403 Forbidden checks
    List<TestObjectProperty> headers = [
        new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json"),
        new TestObjectProperty("User-Agent", ConditionType.EQUALS, "Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
    ]
    request.setHttpHeaderProperties(headers)

    def response = WS.sendRequest(request)
    println("POST Status: " + response.getStatusCode() + " | Response: " + response.getResponseBodyContent())
    
    WS.verifyResponseStatusCode(response, 200)

    def result = slurper.parseText(response.getResponseBodyContent())
    String createdId = result.id

    GlobalVariable.createdProducts.put(name, createdId)
    println("SUCCESS POST [${row}/${rowCount}]: Name='${name}' | Created ID='${createdId}'")
}

println("TOTAL CREATED PRODUCTS STORED: " + GlobalVariable.createdProducts)
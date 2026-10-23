import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper

response = WS.sendRequest(findTestObject('Object Repository/API/FullCrud/GetAllObjects'))
WS.verifyResponseStatusCode(response, 200)

assert response.getResponseBodyContent()?.trim() : 'The API response body is empty.'

List objects = new JsonSlurper().parseText(response.getResponseBodyContent()) as List
assert objects != null : 'The response could not be parsed as a JSON array.'

println("Retrieved ${objects.size()} object(s) from the API.")
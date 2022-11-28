<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET-comments</name>
   <tag></tag>
   <elementGuidId>93cb9643-dac2-4de4-ba27-a948560a0ffe</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/comments</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)
WS.verifyElementPropertyValue(response, '[0].postId', '')
WS.verifyElementPropertyValue(response, '[0].id', '')
WS.verifyElementPropertyValue(response, '[0].name', '')
WS.verifyElementPropertyValue(response, '[0].email', '')
WS.verifyElementPropertyValue(response, '[0].body', '')
WS.verifyElementPropertyValue(response, '[1].postId', '')
WS.verifyElementPropertyValue(response, '[1].id', '')
WS.verifyElementPropertyValue(response, '[1].name', '')
WS.verifyElementPropertyValue(response, '[1].email', '')
WS.verifyElementPropertyValue(response, '[1].body', '')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

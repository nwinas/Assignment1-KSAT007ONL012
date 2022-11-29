<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GET-users</name>
   <tag></tag>
   <elementGuidId>0119d47b-e74e-4cab-8d1b-2545ce7ed823</elementGuidId>
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
   <restUrl>https://jsonplaceholder.typicode.com/users</restUrl>
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
WS.verifyElementPropertyValue(response, '[0].id', '')
WS.verifyElementPropertyValue(response, '[0].name', '')
WS.verifyElementPropertyValue(response, '[0].username', '')
WS.verifyElementPropertyValue(response, '[0].email', '')
WS.verifyElementPropertyValue(response, '[0].address', '')
WS.verifyElementPropertyValue(response, '[0].address.street', '')
WS.verifyElementPropertyValue(response, '[0].address.suite', '')
WS.verifyElementPropertyValue(response, '[0].address.city', '')
WS.verifyElementPropertyValue(response, '[0].address.zipcode', '')
WS.verifyElementPropertyValue(response, '[0].address.geo', '')
WS.verifyElementPropertyValue(response, '[0].address.geo.lat', '')
WS.verifyElementPropertyValue(response, '[0].address.geo.lng', '')
WS.verifyElementPropertyValue(response, '[0].phone', '')
WS.verifyElementPropertyValue(response, '[0].website', '')
WS.verifyElementPropertyValue(response, '[0].company', '')
WS.verifyElementPropertyValue(response, '[0].company.name', '')
WS.verifyElementPropertyValue(response, '[0].company.catchPhrase', '')
WS.verifyElementPropertyValue(response, '[0].company.catchPhrase', '')
WS.verifyElementPropertyValue(response, '[0].company.bs', '')
WS.verifyElementPropertyValue(response, '[1].id', '')
WS.verifyElementPropertyValue(response, '[1].name', '')
WS.verifyElementPropertyValue(response, '[1].username', '')
WS.verifyElementPropertyValue(response, '[1].email', '')
WS.verifyElementPropertyValue(response, '[1].address', '')
WS.verifyElementPropertyValue(response, '[1].address.street', '')
WS.verifyElementPropertyValue(response, '[1].address.suite', '')
WS.verifyElementPropertyValue(response, '[1].address.city', '')
WS.verifyElementPropertyValue(response, '[1].address.zipcode', '')
WS.verifyElementPropertyValue(response, '[1].address.geo', '')
WS.verifyElementPropertyValue(response, '[1].address.geo.lat', '')
WS.verifyElementPropertyValue(response, '[1].address.geo.lng', '')
WS.verifyElementPropertyValue(response, '[1].phone', '')
WS.verifyElementPropertyValue(response, '[1].website', '')
WS.verifyElementPropertyValue(response, '[1].company.name', '')
WS.verifyElementPropertyValue(response, '[1].company.catchPhrase', '')
WS.verifyElementPropertyValue(response, '[1].company.bs', '')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST-users</name>
   <tag></tag>
   <elementGuidId>13e54d47-089f-4273-a417-4ef28d475262</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;id\&quot;: 11,\n    \&quot;name\&quot;: \&quot;chintya\&quot;,\n    \&quot;username\&quot;: \&quot;corla\&quot;,\n    \&quot;email\&quot;: \&quot;corla@mailsac.com\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;Melrose Place\&quot;,\n      \&quot;suite\&quot;: \&quot;Apt. 12\&quot;,\n      \&quot;city\&quot;: \&quot;Jakarta\&quot;,\n      \&quot;zipcode\&quot;: \&quot;59901-2222\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;-10.1213\&quot;,\n        \&quot;lng\&quot;: \&quot;91.1496\&quot;\n      }\n    },\n    \&quot;phone\&quot;: \&quot;0841-2098-9188\&quot;,\n    \&quot;website\&quot;: \&quot;instagram.com\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;Instagram\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;Instagram is a photo and video sharing social networking service\&quot;,\n      \&quot;bs\&quot;: \&quot;Instagram Shopping - Advertising - Reels\&quot;\n    }\n  }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <katalonVersion>8.1.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
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
WS.verifyElementPropertyValue(response, 'id', '11')
WS.verifyElementPropertyValue(response, 'name', 'chintya')
WS.verifyElementPropertyValue(response, 'username', 'corla')
WS.verifyElementPropertyValue(response, 'email', 'corla@mailsac.com')
WS.verifyElementPropertyValue(response, 'address.street', 'Melrose Place')
WS.verifyElementPropertyValue(response, 'address.suite', 'Apt. 12')
WS.verifyElementPropertyValue(response, 'address.city', 'Jakarta')
WS.verifyElementPropertyValue(response, 'address.zipcode', '59901-2222')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '-10.1213')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '91.1496')
WS.verifyElementPropertyValue(response, 'phone', '0841-2098-9188')
WS.verifyElementPropertyValue(response, 'website', 'instagram.com')
WS.verifyElementPropertyValue(response, 'company.name', 'Instagram')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', 'Instagram is a photo and video sharing social networking service')
WS.verifyElementPropertyValue(response, 'company.bs', 'Instagram Shopping - Advertising - Reels')


WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

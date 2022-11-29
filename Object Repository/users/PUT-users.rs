<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT-users</name>
   <tag></tag>
   <elementGuidId>108e4381-9067-4a59-a28b-0e265f808084</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;wina\&quot;,\n    \&quot;username\&quot;: \&quot;nwinas\&quot;,\n    \&quot;email\&quot;: \&quot;wina@mailsac.com\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;Rawa Belong\&quot;,\n      \&quot;suite\&quot;: \&quot;Melrose place\&quot;,\n      \&quot;city\&quot;: \&quot;Subang\&quot;,\n      \&quot;zipcode\&quot;: \&quot;11111-0000\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;-15.1013\&quot;,\n        \&quot;lng\&quot;: \&quot;20.1496\&quot;\n      }\n    },\n    \&quot;phone\&quot;: \&quot;0809-1098-4451\&quot;,\n    \&quot;website\&quot;: \&quot;facebook.com\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;Facebook\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;Facebook adalah media sosial dan layanan jejaring sosial\&quot;,\n      \&quot;bs\&quot;: \&quot;Mengikuti berita teman kini lebih cepat dari sebelumnya. • Mengetahui apa yang dilakukan teman • Berbagi pembaruan, foto, dan video\&quot;\n    }\n  }&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users/1</restUrl>
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
WS.verifyElementPropertyValue(response, 'name', '')
WS.verifyElementPropertyValue(response, 'username', '')
WS.verifyElementPropertyValue(response, 'email', '')
WS.verifyElementPropertyValue(response, 'address.street', '')
WS.verifyElementPropertyValue(response, 'address.suite', '')
WS.verifyElementPropertyValue(response, 'address.city', '')
WS.verifyElementPropertyValue(response, 'address.zipcode', '')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '')
WS.verifyElementPropertyValue(response, 'phone', '')
WS.verifyElementPropertyValue(response, 'website', '')
WS.verifyElementPropertyValue(response, 'company.name', '')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', '')
WS.verifyElementPropertyValue(response, 'company.bs', '')
WS.verifyElementPropertyValue(response, 'id', '')


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//testcase untuk method GET
response = WS.sendRequest(findTestObject('users/GET-users'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].name', 'Leanne Graham')
WS.verifyElementPropertyValue(response, '[0].username', 'Bret')
WS.verifyElementPropertyValue(response, '[0].email', 'Sincere@april.biz')
WS.verifyElementPropertyValue(response, '[0].address.street', 'Kulas Light')
WS.verifyElementPropertyValue(response, '[0].address.suite', 'Apt. 556')
WS.verifyElementPropertyValue(response, '[0].address.city', 'Gwenborough')
WS.verifyElementPropertyValue(response, '[0].address.zipcode', '92998-3874')
WS.verifyElementPropertyValue(response, '[0].address.geo.lat', '-37.3159')
WS.verifyElementPropertyValue(response, '[0].address.geo.lng', '81.1496')
WS.verifyElementPropertyValue(response, '[0].phone', '1-770-736-8031 x56442')
WS.verifyElementPropertyValue(response, '[0].website', 'hildegard.org')
WS.verifyElementPropertyValue(response, '[0].company.name', 'Romaguera-Crona')
WS.verifyElementPropertyValue(response, '[0].company.catchPhrase', 'Multi-layered client-server neural-net')
WS.verifyElementPropertyValue(response, '[0].company.bs', 'harness real-time e-markets')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].name', 'Ervin Howell')
WS.verifyElementPropertyValue(response, '[1].username', 'Antonette')
WS.verifyElementPropertyValue(response, '[1].email', 'Shanna@melissa.tv')
WS.verifyElementPropertyValue(response, '[1].address.street', 'Victor Plains')
WS.verifyElementPropertyValue(response, '[1].address.suite', 'Suite 879')
WS.verifyElementPropertyValue(response, '[1].address.city', 'Wisokyburgh')
WS.verifyElementPropertyValue(response, '[1].address.zipcode', '90566-7771')
WS.verifyElementPropertyValue(response, '[1].address.geo.lat', '-43.9509')
WS.verifyElementPropertyValue(response, '[1].address.geo.lng', '-34.4618')
WS.verifyElementPropertyValue(response, '[1].phone', '010-692-6593 x09125')
WS.verifyElementPropertyValue(response, '[1].website', 'anastasia.net')
WS.verifyElementPropertyValue(response, '[1].company.name', 'Deckow-Crist')
WS.verifyElementPropertyValue(response, '[1].company.catchPhrase', 'Proactive didactic contingency')
WS.verifyElementPropertyValue(response, '[1].company.bs', 'synergize scalable supply-chains')

//testcase untuk method POST
response = WS.sendRequest(findTestObject('users/POST-users'))
WS.verifyResponseStatusCode(response, 201)
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

//testcase untuk method PATCH
response = WS.sendRequest(findTestObject('users/PATCH-users'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'name', 'wina')
WS.verifyElementPropertyValue(response, 'username', 'nwinas')
WS.verifyElementPropertyValue(response, 'email', 'wina@mailsac.com')
WS.verifyElementPropertyValue(response, 'address.street', 'Rawa Belong')
WS.verifyElementPropertyValue(response, 'address.suite', 'Melrose place')
WS.verifyElementPropertyValue(response, 'address.city', 'Subang')
WS.verifyElementPropertyValue(response, 'address.zipcode', '11111-0000')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '-15.1013')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '20.1496')
WS.verifyElementPropertyValue(response, 'phone', '0809-1098-4451')
WS.verifyElementPropertyValue(response, 'website', 'twitter.com')
WS.verifyElementPropertyValue(response, 'company.name', 'Twitter')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', 'Twitter is a microblogging, social networking service')
WS.verifyElementPropertyValue(response, 'company.bs', 'Explore · Who to follow · Funny Tweets · Popular videos · Popular images · Viral Tweets · Football')

//testcase untuk method PUT
response = WS.sendRequest(findTestObject('users/PUT-users'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'name', 'wina')
WS.verifyElementPropertyValue(response, 'username', 'nwinas')
WS.verifyElementPropertyValue(response, 'email', 'wina@mailsac.com')
WS.verifyElementPropertyValue(response, 'address.street', 'Rawa Belong')
WS.verifyElementPropertyValue(response, 'address.suite', 'Melrose place')
WS.verifyElementPropertyValue(response, 'address.city', 'Subang')
WS.verifyElementPropertyValue(response, 'address.zipcode', '11111-0000')
WS.verifyElementPropertyValue(response, 'address.geo.lat', '-15.1013')
WS.verifyElementPropertyValue(response, 'address.geo.lng', '20.1496')
WS.verifyElementPropertyValue(response, 'phone', '0809-1098-4451')
WS.verifyElementPropertyValue(response, 'website', 'facebook.com')
WS.verifyElementPropertyValue(response, 'company.name', 'Facebook')
WS.verifyElementPropertyValue(response, 'company.catchPhrase', 'Facebook adalah media sosial dan layanan jejaring sosial')
WS.verifyElementPropertyValue(response, 'company.bs', 'Mengikuti berita teman kini lebih cepat dari sebelumnya. • Mengetahui apa yang dilakukan teman • Berbagi pembaruan, foto, dan video')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE
response = WS.sendRequest(findTestObject('users/DELETE-users'))
WS.verifyResponseStatusCode(response, 200)
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
response = WS.sendRequest(findTestObject('photos/GET-photos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].albumId', '1')
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].title', 'accusamus beatae ad facilis cum similique qui sunt')
WS.verifyElementPropertyValue(response, '[0].url', 'https://via.placeholder.com/600/92c952')
WS.verifyElementPropertyValue(response, '[0].thumbnailUrl', 'https://via.placeholder.com/150/92c952')
WS.verifyElementPropertyValue(response, '[1].albumId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].title', 'reprehenderit est deserunt velit ipsam')
WS.verifyElementPropertyValue(response, '[1].url', 'https://via.placeholder.com/600/771796')
WS.verifyElementPropertyValue(response, '[1].thumbnailUrl', 'https://via.placeholder.com/150/771796')

//testcase untuk method POST
response = WS.sendRequest(findTestObject('photos/POST-photos'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'albumId', '26')
WS.verifyElementPropertyValue(response, 'id', '5001')
WS.verifyElementPropertyValue(response, 'title', 'One day or day one. You decide.')
WS.verifyElementPropertyValue(response, 'url', 'https://twitter.com/AnimexGojo/status/1480198982676750344/photo/1')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://twitter.com/AoTWiki/status/1474394920937000967/photo/1')

//testcase untuk method PATCH
response = WS.sendRequest(findTestObject('photos/PATCH-photos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'albumId', '1')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'The hard days are what make you stronger')
WS.verifyElementPropertyValue(response, 'url', 'https://twitter.com/AoTWiki/status/1591755703857074182/photo/1')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://twitter.com/AoTWiki/status/1597364014908116994/photo/1')

//testcase untuk method PUT
response = WS.sendRequest(findTestObject('photos/PUT-photos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'title', 'If opportunity doesn’t knock, build a door')
WS.verifyElementPropertyValue(response, 'url', 'https://twitter.com/AoTWiki/status/1597110711549046784/photo/1')
WS.verifyElementPropertyValue(response, 'thumbnailUrl', 'https://twitter.com/AoTWiki/status/1596826230170451969/photo/1')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE
response = WS.sendRequest(findTestObject('photos/DELETE-photos'))
WS.verifyResponseStatusCode(response, 200)
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
response = WS.sendRequest(findTestObject('albums/GET-albums'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].userId', '1')
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].title', 'quidem molestiae enim')
WS.verifyElementPropertyValue(response, '[1].userId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].title', 'sunt qui excepturi placeat culpa')

//testcase untuk method POST
response = WS.sendRequest(findTestObject('albums/POST-albums'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'userId', '26')
WS.verifyElementPropertyValue(response, 'id', '101')
WS.verifyElementPropertyValue(response, 'title', 'Whatever you are, be a good one')

//testcase untuk method PATCH
response = WS.sendRequest(findTestObject('albums/PATCH-albums'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'userId', '1')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'If you can dream it, you can do it')

//testcase untuk method PUT
response = WS.sendRequest(findTestObject('albums/PUT-albums'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'title', 'Impossible is just an opinion')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE
response = WS.sendRequest(findTestObject('albums/DELETE-albums'))
WS.verifyResponseStatusCode(response, 200)
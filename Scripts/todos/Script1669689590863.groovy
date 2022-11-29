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

//testcase untuk method GET posts
response = WS.sendRequest(findTestObject('todos/GET-todos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].userId', '1')
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].title', 'delectus aut autem')
WS.verifyElementPropertyValue(response, '[0].completed', 'false')
WS.verifyElementPropertyValue(response, '[1].userId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].title', 'quis ut nam facilis et officia qui')
WS.verifyElementPropertyValue(response, '[1].completed', 'false')

//testcase untuk method POST posts
response = WS.sendRequest(findTestObject('todos/POST-todos'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'userId', '26')
WS.verifyElementPropertyValue(response, 'id', '201')
WS.verifyElementPropertyValue(response, 'title', 'Work hard in silence, let your success be the noise')
WS.verifyElementPropertyValue(response, 'completed', 'false')

//testcase untuk method PATCH posts
response = WS.sendRequest(findTestObject('todos/PATCH-todos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'userId', '1')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'The miracle is not that we do this work, but that we are happy to do it')
WS.verifyElementPropertyValue(response, 'completed', 'true')

//testcase untuk method PUT posts
response = WS.sendRequest(findTestObject('todos/PUT-todos'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'title', 'Never allow a person to tell you no who doesn’t have the power to say yes')
WS.verifyElementPropertyValue(response, 'completed', 'true')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE posts
response = WS.sendRequest(findTestObject('todos/DELETE-todos'))
WS.verifyResponseStatusCode(response, 200)
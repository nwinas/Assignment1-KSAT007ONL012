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


//testcase untuk method GET comments
response = WS.sendRequest(findTestObject('comments/GET-comments'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].postId', '1')
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].name', 'id labore ex et quam laborum')
WS.verifyElementPropertyValue(response, '[0].email', 'Eliseo@gardner.biz')
WS.verifyElementPropertyValue(response, '[0].body', 'laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium')
WS.verifyElementPropertyValue(response, '[1].postId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].name', 'quo vero reiciendis velit similique earum')
WS.verifyElementPropertyValue(response, '[1].email', 'Jayne_Kuhic@sydney.com')
WS.verifyElementPropertyValue(response, '[1].body', 'est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et')


//testcase untuk method POST comments
response = WS.sendRequest(findTestObject('comments/POST-comments'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'postId', '1')
WS.verifyElementPropertyValue(response, 'id', '501')
WS.verifyElementPropertyValue(response, 'name', 'wina')
WS.verifyElementPropertyValue(response, 'email', 'wina@mailsac.com')
WS.verifyElementPropertyValue(response, 'body', 'Do what you can, with what you have, where you are')


//testcase untuk method PATCH comments
response = WS.sendRequest(findTestObject('comments/PATCH-comments'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'postId', '1')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'name', 'capricorn')
WS.verifyElementPropertyValue(response, 'email', 'capricorn@mailsac.com')
WS.verifyElementPropertyValue(response, 'body', 'this is one of the zodiac names')


//testcase untuk method PUT comments
response = WS.sendRequest(findTestObject('comments/PUT-comments'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'name', 'pinky')
WS.verifyElementPropertyValue(response, 'email', 'pinky@mailsac.com')
WS.verifyElementPropertyValue(response, 'body', 'It is never too late to be what you might have been')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE comments
response = WS.sendRequest(findTestObject('comments/DELETE-comments'))
WS.verifyResponseStatusCode(response, 200)

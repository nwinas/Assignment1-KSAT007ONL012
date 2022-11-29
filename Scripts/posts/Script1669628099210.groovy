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
response = WS.sendRequest(findTestObject('posts/GET-posts'))

WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, '[0].userId', '1')
WS.verifyElementPropertyValue(response, '[0].id', '1')
WS.verifyElementPropertyValue(response, '[0].title', 'sunt aut facere repellat provident occaecati excepturi optio reprehenderit')
WS.verifyElementPropertyValue(response, '[0].body', 'quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto')

WS.verifyElementPropertyValue(response, '[1].userId', '1')
WS.verifyElementPropertyValue(response, '[1].id', '2')
WS.verifyElementPropertyValue(response, '[1].title', 'qui est esse')
WS.verifyElementPropertyValue(response, '[1].body', 'est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla')

//testcase untuk method POST posts
response = WS.sendRequest(findTestObject('posts/POST-posts'))
WS.verifyResponseStatusCode(response, 201)
WS.verifyElementPropertyValue(response, 'userId', '101')
WS.verifyElementPropertyValue(response, 'id', '101')
WS.verifyElementPropertyValue(response, 'title', 'Assignment katalon')
WS.verifyElementPropertyValue(response, 'body', 'Tugas API')

//testcase untuk method PATCH posts
response = WS.sendRequest(findTestObject('posts/PATCH-posts'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'userId', '1')
WS.verifyElementPropertyValue(response, 'id', '1')
WS.verifyElementPropertyValue(response, 'title', 'pakai method PATCH')
WS.verifyElementPropertyValue(response, 'body', 'pakai method PATCH nih')

//testcase untuk method PUT posts
response = WS.sendRequest(findTestObject('posts/PUT-posts'))
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'title', 'pakai method PUT')
WS.verifyElementPropertyValue(response, 'body', 'pakai method PUT nih')
WS.verifyElementPropertyValue(response, 'id', '1')

//testcase untuk method DELETE posts
response = WS.sendRequest(findTestObject('posts/DELETE-posts'))
WS.verifyResponseStatusCode(response, 200)

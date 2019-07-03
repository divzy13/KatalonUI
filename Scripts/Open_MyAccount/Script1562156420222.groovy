import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Startsida/a_Mitt konto'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Sknetrafiken - Mitt konto/input_E-postadress_loginInputModelEmail'), 
    'divzy13@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sknetrafiken - Mitt konto/input_Lsenord_loginInputModelPassword'), 
    '5LtX7jVChA5rDF1tBpz7Vw==')

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Mitt konto/button_Logga in'), 5)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/div_Divya Raveendran'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/h2_Jojo-tjnster'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/h2_Mina uppgifter'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/h2_Ersttning vid frsening'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/h2_Erbjudanden'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Sknetrafiken - Mitt konto/h2_Mina uppgifter'), FailureHandling.STOP_ON_FAILURE)


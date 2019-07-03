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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.skanetrafiken.se/')

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Startsida/a_Sk resa'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Sknetrafiken - Sk resa/input_Frn_from'), 'almhult')

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Sk resa/span_lmhult station'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Sknetrafiken - Sk resa/input_Till_to'), 'malmo')

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Sk resa/span_Malm C'), 5)

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Sk resa/button_OK'), 5)

CustomKeywords.'com.JSclick.ClickusingJS'(findTestObject('Page_Sknetrafiken - Sk resa/input_Min_standard-btn find-trip'), 
    5)

WebUI.closeBrowser()


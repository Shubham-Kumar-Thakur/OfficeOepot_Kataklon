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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.officedepot.com.mx/')

WebUI.click(findTestObject('TC_Logout/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.setText(findTestObject('TC_Logout/Page_Ingresar  Office Depot Mexico/input__Correo electrnico'), 'skthakur@kognivera.com')

WebUI.setEncryptedText(findTestObject('TC_Logout/Page_Ingresar  Office Depot Mexico/input__Contrasea'), 'dopgMZS9m+2HSvTCorbjBA==')

WebUI.click(findTestObject('TC_Logout/Page_Ingresar  Office Depot Mexico/span_view-password'))

WebUI.click(findTestObject('TC_Logout/Page_Ingresar  Office Depot Mexico/button_loginButtonMaterial'))

WebUI.click(findTestObject('TC_Logout/Page_Office Depot Mexico  Compra en lnea Ar_97767d/p_Laptops'))

WebUI.click(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/strong_Hola'))

WebUI.click(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/div_popup-close'))

WebUI.mouseOver(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/label_Hola'))

WebUI.click(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/span_Salir'))

WebUI.verifyElementPresent(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/div_Marca'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/div_Procesador'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/div_Ram'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/div_Capacidad disco duro'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Logout/Page_Laptops  Office Depot Mexico/label_Ms relevante'), 0)

WebUI.closeBrowser()


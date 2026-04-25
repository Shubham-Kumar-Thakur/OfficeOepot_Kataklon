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

WebUI.click(findTestObject('TC_Login/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/img'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/h1_Iniciar sesin'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/a_Olvidaste tu contrasea'), 0)

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/a_Crear cuenta'), 0)

WebUI.click(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/input__Correo electrnico'))

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/label__Correo electrnico'), 0)

WebUI.setText(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/input__Correo electrnico'), 'skthakur@kognivera.com')

WebUI.click(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/input__Contrasea'))

WebUI.verifyElementPresent(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/label__Contrasea'), 0)

WebUI.setEncryptedText(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/input__Contrasea'), 'dopgMZS9m+2HSvTCorbjBA==')

WebUI.click(findTestObject('TC_Login/Page_Ingresar  Office Depot Mexico/button_loginButtonMaterial'))

WebUI.click(findTestObject('TC_Login/Page_Office Depot Mexico  Compra en lnea Ar_97767d/div_Hola'))

WebUI.closeBrowser()


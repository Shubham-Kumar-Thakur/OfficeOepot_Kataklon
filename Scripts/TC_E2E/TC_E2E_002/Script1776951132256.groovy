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

WebUI.click(findTestObject('E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/strong_sesin'))

WebUI.setText(findTestObject('E2E/Page_Ingresar  Office Depot Mexico/input__Correo electrnico'), 'skthakur@kognivera.com')

WebUI.setEncryptedText(findTestObject('E2E/Page_Ingresar  Office Depot Mexico/input__Contrasea'), 'dopgMZS9m+2HSvTCorbjBA==')

WebUI.click(findTestObject('E2E/Page_Ingresar  Office Depot Mexico/span_view-password'))

WebUI.click(findTestObject('E2E/Page_Ingresar  Office Depot Mexico/button_loginButtonMaterial'))

WebUI.verifyElementPresent(findTestObject('E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/span_Office Depot Mxico_ Papelera y electrnic'), 
    0)

WebUI.verifyElementPresent(findTestObject('E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/h2_Descubre los mejores productos segn tu perfi'), 
    0)

WebUI.setText(findTestObject('E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/input__Buscar por categora, producto o marca'), 
    'Hp Laptop')

WebUI.click(findTestObject('E2E/Page_Office Depot Mexico  Compra en lnea Ar_97767d/button_js_search_button'))

WebUI.verifyElementPresent(findTestObject('E2E/Page_Hp Laptop  Office Depot Mexico/label_Ms relevante'), 0)

WebUI.click(findTestObject('E2E/Page_Hp Laptop  Office Depot Mexico/h2_Laptop Gamer HP Victus NVIDIA GeForce RTX 405'))

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/div_popup-close'))

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/div_flecha-cantidad-mb'))

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/li_5'))

WebUI.verifyElementPresent(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/h2_Descripcin y caractersticas'), 
    0)

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/div_Aadir al carrito'))

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/button_Aadir proteccin'))

WebUI.click(findTestObject('E2E/Page_Laptop Gamer HP Victus NVIDIA GeForce _28bd3e/span_Mis productos'))

WebUI.verifyElementText(findTestObject('E2E/Page_Mi Carrito  Office Depot Mexico/div_Laptop Gamer HP Victus NVIDIA GeForce RTX 40'), 
    'Laptop Gamer HP Victus NVIDIA GeForce RTX 4050 Intel Core i5 16GB RAM 512GB SSD 15.6 pulgadas')

WebUI.verifyElementPresent(findTestObject('E2E/Page_Mi Carrito  Office Depot Mexico/div_114,840.00'), 0)

WebUI.verifyElementPresent(findTestObject('E2E/Page_Mi Carrito  Office Depot Mexico/input_input_quantity_2'), 0)

WebUI.verifyElementPresent(findTestObject('E2E/Page_Mi Carrito  Office Depot Mexico/div_Total'), 0)

WebUI.closeBrowser()


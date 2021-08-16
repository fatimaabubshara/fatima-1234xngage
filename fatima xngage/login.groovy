package newpackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {


	//@Keyword
	public  void login_process(String msg) {
		// if the required field are empty
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-userName'), ' ')
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-password') , '')
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/button_Sign In'))
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/span_required'))
		
		
		
		// if the password field  is empty
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-userName'), 'cooperma')
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-password') , '')
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/button_Sign In'))
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/span_required'))
		
		
		// if the username  field  is empty
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-userName'), '')
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-password') , '8SQVv/p9jVRYfSV/eMGvjg==')
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/button_Sign In'))
		
		
		// if we enter invalid username and password
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-userName'), 'ffff')
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-password') , 'kijfhh')
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/button_Sign In'))
		WebUI.click( findTestObject('Object Repository/Page_Sign In  Famous Supply/div_Invalid UsernamePassword combination') )
		
		
		// if we enter valid email and password
		WebUI.setText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-userName'), 'cooperma')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In  Famous Supply/input_(optional)_SigninPage-password'),
			'8SQVv/p9jVRYfSV/eMGvjg==')
		
		WebUI.click(findTestObject('Object Repository/Page_Sign In  Famous Supply/button_Sign In'))
		
		
		WebUI.click(findTestObject('Object Repository/Page_Home  Famous Supply/span_Register or Sign In_menu-icon icon-Use_35c59a'))
		
		WebUI.click(findTestObject('Object Repository/Page_My Account  Famous Supply/span_Account Management'))
		
		WebUI.click(findTestObject('Object Repository/Page_My Account  Famous Supply/button_Sign Out'))


	}
}

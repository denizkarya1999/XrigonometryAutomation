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
import java.lang.Thread

Windows.startApplicationWithTitle('C:\\Users\\deniz\\source\\Xrigonometry\\bin\\Release\\net6.0-windows\\Xrigonometry.exe', 
    '')

Windows.click(findWindowsObject('Object Repository/About'))

Thread.sleep(5000)

Windows.sendKeys(findWindowsObject('Object Repository/About'), Keys.chord(Keys.ESCAPE))

Windows.click(findWindowsObject('Object Repository/Sphere'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Circle'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Hexagon'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Triangle'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Pentagon'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Polygon'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Rectangle'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Right Triangle'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/CloseButton'))


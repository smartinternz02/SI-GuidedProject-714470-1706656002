import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();

suiteProperties.put('id', 'Test Suites/CURA_AppointmentConfirmation_TestSuite_004/TS_CURA_MakeAppointment_Modes')
suiteProperties.put('name', 'TS_CURA_MakeAppointment_Modes')
suiteProperties.put('description', '')
suiteProperties.put('rerunTestFailImmediately', 'true')
suiteProperties.put('retryCount', '3')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("G:\\katolon\\CURAHealthCareSevice_Katalon_ST_GITHUB-main\\Reports\\20240131_142907\\CURA_AppointmentConfirmation_TestSuite_004\\TS_CURA_MakeAppointment_Modes\\20240131_142908\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/CURA_AppointmentConfirmation_TestSuite_004/TS_CURA_MakeAppointment_Modes', suiteProperties, new File("G:\\katolon\\CURAHealthCareSevice_Katalon_ST_GITHUB-main\\Reports\\20240131_142907\\CURA_AppointmentConfirmation_TestSuite_004\\TS_CURA_MakeAppointment_Modes\\20240131_142908\\testCaseBinding"))

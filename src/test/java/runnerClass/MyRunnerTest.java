package runnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import Utils.DriverManager;
import Utils.GlobalParams;
import Utils.ServerManager;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"
				, "html:target/cucumber"
				, "summary"
				, "de.monochromata.cucumber.report.PrettyReports:target/cucumber-html-reports"}
		,features = {"src/test/java/resources"}
		,glue = {"stepdefinitons"}
		,snippets = CAMELCASE
				,dryRun=false
				,monochrome=true
				,tags = "@Regression"
		)




public class MyRunnerTest {

	@BeforeClass
	public static void initialize() throws Exception {
		GlobalParams params = new GlobalParams();
		params.initializeGlobalParams();

		ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
				+ params.getDeviceName());

	//	new ServerManager().startServer();
		new DriverManager().initializeDriver();
	}

	@AfterClass
	public static void quit(){
		DriverManager driverManager = new DriverManager();
		if(driverManager.getDriver() != null){
			driverManager.getDriver().quit();
			driverManager.setDriver(null);
		}
	//	ServerManager serverManager = new ServerManager();
	//	if(serverManager.getServer() != null)
	//	{
	//		serverManager.getServer().stop();
	//	}
	}
}

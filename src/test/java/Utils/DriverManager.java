package Utils;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverManager {
    private static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AndroidDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AndroidDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
    	AndroidDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();
		DesiredCapabilities caps = new DesiredCapabilities();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                
                    	System.out.println(new CapabilitiesManager().getCaps());
                    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }
	

}
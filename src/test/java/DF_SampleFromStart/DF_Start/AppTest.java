package DF_SampleFromStart.DF_Start;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;




/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( AppTest.class );
	}

	//    /**
	//     * Rigourous Test :-)
	//     */
	//    public void testApp()
	//    {
	//  assertTrue( true );
	//   // MyRunnerTest mrt=new MyRunnerTest();
	//  //  mrt.i
	//    
	//    }


	//	@org.junit.Test
	//	public void testMyRunner1() throws InterruptedException, MalformedURLException {
	//
	//
	//		DesiredCapabilities capabilities = new DesiredCapabilities();
	//		//         capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	//		//         capabilities.setCapability(MobileCapabilityType.UDID, "YOUR_DEVICE_UDID");
	//		//         capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	//		//         capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
	//		//         capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
	//		//          Initialize driver
	//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//
	//		driver.resetApp();
	//
	//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//
	//		Boolean val=driver.findElement(By.id("onetrust-accept-btn-handler")).isDisplayed();
	//
	//		if(val)
	//		{
	//			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	//		}
	//
	//		//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]")
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")).click();
	//
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).clear();
	//
	//		//  driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("12312");
	//
	//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//
	//		//driver.findElement(By.id("com.ga.loyalty.android.nectar.activities:id/editTextView")).click();
	//
	//		//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//
	//
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText")).sendKeys("12312");
	//
	//
	//		//	MobileElement element = (MobileElement)driver.findElementByAccessibilityId("com.ga.loyalty.android.nectar.activities:id/editTextView");
	//		//	element.sendKeys("12312");
	//
	//		driver.hideKeyboard();
	//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
	//
	//		String errorTextValue=driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")).getText();
	//
	//		Assert.assertEquals(errorTextValue, "Enter a Nectar card number that has 11 numbers");
	//
	//	}

//	public void testMyRunner2() throws Exception {
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//
//
//		By loginButton=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
//		By acceptCookieStartingPage=By.id("onetrust-accept-btn-handler");
//
//		By linkAccountCTA=By.id("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn");
//
//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//
//		driver.resetApp();
//
//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//
//		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]"); 
//		el1.click(); 
//		//		MobileElement el2 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/existingUserButton"); 
//		//		el2.click();
//		driver.findElement(loginButton).click();
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		MobileElement el3 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editTextView"); 
//		el3.sendKeys("10087802018"); 
//		MobileElement el4 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/progressBtn"); 
//		el4.click(); 
//
//
//		waitForVisibility(driver, acceptCookieStartingPage);
//		driver.findElement(acceptCookieStartingPage).click();
//
//
//
//		MobileElement el6 = (MobileElement) driver.findElementById("password"); 
//		el6.sendKeys("Nectar123"); 
//
//		driver.hideKeyboard();
//
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//		MobileElement el7 = (MobileElement) driver.findElementByXPath("(//android.view.View[@resource-id='loginForm']//android.widget.Button)[2]"); 
//		el7.click();
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		//		By loginButtonAfterEnteringPassword=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.EditText");
//		//
//		//		//Click Login Button
//		//		driver.findElement(loginButtonAfterEnteringPassword).click();
//
//
//		//2fa page button
//
//		//	MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[6]/android.view.View[1]/android.view.View[2]/android.widget.EditText");
//		//	el8.sendKeys("944602"); 
//		//android.view.ViewGroup/android.widget.EditText
//
//		//	MobileElement el8 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup/android.widget.EditText");
//		//	el8.click();
//		//	el8.sendKeys("944602");
//		//	el8.sendKeys("944602"); 
//
//		MobileElement el8 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editTextView"); 
//		el6.sendKeys("944602"); 
//
//		driver.hideKeyboard();
//
//		MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='OtpForm']/android.view.View/android.widget.Button");
//		el9.click(); 
//		//MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.Button");
//		//el9.click(); 
//
//		//android.view.ViewGroup/android.view.ViewGroup/android.widget.Button
//
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//
//		Boolean val=driver.findElement(By.id("com.ga.loyalty.android.nectar.activities.debug:id/closeBtn")).isDisplayed();
//
//		if(val)
//		{
//			MobileElement el10 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/closeBtn"); 
//			el10.click(); 
//		}
//
//
//		MobileElement el13 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editImg"); 
//		el13.click(); 
//
//
//		MobileElement el14 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/searchBox");
//		el14.sendKeys("british Airways"); 
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		MobileElement el15 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/title"); 
//		el15.click();
//
//		//com.ga.loyalty.android.nectar.activities.debug:id/headlineView
//		//android.widget.Button[1]
//		//android.widget.Button[2]
//
//
//		scrollToElement(driver, linkAccountCTA);
//
//		MobileElement el16 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn"); 
//		String buttonValue=el16.getText();
//		System.out.println("Convert Points" +buttonValue);
//
//
//
//		if(buttonValue.equalsIgnoreCase("Link accounts")){
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//
//			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//
//			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//
//
//			MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[1]");
//
//			el23.sendKeys("audit26@avios.com"); 
//			MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[2]"); 
//			el24.sendKeys("test123"); 
//			MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button"); 
//
//			el25.click();
//			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		}
//
//
//		By tbirdSiteNectarPointsEditText=By.xpath("//android.webkit.WebView/android.view.View/android.widget.EditText[1]");
//
//		By tbirdSiteAviosPointsEditText=By.xpath("//android.webkit.WebView/android.view.View/android.widget.EditText[1]");
//
//
//		if(buttonValue.equalsIgnoreCase("Convert Points")) {
//
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//			//	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//			scrollToElement(driver, tbirdSiteNectarPointsEditText);
//
//			driver.findElement(tbirdSiteNectarPointsEditText).click();
//			driver.findElement(tbirdSiteNectarPointsEditText).sendKeys("400"); 
//
//
//			driver.hideKeyboard();
//
//			driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.widget.Button")).click();
//
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//
//			driver.findElement(By.xpath("//android.view.ViewGroup/android.widget.EditText")).sendKeys("944602");
//
//			driver.hideKeyboard();
//			driver.findElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
//
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//			By exploreMoreNectarPoints=By.xpath("//android.widget.Button[@content-desc='Explore more Nectar partners']");
//
//			waitForVisibility(driver, exploreMoreNectarPoints);
//
//			scrollToElement(driver, exploreMoreNectarPoints);
//
//
//			driver.findElement(exploreMoreNectarPoints).click();
//
//        }
//		}



		//		//android.view.View/android.widget.EditText[1]
		//		
		//		//el16.click(); 
		//
		//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//
		//		MobileElement el17 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/continueBtn");
		//		el17.click();
		//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//
		//		MobileElement el18 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/secondaryCtaBtn"); 
		//		el18.click(); 
		//
		//		//driver.navigate().back(); 
		//
		//		MobileElement el19 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn"); 
		//		el19.click(); 
		//		MobileElement el20 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn"); 
		//		el20.click(); 
		//
		//		MobileElement el21 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/continueBtn"); 
		//
		//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		//
		//		el21.click(); 
		//		MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[1]");
		//		
		//		//android.webkit.WebView/android.view.View/android.view.View/android.widget.EditText[1]
		//		
		//		
		//		el23.sendKeys("audit26@avios.com"); 
		//		MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[2]"); 
		//		el24.sendKeys("test123"); 
		//		MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button"); 
		//		//android.webkit.WebView/android.view.View/android.view.View/android.widget.Button
		//		
		//		
		//		el25.click();
		//
		//


	
	//	@org.junit.Test
	//	public void testMyRunner2() throws InterruptedException, MalformedURLException {
	//
	//
	//		DesiredCapabilities capabilities = new DesiredCapabilities();
	//		//         capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
	//		//         capabilities.setCapability(MobileCapabilityType.UDID, "YOUR_DEVICE_UDID");
	//		//         capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
	//		//         capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
	//		//         capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
	//		//          Initialize driver
	//		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//
	//		driver.resetApp();
	//
	//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//
	//		By acceptCookieStartingPage=By.id("onetrust-accept-btn-handler");
	//		By loginButton=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
	//		By cardNumberEditText=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	//		By continueButton=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button");
	//		By acceptCookieButton=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button[2]");
	//	
	//		By passwordEditText=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]/android.view.View/android.view.View[2]/android.widget.EditText");
	//
	//		By loginButtonAfterEnteringPassword=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.Button");
	//		
	//		By twoFA=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText");
	//		
	//		By saveToGooglePlayCrossButton=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageButton");
	//
	//		By continueButton2FAPage=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.Button");
	//
	//		
	//		
	//		Boolean val=driver.findElement(acceptCookieStartingPage).isDisplayed();
	//
	//		if(val)
	//		{
	//			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	//		}
	//
	//		driver.findElement(loginButton).click();
	//
	//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//
	//
	//		driver.findElement(cardNumberEditText).clear();
	//
	//		driver.findElement(cardNumberEditText).sendKeys("10087802018");
	//
	//		driver.hideKeyboard();
	//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//
	//		driver.findElement(continueButton).click();
	//
	//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//
	//		
	//		Boolean acSP=driver.findElement(acceptCookieButton).isDisplayed();
	//
	//		if(acSP)
	//		{
	//			driver.findElement(acceptCookieButton).click();
	//		}
	//		
	//		
	//		//	password
	//		driver.findElement(passwordEditText).click();
	//		driver.findElement(passwordEditText).sendKeys("Nectar123");
	//		
	//		
	//		//Click Login Button
	//		driver.findElement(loginButtonAfterEnteringPassword).click();
	//
	//		//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[5]/android.widget.Button
	//		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//
	//
	//		
	//		Boolean twoFAPage=driver.findElement(twoFA).isDisplayed();
	//
	//		if(twoFAPage)
	//		{
	//			driver.findElement(twoFA).sendKeys("706783");
	//			
	//			driver.findElement(continueButton2FAPage).click();
	//
	//			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	//		}
	//		
	//	
	//		Boolean s2gp=driver.findElement(saveToGooglePlayCrossButton).isDisplayed();
	//
	//		if(s2gp)
	//		{
	//			driver.findElement(saveToGooglePlayCrossButton).click();
	//		}
	//		
	//		//	com.ga.loyalty.android.nectar.activities:id/greetingsText
	//		//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[1]
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[1]"))
	//		.isDisplayed();
	//
	//
	//
	//		//com.ga.loyalty.android.nectar.activities:id/valueTickerTextView
	//		///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[2]"))
	//		.isDisplayed();
	//
	//
	//
	//		//com.ga.loyalty.android.nectar.activities:id/pointsWorthTitle
	//		///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[3]
	//
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[3]"))
	//		.isDisplayed();
	//
	//		//com.ga.loyalty.android.nectar.activities:id/spendPointsButton
	//		///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.Button
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.Button"))
	//		.isDisplayed();
	//
	//
	//		//	com.ga.loyalty.android.nectar.activities:id/accountButton
	//		//	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageButton
	//		driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageButton"))
	//		.isDisplayed();
	//
	//	}

	public void waitForVisibility(AndroidDriver driver, By byValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(byValue));
	}

	public void click(AndroidDriver driver, By byValue) {
		waitForVisibility(driver,byValue);
		driver.findElement(byValue).click();
	}

	public void sendKeys(AndroidDriver driver,By byValue, String txt) {
		waitForVisibility(driver,byValue);
		driver.findElement(byValue).sendKeys(txt);
	}


	public String getAttribute(AndroidDriver driver,By byValue, String attribute) {
		waitForVisibility(driver,byValue);
		// return e.getAttribute(attribute);
		return driver.findElement(byValue).getAttribute(attribute);
	}

	//	
	//	public String scrolldown(AndroidDriver driver,By byValue, String attribute) {
	//
	//		
	//		
	//	While (driver.findElements(By.id("onetrust-accept-btn-handler")).size()=0){
	//
	//		size = driver.manage().window().getSize();
	//		int starty = (int) (size.height * 0.80);
	//		int endy = (int) (size.height * 0.20);
	//		int startx = size.width / 2;
	//		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
	//
	//		driver.swipe(startx, starty, startx, endy, 3000);
	//		Thread.sleep(2000);
	//		driver.swipe(startx, endy, startx, starty, 3000);
	//		Thread.sleep(2000);
	//		}
	//	}
	//	

	public static boolean scrollToElement (AndroidDriver driver,By by) throws Exception {
		boolean isFoundTheElement = driver.findElements(by).size() > 0;
		while (isFoundTheElement == false) {
			swipeVertical(driver,0.8, 0.1, 0.5, 2000);
			isFoundTheElement = driver.findElements(by).size() > 0;
		}
		return isFoundTheElement;
	}

	public static void swipeVertical (
			AndroidDriver driver,  double startPercentage, double finalPercentage, double anchorPercentage, int duration)
					throws Exception {
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * finalPercentage);
		getTouchAction(driver).press(PointOption.point(anchor, startPoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofMillis(duration)))
		.moveTo(PointOption.point(anchor, endPoint)).release().perform();
	}
	public static TouchAction getTouchAction (AndroidDriver driver) {
		return new TouchAction(driver);
	}





	@org.junit.Test
	public void testMyRunner3() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		By cookieFirstpage=By.id("com.ga.loyalty.android.nectar.activities.debug:id/btn_accept_cookies");

		By envSelection=By.id("com.ga.loyalty.android.nectar.activities.debug:id/environment");

		By preprodAppSelection =By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
		By loginButtonFirstPage=By.id("com.ga.loyalty.android.nectar.activities.debug:id/existingUserButton");

		By registerButtonFirstPage=By.id("com.ga.loyalty.android.nectar.activities.debug:id/progressBtn");

	//	By acceptCookiesInLoginPage=By.xpath("//android.widget.Button[@content-desc='Accept All Cookies']");
		By acceptCookiesInLoginPage=By.id("onetrust-accept-btn-handler");


		//By enterEmailIdInPage=By.xpath("//android.webkit.WebView[@content-desc=\"Nectar Log in\"]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View[2]/android.widget.EditText");

		
		By enterEmailIdInPage=By.id("username");
		By enterPasswordPage=By.id("password");

	//	By enterPasswordPage=By.xpath("//android.webkit.WebView[@content-desc=\"Nectar Log in\"]/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.widget.EditText");

		By loginButton=By.xpath("//android.widget.Button[@content-desc=\"Log in\"]");

		By identity2FAText=By.xpath("//android.view.View[@content-desc=\"We've sent you a code\"]");

		By identity2FAEditTextBox=By.xpath("//android.webkit.WebView[@content-desc=\"Nectar Log in\"]/android.view.View[2]/android.view.View[5]/android.view.View[1]/android.view.View[2]/android.widget.EditText");

		By continueButton=By.xpath("//android.widget.Button[@content-desc=\"Continue\"]");

		//3x points
		By closeButtonInHomepagePopup=By.id("com.ga.loyalty.android.nectar.activities.debug:id/closeBtn");

		By spendPoints=By.id("com.ga.loyalty.android.nectar.activities.debug:id/spendPointsButton");

		By yourAccountButton=By.xpath("//android.widget.ImageButton[@content-desc=\"Your account\"]");



		//	By loginButton=By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
		//	By acceptCookieStartingPage=By.id("onetrust-accept-btn-handler");

		By linkAccountCTA=By.id("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		driver.resetApp();

		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.findElement(cookieFirstpage).click();

		driver.findElement(envSelection).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(preprodAppSelection).click();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);


		driver.findElement(loginButtonFirstPage).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(acceptCookiesInLoginPage).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.findElement(enterEmailIdInPage).click();
		driver.findElement(enterEmailIdInPage).sendKeys("amatre058@yopmail.com");
		driver.hideKeyboard();

		driver.findElement(enterPasswordPage).click();
		driver.findElement(enterPasswordPage).sendKeys("Nectar123@");
		driver.hideKeyboard();

		driver.findElement(loginButton).click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);



		Boolean identity2FAPresent=driver.findElement(identity2FAText).isDisplayed();

		if(identity2FAPresent)
		{
			driver.findElement(identity2FAEditTextBox).click();
			driver.findElement(identity2FAEditTextBox).sendKeys("123456");
			driver.hideKeyboard();

			driver.findElement(continueButton).click();
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		}



		Boolean homePagePopupPresent=driver.findElement(closeButtonInHomepagePopup).isDisplayed();

		if(identity2FAPresent)
		{
			driver.findElement(closeButtonInHomepagePopup).click();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}

		
		
		Boolean spenPointsPresent=driver.findElement(spendPoints).isDisplayed();

		if(spenPointsPresent)
		{
			assertEquals("Spend points present in Home page",true, true);
		}
		else
		{
			assertEquals("Spend points not present in Home page",true, false);
		}
		
		
		
		Boolean accountSettingsPresent=driver.findElement(spendPoints).isDisplayed();

		if(accountSettingsPresent)
		{
			assertEquals("Account settings button is present in Home page",true, true);
		}
		else
		{
			assertEquals("Account settings button is not present in Home page",true, false);
		}
		
	}
}


//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		MobileElement el3 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editTextView"); 
//		el3.sendKeys("10087802018"); 
//		MobileElement el4 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/progressBtn"); 
//		el4.click(); 
//
//
//		waitForVisibility(driver, acceptCookieStartingPage);
//		driver.findElement(acceptCookieStartingPage).click();
//
//
//
//		MobileElement el6 = (MobileElement) driver.findElementById("password"); 
//		el6.sendKeys("Nectar123"); 
//
//		driver.hideKeyboard();
//
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//		MobileElement el7 = (MobileElement) driver.findElementByXPath("(//android.view.View[@resource-id='loginForm']//android.widget.Button)[2]"); 
//		el7.click();
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//
//		MobileElement el8 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editTextView"); 
//		el6.sendKeys("944602"); 
//
//		driver.hideKeyboard();
//
//		MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.view.View[@resource-id='OtpForm']/android.view.View/android.widget.Button");
//		el9.click(); 
//		//MobileElement el9 = (MobileElement) driver.findElementByXPath("//android.widget.Button");
//		//el9.click(); 
//
//		//android.view.ViewGroup/android.view.ViewGroup/android.widget.Button
//
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//
//		Boolean val=driver.findElement(By.id("com.ga.loyalty.android.nectar.activities.debug:id/closeBtn")).isDisplayed();
//
//		if(val)
//		{
//			MobileElement el10 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/closeBtn"); 
//			el10.click(); 
//		}
//
//
//		MobileElement el13 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/editImg"); 
//		el13.click(); 
//
//
//		MobileElement el14 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/searchBox");
//		el14.sendKeys("british Airways"); 
//
//		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		MobileElement el15 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/title"); 
//		el15.click();
//
//		//com.ga.loyalty.android.nectar.activities.debug:id/headlineView
//		//android.widget.Button[1]
//		//android.widget.Button[2]
//
//
//		scrollToElement(driver, linkAccountCTA);
//
//		MobileElement el16 = (MobileElement) driver.findElementById("com.ga.loyalty.android.nectar.activities.debug:id/ctaBtn"); 
//		String buttonValue=el16.getText();
//		System.out.println("Convert Points" +buttonValue);
//
//
//
//		if(buttonValue.equalsIgnoreCase("Link accounts")){
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//
//			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//
//			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//
//
//			MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[1]");
//
//			el23.sendKeys("audit26@avios.com"); 
//			MobileElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.EditText[2]"); 
//			el24.sendKeys("test123"); 
//			MobileElement el25 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.widget.Button"); 
//
//			el25.click();
//			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//		}
//
//
//		By tbirdSiteNectarPointsEditText=By.xpath("//android.webkit.WebView/android.view.View/android.widget.EditText[1]");
//
//		By tbirdSiteAviosPointsEditText=By.xpath("//android.webkit.WebView/android.view.View/android.widget.EditText[1]");
//
//
//		if(buttonValue.equalsIgnoreCase("Convert Points")) {
//
//			driver.findElementByXPath("//android.widget.Button[1]").click(); 
//			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//			//	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//
//			scrollToElement(driver, tbirdSiteNectarPointsEditText);
//
//			driver.findElement(tbirdSiteNectarPointsEditText).click();
//			driver.findElement(tbirdSiteNectarPointsEditText).sendKeys("400"); 
//
//
//			driver.hideKeyboard();
//
//			driver.findElement(By.xpath("//android.webkit.WebView/android.view.View/android.widget.Button")).click();
//
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//
//
//			driver.findElement(By.xpath("//android.view.ViewGroup/android.widget.EditText")).sendKeys("944602");
//
//			driver.hideKeyboard();
//			driver.findElement(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
//
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//			By exploreMoreNectarPoints=By.xpath("//android.widget.Button[@content-desc='Explore more Nectar partners']");
//
//			waitForVisibility(driver, exploreMoreNectarPoints);
//
//			scrollToElement(driver, exploreMoreNectarPoints);
//
//
//			driver.findElement(exploreMoreNectarPoints).click();
//
//
//		}
//}






	

package Utils;

import java.io.IOException;
import java.util.Properties;

public class GlobalParams {
	private static ThreadLocal<String> platformName = new ThreadLocal<String>();
	private static ThreadLocal<String> udid = new ThreadLocal<String>();
	private static ThreadLocal<String> deviceName = new ThreadLocal<String>();
	private static ThreadLocal<String> systemPort = new ThreadLocal<String>();
	private static ThreadLocal<String> chromeDriverPort = new ThreadLocal<String>();
	private static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
	private static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();
	private static ThreadLocal<String> platformVerison = new ThreadLocal<String>();
	private static ThreadLocal<String> automationName = new ThreadLocal<String>();


	public void setAutomationName(String automationNamevalue){
		automationName.set(automationNamevalue);
	}

	public String getAutomationName(){
		return automationName.get();
	}


	public void setPlatformName(String platformName1){
		platformName.set(platformName1);
	}

	public String getPlatformName(){
		return platformName.get();
	}

	public String getUDID() {
		return udid.get();
	}

	public void setUDID(String udid2) {
		udid.set(udid2);
	}

	public String getDeviceName() {
		return deviceName.get();
	}

	public void setDeviceName(String deviceName2) {
		deviceName.set(deviceName2);
	}

	public String getSystemPort() {
		return systemPort.get();
	}

	public void setSystemPort(String systemPort2) {
		systemPort.set(systemPort2);
	}

	public String getChromeDriverPort() {
		return chromeDriverPort.get();
	}

	public void setChromeDriverPort(String chromeDriverPort2) {
		chromeDriverPort.set(chromeDriverPort2);
	}

	public String getWdaLocalPort() {
		return wdaLocalPort.get();
	}

	public void setWdaLocalPort(String wdaLocalPort2) {
		wdaLocalPort.set(wdaLocalPort2);
	}

	public String getWebkitDebugProxyPort() {
		return webkitDebugProxyPort.get();
	}

	public void setWebkitDebugProxyPort(String webkitDebugProxyPort2) {
		webkitDebugProxyPort.set(webkitDebugProxyPort2);
	}
	public void setPlatformVersion(String platformVersion1){
		platformVerison.set(platformVersion1);
	}

	public String getPlatformVersion(){
		return platformVerison.get();
	}
	 public void initializeGlobalParams() throws IOException{
	        GlobalParams params = new GlobalParams();
			Properties props = new PropertyManager().getProps();

	        params.setPlatformName(System.getProperty("platformName", "Android"));
	        params.setUDID(System.getProperty("udid", ""));
	        params.setDeviceName(System.getProperty("deviceName", "Pixel"));
	
	        
//			params.setPlatformVersion(System.getProperty("platformVersion", props.getProperty("PlatformVersion")));
//			params.setDeviceName(System.getProperty("deviceName", props.getProperty("DeviceName")));
//			params.setAutomationName(System.getProperty("automationName", props.getProperty("iOSAutomationName")));

	        switch(params.getPlatformName()){
	            case "Android":
	                params.setSystemPort(System.getProperty("systemPort", "10000"));
	                params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
	                
	    			params.setAutomationName(System.getProperty("automationName", props.getProperty("androidAutomationName")));

	                break;
	            case "iOS":
	                params.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
	                params.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
	                
	    			params.setAutomationName(System.getProperty("automationName", props.getProperty("iOSAutomationName")));

	                break;
	            default:
	                throw new IllegalStateException("Invalid Platform Name!");
	        }
	    }
	
	
//	public void initializeGlobalParams() throws IOException{
//		GlobalParams params = new GlobalParams();
//		Properties props = new PropertyManager().getProps();
//
//		params.setPlatformName(System.getProperty("platformName", props.getProperty("PlatformName")));
//		params.setPlatformVersion(System.getProperty("platformVersion", props.getProperty("PlatformVersion")));
//		params.setDeviceName(System.getProperty("deviceName", props.getProperty("DeviceName")));
//		params.setAutomationName(System.getProperty("automationName", props.getProperty("AutomationName")));
//
//		
//		//       System.out.println("platfornname from "+props.getProperty("PlatformName"));
//		//      System.out.println("params getplatformName from "+params.getPlatformName());
//
//		//        params.setPlatformName(System.getProperty("platformName", "Android"));
//		//        params.setPlatformVersion(System.getProperty("platformVersion", "8"));
//		//	        params.setUDID(System.getProperty("udid", ""));
//		//        params.setDeviceName(System.getProperty("deviceName", "Pixel"));
//
//		//        params.setPlatformName(System.getProperty("platformName", "iOS"));
//		//      params.setPlatformVersion(System.getProperty("platformVersion", "13.6"));
//		//     params.setUDID(System.getProperty("udid", ""));
//		//     params.setDeviceName(System.getProperty("deviceName", "iPhone 11"));
//
//		switch(params.getPlatformName()){
//		case "Android":
//			params.setSystemPort(System.getProperty("systemPort", "10000"));
//			params.setChromeDriverPort(System.getProperty("chromeDriverPort", "11000"));
//			break;
//		case "iOS":
//			params.setWdaLocalPort(System.getProperty("wdaLocalPort", "10001"));
//			params.setWebkitDebugProxyPort(System.getProperty("webkitDebugProxyPort", "11001"));
//			break;
//		default:
//			throw new IllegalStateException("Invalid Platform Name!");
//		}
//	}
}



package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
    private static Properties props = new Properties();
    TestUtils utils = new TestUtils();

    public Properties getProps() throws IOException {
        InputStream is = null;
        String propsFileName = "config.properties";


        if(props.isEmpty()){
            try{
                utils.log().info("loading config properties");
				String configPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
				+File.separator + "java" + File.separator + "resources" + File.separator + propsFileName;
                FileInputStream ip= new FileInputStream(configPath);

				props.load(ip);
            
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Failed to load config properties. ABORT!!" + e.toString());
                throw e;
            } finally {
                if(is != null){
                    is.close();
                }
            }
        }
       return props;
    }
}
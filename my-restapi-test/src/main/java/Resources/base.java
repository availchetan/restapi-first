package Resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public WebDriver InitializeDriver() throws Exception
	{
try {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\chetan\\Maven\\my-app\\src\\main\\java\\Resources\\data.properties");
	/*String respath = "/my-app/src/main/java/Resources/data.properties";
	InputStream in = base.class.getResourceAsStream(respath);
	if ( in == null )
	    throw new Exception("resource not found: " + respath);8*/
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chetan\\work\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
		}
		
		

			else if(browserName.equals("firefox")){
				//WindowsUtils.tryToKillByName("firefox.exe");
				System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\chetan\\work\\geckodriver.exe");
				driver= new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
			}
		
			else if(browserName.equals("ie")){
				System.setProperty("webdriver.internetexplorerdriver.driver", "C:\\Users\\chetan\\work\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				////Set the Implicit Wait time Out to 10 Seconds
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
			}
		
			/*/else if(browserName.equals("htmlunit")){
				System.setProperty("webdriver.htmlunitdriver.driver", "C:\\Users\\chetan\\work\\IEDriverServer.exe");
				driver= new HtmlUnitDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
			}*/
		
	
		//else if(browserName.equals("chrome")){
		/*    FileInputStream fis= new FileInputStream
		 * prop.load(fis);
		 * prop.load(fis);
		String UserName=prop.getProperty("UserID");
		
		create page object and call its method
		methodname.sendKeys(UserName)
		 *   Properties prop= new Properties(driver);
		 *   
		 *   JavaScriptExecutor js=   (JavaScriptExecutor)driver; 
		 *   String script="return document.getElementById(\"from place name\").value;";
		 *   String text=(String)js.executerScript(Script);
		 *   while(!text.equalsIgnoreCase("Expected value")
		 *   i++;
		 *   Create object of page and call the element by nameYouProvided
		 *   .sendKeys(KEY.DOWN)
		 *   text=(String)js.executerScript(Script);
		 *   sop(text);
		 *   if (i>10) break; loop
		 *   if i < 10, element found 
		 *   else element not found
		 *   
		 *    
		 *   
		 *   
		 *      DesiredCapabilities dc=DesiredCapabilities.Firefox;
		 *      dc.acceptInsecureCerts();
		 *      dc.setCapability(capacityType.ACCEPT,true);//should add more capability
		 *      Firefoxoptions f= new Firefoxoptions(),
		 *      f.merge(dc)
		 * 
		 * 
		 * */
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\chetan\\Downloads\\AImportant\\chromedriver.exe");
		// driver= new ChromeDriver();//
	
	}
	 catch(NullPointerException e){System.out.println(e);}  
	
	  finally{
		  System.out.println("finally block is always executed in base program");
	  }
return driver;  
	
	}
	
	public void CloseDriver() {
	
		
		
	}

}

package com.mycompany.app;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import Resources.base;


public class HomePageTest extends base {
	

	
	@SuppressWarnings("finally")
	public WebDriver basePageNavigation() throws Exception
	{
	
		driver=InitializeDriver();
		try {
			Properties prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\chetan\\Maven\\my-app\\src\\main\\java\\Resources\\data.properties");

			prop.load(fis);
			String urlName=prop.getProperty("url");
			driver.get(urlName);
			driver.manage().window().maximize();
	
	}
		 catch(NullPointerException e){System.out.println(e);}
		finally {return driver;}
		
	}
		
		/*public static File captureElementBitmap(WebElement element) throws IOException{
		//Get the WrapsDriver of the WebElement

		WrapsDriver wrapsDriver = (WrapsDriver) element;
		//Get the entire Screenshot from the driver of passed WebElement
		File screen = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).
		getScreenshotAs(OutputType.FILE);
		//Create an instance of Buffered Image from captured screenshot
		BufferedImage img = ImageIO.read(screen);
		// Get the Width and Height of the WebElement using
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		//Create a rectangle using Width and Height
		Rectangle rect = new Rectangle(width, height);
		//Get the Location of WebElement in a Point.
		//This will provide X & Y co-ordinates of the WebElement
		org.openqa.selenium.Point p = element.getLocation();
		//Create image by for element using its location and size.
		//This will give image data specific to the WebElement
		BufferedImage dest = img.getSubimage(p.getX(), p.getY(), rect.width,
		rect.height);
		//Write back the image data for element in File object
		ImageIO.write(dest, "png", screen);
		//Return the File object containing image data
		return screen;
		}
		
	/*	public void testHTML5VideoPlayer() throws Exception {
			File scrFile = null;
			//Get the HTML5 Video Element
			WebElement videoPlayer = driver.findElement(By.id("vplayer"));
			//We will need a JavaScript Executor for interacting
			//with Video Element's
			//methods and properties for automation
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			//Get the Source of Video that will be played in Video Player
			String source = (String) jsExecutor.executeScript("return arguments[0].currentSrc;", videoPlayer);
			//Get the Duration of Video
			long duration = (Long) jsExecutor.executeScript("return arguments[0].duration", videoPlayer);
			System.out.println(duration);
			//Verify Correct Video is loaded and duration
			//Assert.assertEquals("http://html5demos.com/assets/dizzy.mp4", source);
			//Assert.assertEquals(25, duration);
			//Play the Video
			jsExecutor.executeScript("return arguments[0].play()",
			videoPlayer);
			Thread.sleep(5000);
			//Pause the video
			jsExecutor.executeScript("arguments[0].pause()", videoPlayer);
			//Take a screen-shot for later verification
			scrFile = ((TakesScreenshot)driver).getScreenshotAs
			(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\pause_play.png"));
		}*/
		
	
		
		 
	

	

public String usercred() throws IOException {
	
	try {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\chetan\\Maven\\my-app\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);
		String username=prop.getProperty("username");
		return username;
}
catch(NullPointerException e){System.out.println(e);}
	return null;  
}
	
	             public String passcred() throws IOException {
		
		            try {
			Properties prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\Users\\chetan\\Maven\\my-app\\src\\main\\java\\Resources\\data.properties");
            prop.load(fis);
			String password=prop.getProperty("password");
			return password;
		            }
	              catch(NullPointerException e){System.out.println(e);}
					return null;
		            
	             }         


}
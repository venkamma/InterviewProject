package register;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RegisterAccount {
	
	public static void main(String[] args) throws Exception { 
		
		setUp(); 
		testWrapApp();
		tearDown();
	}

		static WebDriver driver;
	    
	    public static void setUp()
	    {
	        // Initialize the WebDriver instance using FirefoxDriver and launch the web browser
	        driver = new FirefoxDriver();
	        // Open the application - "https://www.x1.wrapdev.net/index/"
	        driver.get("https://www.x1.wrapdev.net/index/");
	        // Maximize the current window
	        driver.manage().window().maximize();
	    }
	    
	    public static void testWrapApp() throws Exception {
	        // Verify the page title to check if the correct page is launched
	        String pageTitle = driver.getTitle();
	        if (!pageTitle.equals("Wrap: Native Web App - Mobile Branding, Publishing & Ecommerce Platform"))
	        {
	            System.out.println("Launched the incorrect webpage");
		        tearDown();

	        }        
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    	WebElement login = driver.findElement(By.xpath(".//*[@id='wrap-header']/header/div/div[3]/div/div/nav/a[1]/span"));
	    	login.click();
	    	WebElement register = driver.findElement(By.linkText("Sign Up"));
	    	register.click();
	    	Thread.sleep(3000);
	    	WebElement personalsignup = driver.findElement(By.xpath(".//*[@id='pricingModel']/div/div[1]/div[4]/div[1]/div[2]/div[3]/a"));
	    	personalsignup.click();
	    	WebElement email = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input"));
	    	email.sendKeys("venkamma.b@gmail.com");
	    	driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button")).click();
	    	WebElement username = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[3]"));
	    	username.sendKeys("sanasahil");
	    	WebElement password = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[4]"));
	    	password.sendKeys("sanasahil123");
	    	driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button")).click();
	    	
	    	driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/h3")).isDisplayed();
	    	
	    	WebElement fname = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[1]"));
	    	fname.sendKeys("venkamma");
	    	WebElement lname = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[2]"));
	    	lname.sendKeys("Bhumakkanavar");
	    	WebElement company = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/input[3]"));
	    	company.sendKeys("Align");
	    	WebElement signupbutton = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/wm-plans-page/div/div/div/wm-plans-authorization/div/div/wm-auth-page/div/ng-transclude/wm-auth/div/div[3]/wm-signup/div/div/form/button"));
	    	signupbutton.click();
	
	    	WebElement creatnewwrap = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/div/div/div[2]/div[2]/a/i"));
	    	creatnewwrap.click();
	    	WebElement fromscratchbutton = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[5]/div/div/div[2]/button"));
	    	fromscratchbutton.click();
	    	WebElement close = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[5]/div/div/div/button[1]"));
	    	close.click();
	    	WebElement addcomponent = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/div/wm-wrap-editor/div/wm-wrap-editor-body/div/div[3]/wm-card-editor/div/div[1]/div/div/components-select/div/button"));
	    	addcomponent.click();
	    	WebElement selecttextbox = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[5]/div/div/add-component/div[2]/div[2]/div[1]/div[2]"));
	    	selecttextbox.click();
	    	WebElement addbutton=driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[5]/div/div/add-component/div[3]/button[2]"));
	    	addbutton.click();
	    	WebElement textbox = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/div/wm-wrap-editor/div/wm-wrap-editor-body/div/div[3]/wm-card-editor/div/div[1]/div/div/components-select/div/div[2]/textbox-editor/div/wm-scribe/div/div[2]/div[2]/div/p"));
	    	textbox.sendKeys("This is Automation Wrap");
	    	WebElement savebutton = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/div/wm-wrap-editor/div/wm-action-bar/div/div[2]/div[8]/button"));
	    	savebutton.click();
	    	WebElement publishbutton = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[2]/div[1]/div/wm-wrap-editor/div/wm-action-bar/div/div[2]/div[9]/button"));
	    	publishbutton.click();
	    	WebElement message = driver.findElement(By.xpath(".//*[@id='wrap-theme']/div[5]/div/div"));
	    	String string1 = message.getText();
	    	if (string1 == "Congratulations You've published your first wrap")
	    	{
	    		System.out.println("Wrap is created and published successfully");
	    	}
	
	    }
	    
		public static void tearDown() {
	        // Quit the launched web browser
	        driver.quit();
	    }


}

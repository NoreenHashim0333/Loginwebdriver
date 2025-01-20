

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://koyal.pk/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
//		
//        LandingPage landingPage= new LandingPage(driver);
//        landingPage.goTo();
//		landingPage.loginApplication("3702241950");
//        ProductCatalogue productCatalogue = new ProductCatalogue(driver);
////        String opentabs = "audio, video, movie";
//        productCatalogue.opentabs();
        
        
        
        
//        WebElement option = driver.findElement(By.id("header-login-btn"));
//        option.click();
//        WebElement dropdown1 = driver.findElement(By.id("react-select-2-placeholder"));
//        dropdown1.click();
//        
//        
//        WebElement option1 = driver.findElement(By.xpath("//div[text()='Zong']"));
//        option1.click();
//
//        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
//        submitButton.click();
//        Thread.sleep(2000);
//        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
//        driver.findElement(By.className("chakra-button")).click();
//        Thread.sleep(31000);
//        driver.findElement(By.className("underline")).click();
//        
//       Thread.sleep(3000);
//		WebElement pinInput1 = driver.findElement(By.xpath("//*[@id=\"pin-input-:r14:-0\"]"));
//		WebElement pinInput2 = driver.findElement(By.xpath("//*[@id=\"pin-input-:r14:-1\"]"));
//		WebElement pinInput3 = driver.findElement(By.xpath("//*[@id=\"pin-input-:r14:-2\"]"));
//		WebElement pinInput4 = driver.findElement(By.xpath("//*[@id=\"pin-input-:r14:-3\"]"));
//        // Send keys to each input field
//       pinInput1.sendKeys("0");
//        pinInput2.sendKeys("0");
//        pinInput3.sendKeys("0");
//       pinInput4.sendKeys("0");
//        
//        Thread.sleep(2000);
//        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
//        driver.findElement(By.className("chakra-button")).click();
//       
//        Thread.sleep(4000);
//        WebElement AudioTab= driver.findElement(By.className("tab-audio"));
//		AudioTab.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
//		
//		Thread.sleep(3000);
//		WebElement VideoTab = driver.findElement(By.className("tab-video"));
//		VideoTab.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
//		
//		Thread.sleep(4000);
//		WebElement MovieTab = driver.findElement(By.className("tab-movie"));
//		MovieTab.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
//		
//		Thread.sleep(3000);
//		WebElement ShortsTab = driver.findElement(By.className("tab-shorts"));
//				driver.findElement(By.className("tab-shorts")).click();
//	
//		
//		Thread.sleep(3000);
//		Set<String>windows = driver.getWindowHandles();
//		Iterator<String>it=windows.iterator();
//		Thread.sleep(3000);		
//		
//		String parentid = it.next();  //YE AUDIO ka code ha
//		String childid = it.next(); //YE VIDEO KA HA
//		String Subchild = it.next(); //YE Movie KA HA
//String Subchild1 = it.next(); //YE home page KA HA
//
//		
//		Thread.sleep(2000);
//		driver.switchTo().window(parentid);
//		System.out.println("Parent id" + driver.getTitle());
//		Thread.sleep(5000);
//		driver.switchTo().window(childid);
//		System.out.println("child id:" + driver.getTitle());
//		Thread.sleep(4000);
//		driver.switchTo().window(Subchild);
//		System.out.println("SubChild" + driver.getTitle());
//		Thread.sleep(3000);
//		driver.switchTo().window(Subchild1);
//		System.out.println("SubChild1" + driver.getTitle());
//		
		
		
		
		
	}

}

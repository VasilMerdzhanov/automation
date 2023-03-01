package com.nakakavpaket.nakade;

public class NqkakviTestove extends AbstractSetUp{
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:/dravers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.abv.bg");
	}
	
	@Test
	public void newTest(){
		
		WebElement button = driver.findElement(By.id("button1"));
		
		button.submit();
		
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
}
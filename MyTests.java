public class Blala{
	
	public WebDriver driver;
	
	@BeforeTest
	public void SetUp(){
	
	System.setProperty("webdriver.chrome.driver", "C:/papka/chromedriver.exe")
	driver = new ChromeDriver();
	driver.get("http://abv.bg")
	}
	
	@Test
	public void Test1(){
		WebElement buba = driver.findElement(By.id("bubaa"));
		buba.sendKeys("name");
		
	}
	
	@AfterTest
	public void tearDown(){

		driver.quit();
	}
}



package caroobi;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class HomePage {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 driver.get("https://www.caroobi.com/");
 driver.quit();
 driver.quit();
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.gecko.driver", "chromedriver");
   driver = new ChromeDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   driver.quit();
  }
 
}
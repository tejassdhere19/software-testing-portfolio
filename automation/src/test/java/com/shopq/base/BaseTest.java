package com.shopq.base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {
 protected WebDriver driver;
 protected String baseUrl=System.getProperty("baseUrl","http://localhost:8000/app/");
 @BeforeMethod public void setUp(){ChromeOptions o=new ChromeOptions();o.addArguments("--window-size=1440,1000");driver=new ChromeDriver(o);driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));driver.get(baseUrl);}
 @AfterMethod(alwaysRun=true) public void tearDown(){if(driver!=null)driver.quit();}
}

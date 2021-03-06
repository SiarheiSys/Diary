// Generated by Selenium IDE
package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateNewUserTest {
  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void createnewuser() {
    driver.get("https://diary.ru/");
    //driver.manage().window().setSize(new Dimension(1550, 838));
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//a[@href='https://diary.ru/user/registration']")).click();
    driver.findElement(By.id("signupform-username")).click();
    driver.findElement(By.id("signupform-username")).sendKeys("sissergey1032");
    driver.findElement(By.id("signupform-password")).click();
    driver.findElement(By.id("signupform-password")).clear();
    driver.findElement(By.id("signupform-password")).sendKeys("63623400");
    driver.findElement(By.id("signupform-email")).click();
    driver.findElement(By.id("signupform-email")).sendKeys("sissergey@yandex.kcv");
    driver.findElement(By.id("chk_box_user_confirm")).click();
    driver.findElement(By.id("signup_btn")).click();
    new WebDriverWait(driver, 10);
    //driver.findElement(By.name("NewBlogForm[community]")).click();
    driver.findElement(By.id("newblogform-title")).click();
    driver.findElement(By.id("newblogform-title")).sendKeys("Мой дневник");
    driver.findElement(By.name("new-blogs-button")).click();
  }
}

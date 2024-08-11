package experiments;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits {

  WebDriver driver = new ChromeDriver();

  @Test
  public void explicitWait(){
    driver.get("https://trello.com/");
    driver.manage().window().maximize();
    WebElement btnLogin = driver.findElement(By.cssSelector("a[data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
    btnLogin.click();

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    WebElement inputEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    inputEmail.sendKeys("sergei.azarkh@gmail.com");

    WebElement btnContinues = driver.findElement(By.cssSelector("button[id='login-submit']"));
    btnContinues.click();

    WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    inputPassword.sendKeys("b051d7a3eE@");
    btnContinues.click();

    Assert.assertTrue(new WebDriverWait(driver, Duration.ofSeconds(5))
        .until(ExpectedConditions.urlContains("sergeiazarkh/boards")));

    driver.quit();
  }
}

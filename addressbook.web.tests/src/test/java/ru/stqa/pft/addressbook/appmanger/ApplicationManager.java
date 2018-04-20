package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private NavigationHelpers navigationHelpers;
  private ContactHelpers contactHelpers;
  private GroupHelpers groupHelpers;
  private SessionHelpers sessionHelpers;

  public GroupHelpers getGroupHelpers() {
    return groupHelpers;
  }

  public SessionHelpers getSessionHelpers() {
    return sessionHelpers;
  }

  public ContactHelpers getContactHelpers() {
    return contactHelpers;
  }

  public NavigationHelpers getNavigationHelpers() {
    return navigationHelpers;
  }

  ChromeDriver driver;

  public void init() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    sessionHelpers = new SessionHelpers(driver);
    groupHelpers = new GroupHelpers(driver);
    contactHelpers = new ContactHelpers(driver);
    navigationHelpers = new NavigationHelpers(driver);
    login("admin", "secret");
  }

  public void login(String username, String password) {
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.id("LoginForm")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void stop() {
    driver.quit();
  }

  public boolean isAlertPresent(ChromeDriver driver) {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

}

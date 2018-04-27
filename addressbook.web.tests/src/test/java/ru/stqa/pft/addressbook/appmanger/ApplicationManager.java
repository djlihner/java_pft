package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private NavigationHelpers navigationHelpers;
  private ContactHelpers contactHelpers;
  private GroupHelpers groupHelpers;
  private SessionHelpers sessionHelpers;
  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

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

  WebDriver driver;

  public void init() {
    if (browser == BrowserType.GOOGLECHROME) {
      driver = new ChromeDriver();
    } else if (browser == BrowserType.IE){
      driver = new InternetExplorerDriver();
    }
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    sessionHelpers = new SessionHelpers(driver);
    groupHelpers = new GroupHelpers(driver);
    contactHelpers = new ContactHelpers(driver);
    navigationHelpers = new NavigationHelpers(driver);
    sessionHelpers.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
  }
}

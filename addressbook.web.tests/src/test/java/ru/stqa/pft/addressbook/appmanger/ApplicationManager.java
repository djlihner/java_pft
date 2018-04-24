package ru.stqa.pft.addressbook.appmanger;

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
    sessionHelpers.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
  }
}

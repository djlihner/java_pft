package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
  protected ChromeDriver driver;

  @BeforeClass
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.id("LoginForm")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  protected void returnToGroupPage() {
    driver.findElement(By.linkText("group page")).click();
  }

  protected void submitGroupCreation() {
    driver.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
    driver.findElement(By.name("new")).click();
  }

  protected void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }

  private boolean isAlertPresent(ChromeDriver driver) {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected void deleteSelectedGroups() {
    driver.findElement(By.name("delete")).click();
  }

  protected void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }

  protected void submitContactCreation() {
    driver.findElement(By.name("submit")).click();
  }

  protected void fillContactsData() {
    driver.findElement(By.name("firstname")).sendKeys("TestFirstName");
    driver.findElement(By.name("lastname")).sendKeys("TestLastName");
    driver.findElement(By.name("company")).sendKeys("QA");
    driver.findElement(By.name("mobile")).sendKeys("89123748323");
  }

  protected void gotoContactsCreationPage() {
    driver.findElement(By.linkText("add new")).click();
  }
}

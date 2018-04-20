package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactHelpers {

  private ChromeDriver driver;

  public ContactHelpers(ChromeDriver driver) {
    this.driver = driver;
  }

  public void submitContactCreation() {
    driver.findElement(By.name("submit")).click();
  }

  public void fillContactsData() {
    driver.findElement(By.name("firstname")).sendKeys("TestFirstName");
    driver.findElement(By.name("lastname")).sendKeys("TestLastName");
    driver.findElement(By.name("company")).sendKeys("QA");
    driver.findElement(By.name("mobile")).sendKeys("89123748323");
  }
}

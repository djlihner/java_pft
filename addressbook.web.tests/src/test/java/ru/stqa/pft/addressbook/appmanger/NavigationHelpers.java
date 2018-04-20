package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelpers {

  private ChromeDriver driver;

  public NavigationHelpers(ChromeDriver driver) {
    this.driver = driver;
  }

  public void gotoGroupPage() {
    driver.findElement(By.linkText("groups")).click();
  }

  public void gotoContactsCreationPage() {
    driver.findElement(By.linkText("add new")).click();
  }
}

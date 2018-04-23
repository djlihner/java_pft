package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelpers extends HelperBase {


  public NavigationHelpers(ChromeDriver driver) {
    super(driver);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }

  public void gotoContactsCreationPage() {
    click(By.linkText("add new"));
  }
}

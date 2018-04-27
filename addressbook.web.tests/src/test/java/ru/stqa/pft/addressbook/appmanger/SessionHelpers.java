package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHelpers extends HelperBase {

  public SessionHelpers(WebDriver driver) {
    super(driver);
  }

  public void login(String username, String password) {
    find_field_and_type_text(By.name("user"), username);
    find_field_and_type_text(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}


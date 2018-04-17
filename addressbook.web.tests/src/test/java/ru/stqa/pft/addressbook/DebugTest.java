package ru.stqa.pft.addressbook;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DebugTest {

  @Test
  public void test (){
    System.setProperty("webdriver.chrome.driver","D:\\Java\\chromedriver\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http://localhost");

  }

}

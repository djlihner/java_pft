package ru.stqa.pft.addressbook.appmanger;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelpers extends HelperBase{


  public ContactHelpers(ChromeDriver driver)  {
    super(driver);
  }

  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactsData(ContactData contactData) {
    find_field_and_type_text(By.name("firstname"),contactData.getFirstName());
    find_field_and_type_text(By.name("lastname"), contactData.getLastName());
    find_field_and_type_text(By.name("company"),contactData.getCompany());
    find_field_and_type_text(By.name("mobile"),contactData.getPhone());
  }
}

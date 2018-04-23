package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation(){
    app.getNavigationHelpers().gotoContactsCreationPage();
    app.getContactHelpers().fillContactsData(new ContactData("Test","Test2"," QA","2342434234234"));
    app.getContactHelpers().submitContactCreation();
  }
}

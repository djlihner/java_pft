package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation(){
    app.getNavigationHelpers().gotoContactsCreationPage();
    app.getContactHelpers().fillContactsData();
    app.getContactHelpers().submitContactCreation();
  }
}

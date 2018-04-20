package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void testContactCreation(){
    app.gotoContactsCreationPage();
    app.fillContactsData();
    app.submitContactCreation();
  }
}

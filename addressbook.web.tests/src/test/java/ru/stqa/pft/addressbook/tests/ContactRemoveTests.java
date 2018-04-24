package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactRemoveTests extends TestBase {

  @Test
  public void testRemoveContact() {
    app.getNavigationHelpers().gotoHomePage();
    app.getContactHelpers().selectContact();
    app.getContactHelpers().initRemoveContact();
    app.getContactHelpers().approveRemoveContact();
  }
}

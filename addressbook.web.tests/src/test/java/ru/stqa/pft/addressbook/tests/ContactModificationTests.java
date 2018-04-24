package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

  @Test
  public void testContactModification() {
    app.getNavigationHelpers().gotoHomePage();
    app.getContactHelpers().selectContact();
    app.getContactHelpers().initModifyContact();
    app.getContactHelpers().fillContactsData(new ContactData("Graf","Dracula","Vampires","9996664356"));
    app.getContactHelpers().submitContactModification();
    app.getNavigationHelpers().gotoHomePage();
  }
}

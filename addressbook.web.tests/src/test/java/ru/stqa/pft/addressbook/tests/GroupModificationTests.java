package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification() {
    app.getNavigationHelpers().gotoGroupPage();
    app.getGroupHelpers().selectGroup();
    app.getGroupHelpers().initGroupModification();
    app.getGroupHelpers().fillGroupForm(new GroupData("www","leningrad","spb"));
    app.getGroupHelpers().submitGroupModification();
    app.getGroupHelpers().returnToGroupPage();
  }
}
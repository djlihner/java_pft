package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupRemoveTests extends TestBase {

  @Test
  public void testGroupRemove() {
    app.getNavigationHelpers().gotoGroupPage();
    app.getGroupHelpers().selectGroup();
    app.getGroupHelpers().deleteSelectedGroups();
    app.getGroupHelpers().returnToGroupPage();
  }

}

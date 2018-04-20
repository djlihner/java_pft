package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;


public class GroupRemoveTests extends TestBase {

  @Test
  public void testGroupRemove() {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}

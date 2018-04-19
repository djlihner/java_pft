package ru.stqa.pft.addressbook;

import org.testng.annotations.*;


public class GroupRemoveTests extends TestBase {

  @Test
  public void testGroupRemove() {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}

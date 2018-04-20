package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelpers().gotoGroupPage();
    app.getGroupHelpers().initGroupCreation();
    app.getGroupHelpers().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelpers().submitGroupCreation();
    app.getGroupHelpers().returnToGroupPage();
  }

}

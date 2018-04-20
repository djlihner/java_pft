package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.appmanger.ApplicationManager;

public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  @BeforeClass
  public void setUp() throws Exception {
    app.init();
  }

  @AfterClass
  public void tearDown() {
    app.stop();
  }

}

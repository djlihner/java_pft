package ru.stqa.pft.addressbook.model;

public class ContactData {

  private final String firstName;
  private final String lastName;
  private final String phone;
  private final String company;

  public ContactData(String firstName, String lastName, String company, String phone) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.phone = phone;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCompany() {
    return company;
  }

  public String getPhone() {
    return phone;
  }
}

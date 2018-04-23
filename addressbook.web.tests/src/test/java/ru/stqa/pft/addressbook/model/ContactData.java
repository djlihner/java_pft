package ru.stqa.pft.addressbook.model;

public class ContactData {

  public final String firstName;
  public final String lastName;
  public final String phone;
  public final String company;

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

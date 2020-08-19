package com.AddressBook.AddressBook.DTO;

public class Address {
    private String firstName;
    private String lastName;
    private String addressinfo;

    public Address(String lastName) {
        this.lastName = lastName;
    }

    public Address() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressinfo() {
        return addressinfo;
    }

    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }
}

package com.AddressBook.AddressBook.DTO;

public class Address {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    public Address(String firstName, String lastName, String streetAddress, String city, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address() {
    }


}

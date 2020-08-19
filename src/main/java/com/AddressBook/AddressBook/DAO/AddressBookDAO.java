package com.AddressBook.AddressBook.DAO;

import com.AddressBook.AddressBook.DTO.Address;

import java.util.List;

public interface AddressBookDAO {

    Address AddAddress(String LastName,Address Address) throws AddressBookPersistenceException;

    Address RemoveAddress(String LastName) throws AddressBookPersistenceException;

    Address FindAddressByLastName(String LastName) throws AddressBookPersistenceException;

    int CountAddress();

    List<Address> ShowListOfAddress() throws AddressBookPersistenceException;
}

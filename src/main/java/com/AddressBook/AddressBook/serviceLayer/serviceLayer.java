package com.AddressBook.AddressBook.serviceLayer;

import com.AddressBook.AddressBook.DAO.AddressBookPersistenceException;
import com.AddressBook.AddressBook.DTO.Address;

import java.util.List;

public interface serviceLayer {

    void AddAddress(String LastName, Address Address) throws AddressBookPersistenceException, AddressBookDuplicateIdException, AddressDataValidationException;

    Address RemoveAddress(String LastName) throws AddressBookPersistenceException;

    Address FindAddressByLastName(String LastName) throws AddressBookPersistenceException;

    int CountAddress();

    List<Address> ShowListOfAddress() throws AddressBookPersistenceException;
}

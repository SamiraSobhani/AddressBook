package com.AddressBook.AddressBook.serviceLayer;

import com.AddressBook.AddressBook.DAO.AddressBookAuditDAO;
import com.AddressBook.AddressBook.DAO.AddressBookDAO;
import com.AddressBook.AddressBook.DAO.AddressBookPersistenceException;
import com.AddressBook.AddressBook.DTO.Address;

import java.util.List;

public class serviceLayerFileImpl implements serviceLayer {

    AddressBookDAO dao;
    AddressBookAuditDAO auditDAO;

    @Override
    public void AddAddress(String LastName, Address Address)
            throws AddressBookPersistenceException,
            AddressBookDuplicateIdException, AddressDataValidationException {

        if (dao.FindAddressByLastName(Address.getLastName()) != null) {
            throw new AddressBookDuplicateIdException("ERROR: Could not add the Address.  Last name " +
                    Address.getLastName() + " " +
                    "already exists");
        }
        validateData(Address);

        dao.AddAddress(Address.getLastName(),Address);
        auditDAO.writeAuditEntry(
                "Address"+Address.getLastName()+"created");



    }


    @Override
    public Address RemoveAddress(String LastName) throws AddressBookPersistenceException {
        auditDAO.writeAuditEntry("Address " + LastName + " REMOVED.");
        return dao.RemoveAddress(LastName);
    }

    @Override
    public Address FindAddressByLastName(String LastName) throws AddressBookPersistenceException {
        return dao.FindAddressByLastName(LastName);
    }

    @Override
    public int CountAddress() {
        return dao.CountAddress();
    }

    @Override
    public List<Address> ShowListOfAddress() throws AddressBookPersistenceException {
        return dao.ShowListOfAddress();
    }


    private void validateData(Address Address) throws AddressDataValidationException {
        if(Address.getLastName()==null
                ||Address.getLastName().trim().length()==0
                ||Address.getFirstName()==null
                ||Address.getFirstName().trim().length()==0
                ||Address.getAddressinfo()==null
                ||Address.getAddressinfo().trim().length()==0)
        {throw new AddressDataValidationException("Error All fields are required");}
    }

}

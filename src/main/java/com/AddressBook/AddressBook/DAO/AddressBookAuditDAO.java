package com.AddressBook.AddressBook.DAO;

public interface AddressBookAuditDAO {
    public void writeAuditEntry(String entry) throws AddressBookPersistenceException;
}

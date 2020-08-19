package com.AddressBook.AddressBook.DAO;

public class AddressBookPersistenceException extends Exception {

    public AddressBookPersistenceException() {
        super();
    }

    public AddressBookPersistenceException(String message) {
        super(message);
    }

    public AddressBookPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}

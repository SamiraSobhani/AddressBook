package com.AddressBook.AddressBook.serviceLayer;

public class AddressDataValidationException extends Throwable {
    public AddressDataValidationException(String message) {
        super(message);
    }
    public AddressDataValidationException(String message,Throwable cause) {
        super(message,cause);
    }
}

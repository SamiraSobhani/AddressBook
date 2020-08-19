package com.AddressBook.AddressBook.DAO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddressBookAuditDAOFileImpl implements AddressBookAuditDAO {

    public static final String AUDIT_FILE = "address.txt";

    public void writeAuditEntry(String entry) throws AddressBookPersistenceException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new AddressBookPersistenceException("Could not persist audit information.", e);
        }

    }
}

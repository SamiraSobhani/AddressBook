package com.AddressBook.AddressBook.DAO;

import com.AddressBook.AddressBook.DTO.Address;

import java.io.*;
import java.util.*;

public class AddressBookDAOFileImpl implements AddressBookDAO {

    private  Map<String,Address> Addresses= new HashMap<>();
    public static final String AUDIT_FILE = "Address.txt";
    public static final String DELIMITER = "::";

    @Override
    public Address AddAddress(String LastName,Address Address) throws AddressBookPersistenceException{
        Address newAddress=Addresses.put(LastName, Address);
        writeAddress();
        return newAddress;
    }


    @Override
    public Address RemoveAddress(String LastName) throws AddressBookPersistenceException{
     Address removedAddress=Addresses.remove(LastName);
     writeAddress();
     return removedAddress;
    }

    @Override
    public Address FindAddressByLastName(String LastName) throws AddressBookPersistenceException{
    return Addresses.get(LastName);
    }

    @Override
    public int CountAddress(){
        return Addresses.size();
    }

    @Override
    public List<Address> ShowListOfAddress() throws AddressBookPersistenceException{
    loadAddress();
    return new ArrayList<Address>(Addresses.values());
    }

    private void loadAddress() throws AddressBookPersistenceException {
        Scanner scanner;
        try {
            scanner = new Scanner(
                    new BufferedReader(new FileReader(AUDIT_FILE)));
        } catch (FileNotFoundException e) {
            throw new AddressBookPersistenceException("can not load the list",e);
        }

        String currentLine;
        String[] currentTokens;

        while (scanner.hasNext()){
            currentLine=scanner.nextLine();
            currentTokens=currentLine.split(DELIMITER);
            Address currentAddress =new Address(currentTokens[1]);
            currentAddress.setFirstName(currentTokens[0]);
            currentAddress.setAddressinfo(currentTokens[2]);

            Addresses.put(currentAddress.getLastName(),currentAddress);
        }
        scanner.close();
    }

    private void writeAddress() throws AddressBookPersistenceException {
        PrintWriter out;
        try {
            out=new PrintWriter("AUDIT_FILE");
        } catch (IOException e) {
            throw new AddressBookPersistenceException(
                    "Could not save Address",e);
        }
        List<Address> AddressList=this.ShowListOfAddress();
        for (Address currentAddress:AddressList){
            out.println(currentAddress.getFirstName()+DELIMITER+
                        currentAddress.getLastName()+DELIMITER+
                        currentAddress.getAddressinfo());
            out.flush();
        }

        out.close();

    }

}

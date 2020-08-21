package com.AddressBook.AddressBook.AddressBookUI;

import java.util.Scanner;

public class useIOConsolImpl implements userIO {

    Scanner sc=new Scanner(System.in);

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double menueSelection=sc.nextDouble();
        return menueSelection;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double menuSelection = sc.nextDouble();
        if(min>menuSelection || menuSelection>max) {
            System.out.println("please enter a valid amount");
        }else;
        return menuSelection;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float menueSelection=sc.nextFloat();
        return menueSelection;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float menuSelection = sc.nextFloat();
        if(min>menuSelection || menuSelection>max) {
            System.out.println("please enter a valid amount");
        }else;
        return menuSelection;
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        int menueSelection=sc.nextInt();
        return menueSelection;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int menuSelection = sc.nextInt();
        if(min>menuSelection || menuSelection>max) {
            System.out.println("please enter a valid amount");
        }else;
        return menuSelection;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long menueSelection=sc.nextLong();
        return menueSelection;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long menuSelection = sc.nextLong();
        if(min>menuSelection || menuSelection>max) {
            System.out.println("please enter a valid amount");
        }else;
        return menuSelection;
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String menueSelection=sc.next();
        return menueSelection;
    }
}

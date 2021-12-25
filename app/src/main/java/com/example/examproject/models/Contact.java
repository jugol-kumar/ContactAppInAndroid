package com.example.examproject.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
    private String contactName;
    private String contactNumber;
    private String contactAddress;

    public Contact(String contactName, String contactNumber, String contactAddress) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.contactAddress = contactAddress;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactName='" + contactName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                '}';
    }


    public static List<Contact> __getAllContacts(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Jugol Kuamr", "0172371733", "Tollerbag, Mirpur-1, Dhaka"));
        contacts.add(new Contact("Milon Kuamr", "01784124291", "Panthpoth, Greenroad, Dhaka"));
        contacts.add(new Contact("Jugol Kuamr", "0172371733", "Tollerbag, Mirpur-1, Dhaka"));
        contacts.add(new Contact("Milon Kuamr", "01784124291", "Panthpoth, Greenroad, Dhaka"));
        contacts.add(new Contact("Jugol Kuamr", "0172371733", "Tollerbag, Mirpur-1, Dhaka"));
        contacts.add(new Contact("Milon Kuamr", "01784124291", "Panthpoth, Greenroad, Dhaka"));
        contacts.add(new Contact("Jugol Kuamr", "0172371733", "Tollerbag, Mirpur-1, Dhaka"));
        contacts.add(new Contact("Milon Kuamr", "01784124291", "Panthpoth, Greenroad, Dhaka"));
        contacts.add(new Contact("Jugol Kuamr", "0172371733", "Tollerbag, Mirpur-1, Dhaka"));
        return contacts;
    }




}

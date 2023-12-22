package com.example;

import java.util.ArrayList;

public class Addressbook {
    public static ArrayList<Contact> ContactsList = new ArrayList<Contact>();

    public static void addContact() {
        Contact contact = Contact.createContact();
        ContactsList.add(contact);
        System.out.println("");
    }

    public static void getContacts() {
        for (int i = 0; i < ContactsList.size(); i++) {
            Contact contact = ContactsList.get(i);
            System.out.print("Details of Person " + (i + 1));
            System.out.print("First Name: " + contact.firstName);
            System.out.print("Last Name: " + contact.lastName);
            System.out.print("City: " + contact.city);
            System.out.print("State: " + contact.state);
            System.out.print("Phone Number: " + contact.phoneNumber);
            System.out.print("Zip Code: " + contact.zip);
            System.out.print("Email: " + contact.email);
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        addContact();
        getContacts();
    }
    
}

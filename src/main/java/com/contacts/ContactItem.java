package com.contacts;

public class ContactItem {
    private String phoneNumber;
    private String name;
    private String surname;
    private String email;

    public ContactItem(String phoneNumber, String name, String surname, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}

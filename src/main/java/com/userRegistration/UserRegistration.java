package com.userRegistration;

import java.time.LocalDate;

public class UserRegistration {

    private final String name;
    private final String email;
    private final String password;
    private final LocalDate dateOfBirth;
    private final Address address;

    public UserRegistration(String name, String email, String password, LocalDate dateOfBirth, Address address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String summary() {
        return "UserRegistration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

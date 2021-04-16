package com.userRegistration;

import java.time.LocalDate;

public class UserRegistrationBuilder {
    private String name;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private Address address;

    static UserRegistrationBuilder aUser() {
        return new UserRegistrationBuilder().setDateOfBirth(LocalDate.of(2020,1,1));
    }

    static UserRegistrationBuilder aLegalUser() {
        return new UserRegistrationBuilder().setDateOfBirth(LocalDate.of(2002,1,1));
    }

    static UserRegistrationBuilder aNotRegisteredUser() {
        return new UserRegistrationBuilder().setPassword(null);
    }

    public UserRegistrationBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserRegistrationBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserRegistrationBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserRegistrationBuilder setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public UserRegistrationBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public UserRegistration build() {
        return new UserRegistration(name, email, password, dateOfBirth, address);
    }
}

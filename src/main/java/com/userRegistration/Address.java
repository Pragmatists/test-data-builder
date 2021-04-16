package com.userRegistration;

public class Address {
    private String city;
    private String zip;

    public Address(String city, String zip) {
        this.city = city;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}

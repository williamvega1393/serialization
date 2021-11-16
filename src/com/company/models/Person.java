package com.company.models;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private String phone;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "nombre: " + firstname + "\n"
                + "apellido: " + lastname + "\n"
                + "teléfono: " + phone + "\n";
    }
}

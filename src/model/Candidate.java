/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import validate.validate;

/**
 *
 * @author ASUS
 */
public class Candidate {

    private String id;
    private String Firstname;
    private String Lastname;
    private Date bithday;
    private String address;
    private String phone;
    private String email;
    validate vl = new validate();
    public Candidate(){}

    public Candidate(String id, String Firstname, String Lastname, Date bithday, String address, String phone, String email) {
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.bithday = bithday;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public Date getBithday() {
        return bithday;
    }

    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", bithday=" + vl.formatDate(bithday) + ", address=" + address + ", phone=" + phone + ", email=" + email;
    }
}

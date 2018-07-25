/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author qwert
 */
public class User implements Serializable {

    private String username, name, email, pwd, address, desc, phone;
    private boolean male;

    private Date dob;

    public User(String username, String name, String email, String address, String desc, boolean male, String phone, Date dob) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.address = address;
        this.desc = desc;
        this.male = male;
        this.phone = phone;
        this.dob = dob;
    }

    public User(String username, String name, String email, String pwd, String address, String desc, String phone, boolean male, Date dob) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        this.address = address;
        this.desc = desc;
        this.phone = phone;
        this.male = male;
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }

    public String getAddress() {
        return address;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isMale() {
        return male;
    }

    public String getPhone() {
        return phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

}

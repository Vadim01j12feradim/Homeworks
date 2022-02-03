/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validation;

/**
 *
 * @author found404
 */
public class ClassClient {
      public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getTipeUser() {
        return TipeUser;
    }

    public void setTipeUser(String TipeUser) {
        this.TipeUser = TipeUser;
    }
    String UserName = "";
    String TipeUser = "";
    String Status="";
    String name="";
    String OneAPe="";
    String TwoApe="";
    int id=0;
    String Password="";
    String Address="";
    String Email="";
    long Phone=0;
    ClassClient(){
        UserName = "";
            TipeUser = "";
            Status="";
    name="";
    OneAPe="";
    TwoApe="";
    id=0;
    Password="";
    Address="";
    Email="";
    Phone=0;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOneAPe() {
        return OneAPe;
    }

    public void setOneAPe(String OneAPe) {
        this.OneAPe = OneAPe;
    }

    public String getTwoApe() {
        return TwoApe;
    }

    public void setTwoApe(String TwoApe) {
        this.TwoApe = TwoApe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long Phone) {
        this.Phone = Phone;
    }
}

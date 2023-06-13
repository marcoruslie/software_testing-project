/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.softtest_project;

/**
 *
 * @author ASUS
 */
public class User {
    private String username, email , password, firstName, 
            lastName, phoneNumber, companyName, country;
    
    public User(String username, String email ,String password,String firstName, 
            String lastName, String phoneNumber, String companyName, String country){
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.country = country;
    }
    
}

package com.nicholas.restinspringboot.model;

import javax.persistence.*;

@Entity
@Table (name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    @Column(name = "firstname")
    private String fName;
    @Column(name = "secondname")
    private String lName;
    @Column(name = "useremail")
    private String email;

    public User() {
    }

    public User(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package com.aries.playground.entities;

import javax.persistence.*;

@Entity
@Table(name ="t_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name ="countryCode")
    private String countryCode;

    @Column(name = "postCode")
    private String postCode;

    @Column(name = "line1")
    private String line1;

    public Long getId() {
        return id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getLine1() {
        return line1;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
}


package com.aries.playground.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name ="t_customer")
public class Customer {

    public Customer(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="legalName")
    private String legalName;

    @Column(name="enrollTime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime enrollTime;

    @OneToOne
    private Address LegalAddress;

    public Long getId() {
        return this.id;
    }

    public String getLegalName() {
        return this.legalName;
    }

    public LocalDateTime enrollTime() {
        return this.enrollTime;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public void setLegalName(String value) {
        this.legalName = value;
    }

    public void setEnrollTime(LocalDateTime value) {
        this.enrollTime = value;
    }
}


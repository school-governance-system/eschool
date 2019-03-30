package com.eschool.domain.parent;

import com.eschool.domain.Entity;

import java.util.List;
import java.util.UUID;

/**
 * Created by Abdus Salam on 9/2/2018.
 */
public abstract class Parent extends Entity {

    private String name;
    private String cnic;
    private String occupation;
    private Double monthlySalary;
    private List<String> contactNumbers;
    private String address;

    public Parent(UUID id, String name, String cnic, String occupation, Double monthlySalary, List<String> contactNumbers, String address) {
        super(id);
        this.name = name;
        this.cnic = cnic;
        this.occupation = occupation;
        this.monthlySalary = monthlySalary;
        this.contactNumbers = contactNumbers;
        this.address = address;
    }
}
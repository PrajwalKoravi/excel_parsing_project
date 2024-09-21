package com.example.excel_parsing_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persons extends Product {

    @Id
    private Long personId;
    private String name;
    private String city;
    private Integer age;
    private String occupation;


    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    public Persons(Long personId, String name, String city, Integer age, String occupation) {
        this.personId = personId;
        this.name = name;
        this.city = city;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public Persons() {
       super();
    }
}

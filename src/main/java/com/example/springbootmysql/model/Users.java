package com.example.springbootmysql.model;

import javax.persistence.*;


@Entity
public class Users {


    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;
    @Column(name = "firstname")
    private String first_name;
    @Column(name = "lastname")
    private String last_name;
    @Column(name = "age")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return first_name;
    }

    public void setName(String first_name) {
        this.first_name = first_name;
    }

    public String getLast() {
        return last_name;
    }

    public void setLast(String last_name) {
        this.last_name = last_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

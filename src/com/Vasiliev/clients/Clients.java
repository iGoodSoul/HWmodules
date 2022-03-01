package com.Vasiliev.clients;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clients implements Serializable {
  int id;
  String name;
  String surname;
  String sex;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  int age;

  public Clients(int id, String name, String surname, String sex, int age) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.sex = sex;
    this.age = age;
  }

  @Override
  public String toString() {
    return "com.Vasiliev.clients.Clients{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            '}';
  }

  public static Object getList() {

    List<Clients> clientList = new ArrayList<>();
    clientList.addAll(Arrays.asList(
            new Clients(1, "John", "Smith", "man", 25),
            new Clients(2, "Andrey", "Smirnov", "man", 38),
            new Clients(3, "Irina", "Petrova", "woman", 35),
            new Clients(4, "Anna", "Ivanova", "woman", 18),
            new Clients(5, "Stepan", "Razin", "man", 59),
            new Clients(6, "Julia", "Roberts", "woman", 30)));


    return clientList;
  }
}
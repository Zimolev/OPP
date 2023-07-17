package org.example.SeminarFive.SeminarWork.model;

public abstract class User {
    String name;
    String surname;
    String dateBirth;

    public User(String name, String surname, String dateBirth) {
        this.name = name;
        this.surname = surname;
        this.dateBirth = dateBirth;
    }

    public User() {
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

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}

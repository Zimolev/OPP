package org.example.SeminarFive.SeminarWork.model;

public class Teacher extends User{
    int idTeacher;

    public Teacher(String name, String surname, String dateBirth, int idTeacher) {
        super(name, surname, dateBirth);
        this.idTeacher = idTeacher;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }
}

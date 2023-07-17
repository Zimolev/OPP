package org.example.SeminarFive.SeminarWork.model;

public class Student extends User {
    int idStudent;

    public Student(String name, String surname, String dateBirth, int idStudent) {
        super(name, surname, dateBirth);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}

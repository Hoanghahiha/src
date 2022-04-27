package session55.Lab1;

import java.util.Date;

public final class Student { //Lop ke thua cuoi cung khi dung final
    public Integer id;
    public String name;
    public Date dateOfBirth;
    public String address;
    public double gpa;

    public Student() {
    }

    public Student(Integer id, String name, Date dateOfBirth, String address, float gpa) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}

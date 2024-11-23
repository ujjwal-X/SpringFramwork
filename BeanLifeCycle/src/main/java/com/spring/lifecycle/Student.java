package com.spring.lifecycle;

public class Student {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

    public void init(){
        System.out.println("Inside Method");
    }
    public void destroy(){
        System.out.println("Destroy Method");
    }
}

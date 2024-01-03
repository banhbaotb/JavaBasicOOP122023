package com.anhtester.tinhkethua;


public class Student extends Person {

    public Student(String name, int age, float height) {
        super(name, age, height);

    }
//ghi đè phương thuwsc từ class con đối vs class cha
    public void layThongTin() {
        getInfo();
    }

    public static void main(String[] args) {
        Student student = new Student("phung", 30, 40);
        student.getInfo();
    }

}

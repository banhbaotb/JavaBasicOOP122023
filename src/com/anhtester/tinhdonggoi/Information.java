package com.anhtester.tinhdonggoi;

public class Information {
    public static void main(String[] args) {

        Student student = new Student("Phúc",30, "Hà Nội");
        System.out.println(student.getName());

        // thay giá trị
        student.setName("Hà");
        System.out.println(student.getName());
    }
}

package com.anhtester.baitapJavaOOP;

public class NhanVien {
    String name;
    int age;
    String phongban;

    public NhanVien(String name, int age, String phongban) {
        this.name = name;
        this.age = age;
        this.phongban = phongban;
    }
    public void thongTinNhanVien () {
        System.out.println(name);
        System.out.println(age);
        System.out.println(phongban);
    }

}

package com.anhtester.phamitruycap;

public class Information {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getInfoProtected();
        employee.getInfoDefault();
        System.out.println(employee.getName());
    }
}

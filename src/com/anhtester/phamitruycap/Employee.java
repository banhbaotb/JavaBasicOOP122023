package com.anhtester.phamitruycap;

public class Employee {

    //phạm vi truy cập private : chi truy cập trong phm vi class
    private String name = "Phuong";
    private int age = 30;
    public String company = "Viettel";

    private void getInfoPrivate() {
        System.out.println(name);
        System.out.println(age);
    }

    // phạm vi truy cập protected : truy cập sang class khac nhung phải trong cung packed
    protected void getInfoProtected() {
        System.out.println(name);
        System.out.println(age);
    }
// phạm vi truy cập defaut
    void getInfoDefault() {
        System.out.println("Đây là hàm default");
    }

    // phạm vi truy cập public - truy cập ở khắp mọi nơi trong project
public String getName() {
        return name;
}
    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
//        System.out.println(employee.age);


    }

}

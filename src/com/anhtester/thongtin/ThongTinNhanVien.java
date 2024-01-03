package com.anhtester.thongtin;

import com.anhtester.phamitruycap.Employee;

public class ThongTinNhanVien extends Employee {

    public void XuLyPhatLuong() {
        // có thêm extends kế thừa lại
        getInfoProtected();
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        // k thể truy cp dc getinfo  vi khác packed
    }
}

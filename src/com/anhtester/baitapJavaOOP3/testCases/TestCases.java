package com.anhtester.baitapJavaOOP3.testCases;

import com.anhtester.baitapJavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {
    public TestCases(String name, Boolean report, Boolean headless) {
        super(name, report, headless);
    }

    public void Login() {
        closeDriver();
        creatDriver();

    }


    public void AddCategory() {
        closeDriver();
        creatDriver();
    }

}

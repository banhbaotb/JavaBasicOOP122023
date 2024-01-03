package com.anhtester.baitapJavaOOP3.common;

public class BaseTest {
Constants constants = new Constants();

    public BaseTest(String name, Boolean report, Boolean headless) {
    }


    public void creatDriver() {
        System.out.println(constants.browser);
        System.out.println(constants.headless);
        System.out.println(constants.report);
    }
    public void closeDriver(String browser) {
        System.out.println("Closed browser " + browser);
    }
}

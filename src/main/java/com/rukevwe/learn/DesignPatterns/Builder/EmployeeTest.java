package com.rukevwe.learn.DesignPatterns.Builder;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("red", "man", 33,7)
                .setPhone("0045697")
                .setAddress("Juventus")
                .build();
    }
}

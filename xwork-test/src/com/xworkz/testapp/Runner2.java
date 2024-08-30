package com.xworkz.testapp;

import com.xworkz.testapp.inherit.Engineer;

public class Runner2 {
    public static void main(String[] args) {
        System.out.println("main method started!");
        Engineer employee = new Engineer();
        System.out.println("Salary:" + employee.salary);
        System.out.println("Bonous:" + employee.bonus);
        System.out.println("main method ended!");
    }
}

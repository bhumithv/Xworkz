package com.xworkz.testapp;

import com.xworkz.testapp.polyencap.AsianPaint;

public class Runner3 {
    public static void main(String[] args) {
        System.out.println("main method started!");
        AsianPaint asianPaint1 = new AsianPaint();
        asianPaint1.setPaintId(1);
        asianPaint1.setPaintColor("Blue");
        asianPaint1.setPaintType("Oil paint");
        asianPaint1.setPrice(455.7);
        asianPaint1.setPaintQuantity("3L");
        System.out.println("Asian Paint Data1:" + asianPaint1);
        System.out.println("main method ended!");
    }
}

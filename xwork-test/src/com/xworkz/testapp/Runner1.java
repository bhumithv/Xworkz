package com.xworkz.testapp;

import com.xworkz.testapp.constructor.Spotify;

public class Runner1 {
    public static void main(String[] args){
        System.out.println("main method started!");
        Spotify ref=new Spotify(1,"bhumi","xyz@gmail.com","F","23-04-2002","India");
        ref.getUserProfile();
        System.out.println("main method ended!");
    }
}

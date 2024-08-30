package com.xworkz.testapp.constructor;

public class Spotify {
    int userId;
    String userName;
    String email;
    String gender;
    String dob;
    String countryName;

    //parameterized constructor
    public Spotify(int userId,String userName,String email,String gender,String dob,String countryName){
        this.userId=userId;



    }

    public void getUserProfile(){
        System.out.println("User Id:"+this.userId);
    }
}

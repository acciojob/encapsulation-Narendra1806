package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly obj = new RWOnly();
//        obj.name = "Bangalore";
//        name has private access in com.driver.RWOnly
        obj.setName("Pune");
        System.out.println(obj.getName());
    }
}
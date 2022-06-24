package com.day2;

public class Demo {
    //String city;
    public void funA( String city){

        switch (city){
            case "mumbai":
                System.out.println("Financial city");
            case  "Kolkata":
                System.out.println("City of Joy");
            case "Delhi":
                System.out.println("Capital of the country");
            case "Bangalore":
                System.out.println("Cyber city");
            default:
                System.out.println("May be another city");
        }
    }

    public static void main(String[] args) {
        Demo d= new Demo();
        d.funA("mumbai");

    }
}

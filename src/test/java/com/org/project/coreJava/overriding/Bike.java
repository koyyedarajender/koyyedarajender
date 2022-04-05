package com.org.project.coreJava.overriding;

public class Bike extends Vehicle{

    void run(){
        System.out.println("Bike is running- run method from child class Bike");
    }

    public static void main(String args[]){
        Bike bike = new Bike();
        bike.run();

        //upcasting
        Vehicle vehicle = new Bike();
        vehicle.run();

        Vehicle vehicle1 = new Vehicle();
        vehicle1.run();
    }
}

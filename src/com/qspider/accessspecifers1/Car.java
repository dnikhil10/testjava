package com.qspider.accessspecifers1;

public class Car 
{
    public String carName;
    public int gears;
    public int passengers;
    public String gearType;
    public String carType;
    
    public Car()
    {
    	int gears=6;
    	int passengers=5;
    	System.out.println("Constant terms defined here");
    }
    public Car(String carName,String gearType,String carType)
    {
    	this.carName=carName;
    	this.carType=carType;
    	this.gearType=gearType;
    	System.out.println("variable types defined here");
    }
}

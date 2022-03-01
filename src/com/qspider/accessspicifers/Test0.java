package com.qspider.accessspicifers;

import com.qspider.accessspecifers1.Bike;
import com.qspider.accessspecifers1.Car;

public class Test0
{
     static int a=30;
     static boolean jump()
    {
    	System.out.println("Jump from the building");
    	return true;
    }
    public static void main(String[] args) 
	{
       a=40;
       System.out.println(a);
       System.out.println("hii");
       boolean done=jump();
       System.out.println(done);
       Test1 t1=new Test1("Maths",97,true);
       System.out.println("marks="+t1.marks);
       System.out.println("Subject="+t1.subject);
       System.out.println("Result="+t1.result);
       System.out.println("BikeName="+Bike.name);
       System.out.println(Bike.cc);
       System.out.println(Bike.speed);
       Bike.run("Java");
       
       Car r1=new Car("Hyundai","Automatic","petrol");
       System.out.println(r1.carName);
       System.out.println(r1.carType);
       System.out.println(r1.gears);
       System.out.println(r1.gearType);
       System.out.println(r1.passengers);
       
       Car r2=new Car("MG","Manual","EV");
       System.out.println(r2.carName);
       System.out.println(r2.carType);
       System.out.println(r2.gears);
       System.out.println(r2.gearType);
       System.out.println(r2.passengers);
      }
}

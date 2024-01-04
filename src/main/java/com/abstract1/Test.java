package com.abstract1;
import com.abstract1.Vehicle;
public class Test {
    public static void main(String[] args) {
       Motorcycle motorcycle1 = new Motorcycle();
       System.out.println(motorcycle1.getNoOfWheels());
       System.out.println(motorcycle1.cover());
       System.out.println(motorcycle1.seat());
    }
}

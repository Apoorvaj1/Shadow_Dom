package com.abstract1;

abstract public class Vehicle {

    public abstract int getNoOfWheels();
    public abstract int seat();
    public abstract int cover();
}

abstract class Bus extends Vehicle{
    public int getNoOfWheels() {
        return 8;
    }
    public int seat(){
        return 3;
    }
}

class Motorcycle extends Bus{
    public int getNoOfWheels(){
        return 2;
    }
    public int cover(){
        return 2;
    }
}

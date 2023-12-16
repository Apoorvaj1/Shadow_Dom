package org.shadowdom;

class P {
    public void property() {
        System.out.println("PROPERTY");
    }
    public void land(){
        System.out.println("LAND");
    }
}

class C extends P {
    public void property() {
        System.out.println("PROPERTY1");
    }
    public void apartment(){
        System.out.println("APARTMENT");
    }
}

class Overriding{
    public static void main(String... args){
        // parent class holding parent class object.
        P p = new P();
        p.property();

        // child class holding child class object.
        C c = new C();
        c.property();

        // parent class holding child class object.
        P p1 = new C();
        p1.property();

        //
    }
}


package com.assignments;

class Rectangle extends Assignment2Q5 {
    @Override
    public String draw() {
        System.out.println("[]");
        return null;
    }

}

class Line extends Assignment2Q5{
    @Override
    public String draw() {
            System.out.println("-----------");

        return null;
    }
}

class Cube extends Assignment2Q5{
    @Override
    public String draw() {
        System.out.println("Cube drawn");
        return null;
    }
}

public  abstract class Assignment2Q5{
    abstract public String draw();

    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        Cube obj1=new Cube();
        Line obj2=new Line();
        obj.draw();
        obj1.draw();
        obj2.draw();

    }
}
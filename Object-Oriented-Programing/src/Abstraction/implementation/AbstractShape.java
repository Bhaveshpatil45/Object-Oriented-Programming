package Abstraction.implementation;

import Abstraction.contact.Shape;

public abstract class AbstractShape implements Shape {
    public void draw(){
        System.out.println("Base shape drawn");
    }

}

package Abstraction;

import Abstraction.contact.Shape;
import Abstraction.implementation.AbstractShape;
import Abstraction.implementation.Circle;
import Abstraction.implementation.Rectangle;
import Abstraction.implementation.Square;

public class AbstractionDemo {
    public static void main(String[] args) {

        //data hiding with interface
        Shape shape = new Circle();
        shape.draw();
        
        shape = new Square();
        shape.draw();

        shape = new Rectangle();
        shape.draw();

        System.out.println("---------------------------");
        // Data hiding with abstract class
        AbstractShape abstractShape = new Circle();
        abstractShape.draw();

        abstractShape = new Rectangle();
        abstractShape.draw();

        abstractShape = new Square();
        abstractShape.draw();
    }
}

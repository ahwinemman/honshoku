package com.rukevwe.learn.OOP.Abstraction;

public class AbstractionProof {

    
    // This class know nothing about the implementation of the display method in the Circle class.
    // Note how the instantiation happens as interfaces cannot be instantiated.
    // So basically if I change the implementation of the method in Circle, I'm not affected.
    // Abstract Classes provide 0 to 100% abstraction since some of its methods may be implemented.
    public static void main(String[] args) {
        AbstractShape shape = new Circle();
        shape.display();
    }
}

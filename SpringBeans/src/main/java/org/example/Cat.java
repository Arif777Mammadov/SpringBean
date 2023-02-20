package org.example;

public class Cat extends Animal {
    // Public field can be accessed from anywhere
    public final String breed = "That's a cat, who cares?!";

    // Public constructor that sets the age field using the protected field from the parent class
    public Cat(int age) {
        this.age = age;
    }

    // Public method that overrides the makeSound method from the parent class
    /*@Override
    public void makeSound() {
        System.out.println("A cat meows");
    }*/
}

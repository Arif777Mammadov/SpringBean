package org.example;

public class Dog extends Animal{
    // Public field can be accessed from anywhere
    protected String breed;

    // Public constructor that sets the age field using the protected field from the parent class
    public Dog(int age) {
        this.age = age;
    }

    // Public method that overrides the makeSound method from the parent class
    @Override
    public void makeSound() {
        System.out.println("A dog barks");
    }
}

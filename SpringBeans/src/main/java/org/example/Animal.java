package org.example;

public class Animal {
    // Private field can only be accessed within the class
    private String name;
    // Protected field can be accessed within the class and any subclasses
    protected int age;

    // Public method can be accessed from anywhere
    public void setName(String name) {
        // Encapsulation: set private field using public method to control access
        this.name = name;
    }

    // Protected method can be accessed within the class and any subclasses
    protected String getName() {
        return name;
    }

    // Public method that will be overridden in subclasses
    public void makeSound() {
        System.out.println("An animal makes a sound");
    }

    public void react_to_human(){
        System.out.println("Runs away from human.");
    }
}

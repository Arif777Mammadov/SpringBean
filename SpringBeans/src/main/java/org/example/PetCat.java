package org.example;

public class PetCat extends Cat implements Pet{
    // Constructor
    public PetCat(int age) {
        super(age);
    }

    // New method for domestic pet
    public void react_to_human(){
        System.out.println("Cat listens...");
    }
}

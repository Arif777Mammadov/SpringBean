package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Create Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(MyBean.class);

        // Get Dog bean from application context
        Dog myDog = context.getBean(Dog.class);
        PetCat myCat = context.getBean(PetCat.class);

        // Access public field from the Dog class
        myDog.breed = "Labrador";
        // breed is final, so this code will give error
        //myCat.breed = "X";


        // Call public method from the Animal class to set private field
        myDog.setName("Buddy");
        myCat.setName("Fluffy");

        // Access protected field from the Animal class using protected method in the Dog class
        System.out.println(myDog.getName() + " is " + myDog.age + " years old. It is "+myDog.breed);
        System.out.println(myCat.getName() + " is " + myCat.age + " years old. Breed: "+myCat.breed);

        // Call public method that was overridden in the Dog class
        myDog.makeSound();
        myCat.makeSound();

        myDog.react_to_human();
        myCat.react_to_human();
    }
}
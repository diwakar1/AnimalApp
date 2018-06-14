package com.company;

public class Dog extends Animal {

    public Dog() {

        super();

        System.out.println(" I am a dog.");
    }

    @Override
    public String sleep() {
        return " tiger sleeps..";
    }

    @Override
    public String eat() {
        return " Tiger eats..";
    }
    public String bark(){

        return " A dog barks..";
    }
}

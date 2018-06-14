package com.company;

public class Cat extends Animal {

    public Cat() {

        super();
        System.out.println(" I am a cat ");


    }

    @Override
    public String sleep(){
        return "a cat sleeps...";

    }
    @Override
    public String eat(){

        return "a cat eats";
    }

    public String eatRat(){
        return "a cat eats rat ..";

    }


}

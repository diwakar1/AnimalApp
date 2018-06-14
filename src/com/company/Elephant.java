package com.company;

public class Elephant extends Animal {

    public Elephant() {

        System.out.println(" I am a elephant.");


    }


    @Override
    public String sleep(){
        return "An Elephant sleeps...";

    }
    @Override
    public String eat(){

        return "An Elephant eats";
    }

    public String carryMen(){
        return "A elephant carry people..";

    }


}

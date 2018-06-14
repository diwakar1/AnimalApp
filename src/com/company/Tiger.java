package com.company;

public class Tiger extends Animal {

    public Tiger() {

       super();
        System.out.println(" I am a tiger");

    }
    @Override
    public String sleep(){
        return "a tiger sleeps...";

    }
    @Override
    public String eat(){

        return "A tiger eats";
    }

    public String preyAnimal(){
        return "A tiger preys on animal.";

    }


}

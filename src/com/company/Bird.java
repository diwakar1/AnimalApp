package com.company;

public class Bird extends Animal {


    public Bird() {

        super();
        System.out.println(" I am a bird");
    }
    @Override
    public String sleep(){
        return "a bird sleeps...";

    }
     @Override
    public String eat(){

        return "a bird eats";
    }

    public String fly(){
        return "a bird fly..";

    }

    public String makeNest(){

        return "A bird makes nest";
    }
}

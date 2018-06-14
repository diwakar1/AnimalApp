package com.company;

public class Parrot extends Bird {
    public Parrot() {

        System.out.println(" I am a parrot");
    }
    @Override
    public String sleep(){
        return "a parrot sleeps...";

    }
    @Override
    public String eat(){

        return "a parrot eats";
    }

    public String liveTemple(){
        return "A parrot lives in Temple";

    }

    public String makeNest(){

        return "A Parrot makes nest";
    }
}

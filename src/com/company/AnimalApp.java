package com.company;

public class AnimalApp{

    public static void main(String[] args) {


            Animal a = new Animal();
            print(a.eat());
            print(a.sleep());
            System.out.println("=====================================================");

            Cat c = new Cat();
            print(c.eat());
            print(c.sleep());
            print(c.eatRat());
            System.out.println("=====================================================");


            Bird b = new Bird();
            print(b.eat());
            print(b.sleep());
            print(b.fly());
            print(b.makeNest());
            System.out.println("=====================================================");

        Tiger t = new Tiger();
        print(t.eat());
        print(t.sleep());
        print(t.preyAnimal());
        System.out.println("=====================================================");

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());
        System.out.println("=====================================================");

        Elephant e = new Elephant();
        print(e.eat());
        print(e.sleep());
        print(e.carryMen());
        System.out.println("=====================================================");

        Parrot p = new Parrot();
        print(p.eat());
        print(p.sleep());
        print(p.liveTemple());
        System.out.println("=====================================================");

        }
        private static void print(String s){

            System.out.println(s);
        }


    }
package fr.exo06;


public class Person {
    protected int age;

    public Person(){

    }

    public Person(int age){
        this.age = age;
    }

    public String SayHello() {
        String hello = "Hello";
        return hello;
    }


    public int setAge(int age) {
        this.age = age;
        return age;
    }
}

package com.adrianlearning.com.adrianlearning.OOP;

public class Perro {

    public String name;
    Integer age;

    public Perro() {
    }

    public Perro(String name) {
        this.name = name;
    }


    public Perro(Integer age) {
        this.age = age;
    }

    public Perro (String name , Integer age){
        this.age = age;
        this.name = name;
    }


    public void ladrar() {
        System.out.println("Ladrando");
    }

    private void describeAge() {
        System.out.println("The age of the dog is " + this.age);
    }

    private  void describeName(){
        System.out.println("The name of the dog is "+ this.name);
    }

    public void describeNameAndAge(){
        this.describeName();
        this.describeAge();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age > 5) {
            this.age = age + 1;
        }
    }
}




package com.adrianlearning.com.adrianlearning.OOP.overriden;

public class Movement {

    public static void main(String[] args) {
        Movement movement = new Movement();
        CarMovement carMovement = new CarMovement();
        movement.move();
        carMovement.move();
        carMovement.move(50);
    }

    void move() {
        System.out.println("This object movement is 5km/h");
    }

    void description() {
        System.out.println("This is an object");
    }
}

class CarMovement extends Movement{
    @Override
    void move() {
        System.out.println("This is the new movement 15km/h ");
    }

    void move(Integer speed) {
        System.out.println("This is the new movement :" + speed + " kh/H");
    }
}

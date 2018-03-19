package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) {

        Car myCar = new GPS(new AC(new BasicCar()));
        Car myCar2 = new Tinted(new BasicCar());
        Car myCar3 = new Tinted(myCar2);  //2x tinted windows

        System.out.println(myCar2.getPrice());
        System.out.println(myCar2.getDescription());
        System.out.println(myCar.getPrice());
        System.out.println(myCar3.getDescription());
    }

}

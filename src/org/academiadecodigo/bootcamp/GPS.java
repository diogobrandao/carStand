package org.academiadecodigo.bootcamp;

public class GPS extends CarDecorator {


    public GPS(Car decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 300;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "GPS";
    }
}

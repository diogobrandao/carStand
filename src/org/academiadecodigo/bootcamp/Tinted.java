package org.academiadecodigo.bootcamp;

public class Tinted extends CarDecorator {


    public Tinted(Car decoratorCar) {
        super(decoratorCar);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " tinted windows ";
    }
}

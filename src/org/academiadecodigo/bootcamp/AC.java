package org.academiadecodigo.bootcamp;

public class AC extends CarDecorator {
    public AC(Car decoratorCar) {
        super(decoratorCar);
    }

    //overrides


    @Override
    public int getPrice() {
        return super.getPrice() + 3000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "AC";
    }
}

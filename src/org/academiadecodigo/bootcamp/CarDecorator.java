package org.academiadecodigo.bootcamp;

abstract public class CarDecorator implements Car {  //implements the interface
    Car decoratorCar;
    private int price;
    private String description;

    public CarDecorator(Car decoratorCar){
        this.decoratorCar = decoratorCar;
    }

    public int getPrice(){
        return decoratorCar.getPrice();
    }

    @Override
    public String getDescription() {
        return decoratorCar.getDescription();
    }
}

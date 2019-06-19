package opp.polymorphism;

import opp.abstraction.AbstractCar;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
        System.out.println("Driver name is " + this.name);
            }

    public void driveCar(int speed, AbstractCar car){
        car.drive(speed);
    }
    public void stopCar(AbstractCar car){
        car.stop();
    }
}
 

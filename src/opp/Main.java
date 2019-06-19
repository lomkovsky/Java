package opp;

import opp.inheritance.CayennePorscheCar;
import opp.polymorphism.Driver;

public class Main {

	public static void main(String[] args) {

		CayennePorscheCar CayennePorscheCar = new CayennePorscheCar(2019, 220, "red");
		Driver driver = new Driver("Dmitro");
		driver.driveCar(150, CayennePorscheCar);
		driver.stopCar(CayennePorscheCar);
		CayennePorscheCar.changeColour("Back");
		driver.driveCar(opp.inheritance.CayennePorscheCar.maxSpeed(), CayennePorscheCar);
	}

}

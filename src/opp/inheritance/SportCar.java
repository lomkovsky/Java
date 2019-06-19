package opp.inheritance;

import opp.abstraction.AbstractCar;

public abstract class SportCar extends AbstractCar {

private static int maxSpeed; 

public SportCar(int year, int maxSpeed) {
super(year);
SportCar.setMaxSpeed(maxSpeed);
}

public static int getMaxSpeed() {
	return maxSpeed;
}

public static void setMaxSpeed(int maxSpeed) {
	SportCar.maxSpeed = maxSpeed;
}
}


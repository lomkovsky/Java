package opp.inheritance;

public class CayennePorscheCar extends PorscheCar {
	private String color;

    public CayennePorscheCar(int year, int maxSpeed, String color) {
        super(year, maxSpeed);
        this.color = color;
        System.out.println("Current color is " + this.color);
}
public void changeColour(String color){
	this.color = color;
    System.out.println("Changing color to " + color);
}
public static int maxSpeed() {
	return SportCar.getMaxSpeed();
	}
}

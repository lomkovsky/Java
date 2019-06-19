package opp.abstraction;

public abstract class AbstractCar {
    private int year;

    public AbstractCar(int year) {
        this.year = year;
        System.out.println("Year of car is " + this.year);
    }
    public abstract void drive(int inputSpeed);
    public abstract void stop ();
}

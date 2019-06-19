package opp.inheritance;

public abstract class PorscheCar extends SportCar {
		public PorscheCar(int year, int maxSpeed) {
        super(year, maxSpeed);
    }

    @Override
    public void drive(int inputSpeed) {
        System.out.println("Start driving with speed " + inputSpeed);
    }

    @Override
    public void stop() {
        System.out.println("Stop driving");
    }
   
}

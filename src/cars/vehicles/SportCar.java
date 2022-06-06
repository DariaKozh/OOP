package cars.vehicles;

import cars.details.Engine;
import cars.professions.Driver;

public final class SportCar extends Car {

    private double speed;

    public SportCar(String carClass, String marka, int weight, Driver driver, Engine engine, double speed) {
        super(carClass, marka, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed: " + speed;
    }

}

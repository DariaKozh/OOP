package cars.vehicles;

import cars.details.Engine;
import cars.professions.Driver;

public final class Lorry extends Car {
    private int carrying;

    public Lorry(String carClass, String marka, int weight, Driver driver, Engine engine, int carrying) {
        super(carClass, marka, weight, driver, engine);
        this.carrying = carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    @Override
    public String toString() {
        return super.toString() + ", carrying: " + carrying;
    }
}

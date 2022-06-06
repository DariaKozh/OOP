package cars.vehicles;

import cars.details.Engine;
import cars.professions.Driver;

public class Car {

    private String carClass;
    private String marka;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String carClass, String marka, int weight, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.marka = marka;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("carClass: ").append(carClass).append(", marka: ").append(marka).append(", weight: ")
                .append(weight).append(", driver: ").append(driver.getFullName()).append(", engine: ")
                .append(engine.getCompany()).append(engine.getPower());

        return result.toString();
    }


}

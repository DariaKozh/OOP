package cars.vehicles;

import cars.details.Engine;
import cars.professions.Driver;

public class Main {

    public static void main(String[] args) {

        Driver bmwDriver = new Driver("Tolia Rusov", 25, 5);
        Engine bmwEngine = new Engine("BMW", 180);
        Car car = new Car("A", "BMW", 5000, bmwDriver, bmwEngine);

        Driver lorryDriver = new Driver("Петров В.В.", 45,12);
        Engine lorryEngine = new Engine("LorryEngine", 150);
        Lorry lorry = new Lorry("D", "Грузовик", 8000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver("Сидоров В.В.", 30, 10);
        Engine sportEngine = new Engine("SportEngine", 300 );
        SportCar sportCar = new SportCar("A", "SportCar", 4000, sportDriver, sportEngine, 300);

        System.out.println(sportCar.toString());


    }
}

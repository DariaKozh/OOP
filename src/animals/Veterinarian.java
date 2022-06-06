package animals;

public class Veterinarian {

    private String name;
    private int age;

    public Veterinarian(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void treatAnimal(Animal animal){
        System.out.println(animal.getType() + " ест " + animal.getFood() + ", его локация " + animal.getLocation()
        + ". Пришел лечиться к ветеринару " + name);
    }
}

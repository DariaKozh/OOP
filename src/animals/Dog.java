package animals;

public class Dog extends Animal{
    private final String TYPE = "Dog";
    private String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected String getType(){
        return TYPE;
    }

    @Override
    public void makeNoise() {
        System.out.println(TYPE + " гавкает");
    }

    @Override
    public void eat() {
        System.out.println(TYPE + " ест " + super.getFood());
    }

}

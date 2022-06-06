package animals;

public class Cat extends Animal{
    private final String TYPE = "Cat";
    private String name;

    public Cat(String food, String location, String name) {
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
        System.out.println(TYPE + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println(TYPE + " ест " + super.getFood());
    }

}

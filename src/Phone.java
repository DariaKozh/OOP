public class Phone {

    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {

        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {

        System.out.println("Звонит " + name);
    }

    public void sendMessage (int ... number){
        for (int n : number) {
            System.out.println(n + " ");
        }
    }

    public Phone (int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
    }
}

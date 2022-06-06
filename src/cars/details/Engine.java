package cars.details;

public final class Engine {

    private String company;
    private int power;

    public Engine(String company, int power) {
        this.company = company;
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public int getPower() {
        return power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

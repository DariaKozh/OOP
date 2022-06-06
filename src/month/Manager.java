package month;

public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }


    @Override
    public double getSalary(Month[] monthArray) {
        double result = 0;
        if (getNumberOfSubordinates() > 0) {
            for (int i = 1; i <= getNumberOfSubordinates(); i++) {
                result = super.getSalary(monthArray) * 1.01;
            }
        }
        return super.getSalary(monthArray);
    }
}

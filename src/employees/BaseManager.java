package employees;

public abstract class BaseManager extends Worker{

    private int numberOfSubordinates;

    public BaseManager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    protected abstract int getIndex();

    @Override
    public double getSalary() {
        if (getNumberOfSubordinates() > 0) {
            return super.getSalary() * getNumberOfSubordinates() / 100.0 * getIndex();
        } else {
            return super.getSalary();
        }
    }
}

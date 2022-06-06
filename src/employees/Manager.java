package employees;

public final class Manager extends BaseManager {

    private static final int INDEX = 3;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return INDEX;
    }
}
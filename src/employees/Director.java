package employees;

public final class Director extends BaseManager{

    private static final int INDEX = 9;

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return INDEX;
    }
}

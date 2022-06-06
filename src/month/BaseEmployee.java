package month;

import common.IEmployee;

public abstract class BaseEmployee implements IEmployee {

    private String name;
    private int age;
    private char gender;
    private double salary;

    public BaseEmployee(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWorkDays();
        }

        return result;
    }
}

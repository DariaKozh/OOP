package month;

public class Main {

    public static void main(String[] args) {

        Month m1 = MonthUtils.getMonth(0);
        Month m2 = MonthUtils.getMonth(1);
        Month m3 = MonthUtils.getMonth(2);
        Month[] monthArray = {m1, m2, m3};

        Employee e1 = new Employee("Zad", 19, 'm', 1000);
        System.out.println(e1.getSalary(monthArray));

        Manager man1 = new Manager("Zad", 19, 'm', 1000,4);
        System.out.println(man1.getSalary(monthArray));

        Month[] monthArrayQuarter3 = MonthUtils.getQuarter3();
        System.out.println(man1.getSalary(monthArrayQuarter3));

    }
}

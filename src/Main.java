import biblio.Book;
import biblio.Reader;
import employees.*;
import common.IEmployee;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //  Phone phone1 = new Phone();
        //  phone1.number = 9523748;
        //  phone1.model = "Sumsung";
        //  phone1.weight = 369.3;

        Phone phone1 = new Phone(9523748, "Sumsung", 369.3);
        Phone phone2 = new Phone(9637584, "LG", 452.1);
        Phone phone3 = new Phone(9878748, "Asus");

        phone1.receiveCall("Оля");
        phone2.receiveCall("Зина");
        phone3.receiveCall("Олег", 9996362);
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        phone2.setNumber(9997744);
        System.out.println(phone2.getNumber());
        System.out.println("-----------------------");
        phone1.sendMessage(9564784, 8789655, 4577474);

        Person person1 = new Person("Ирина Петрова", 41);
        Person person2 = new Person();
        System.out.println(person1.getAge());
        person2.setAge(54);
        System.out.println(person2.getAge());

        System.out.println("-----------------------");

        Reader reader1 = new Reader("Петрова Анна", 544, "Экономический факультет",
                "12.03.1989", 9589699);

        Reader reader2 = new Reader("Смирнов Петя", 578, "Исторический факультет",
                "15.05.2001", 3669652);

        reader1.takeBook(12);
        reader2.takeBook("История", "Энциклопедия", "Рассказы");

        Book book1 = new Book("Энциклопедия", "Игнатов Ю.Л.");
        Book book2 = new Book("История", "Тостой Р.Т.");
        Book book3 = new Book("Рассказы", "Петровский А.П.");

        reader1.takeBook(book2, book3);
        reader2.returnBook(17);
        reader1.returnBook("Азия", "Фандорин");
        reader2.returnBook(book3, book1);
        System.out.println(reader1.getFaculty());

        System.out.println(Arrays.toString(reader1.arrayReaders(reader1, reader2)));

        System.out.println("-----------------------");
        Manager m1 = new Manager("Костя Крюков", 1000, 60);
        Manager m2 = new Manager("Илья Сидоров", 800, 70);
        Manager m3 = new Manager("Спиридон Петров", 900, 59);
        Manager[] managersArray = {m1, m2, m3};
        System.out.println(EmployeeUtils.getMaxNumberOfSubordinates(managersArray));
        System.out.println(EmployeeUtils.getMinNumberOfSubordinates(managersArray));
        System.out.println(EmployeeUtils.getMaxIncrease(managersArray));
        System.out.println(EmployeeUtils.getMinIncrease(managersArray));

        System.out.println("-----------------------");
        System.out.println(m1.getSalary());
        Director d1 = new Director("Oliver Dy", 1200, 20);
        System.out.println(d1.getSalary());
        System.out.println("-----------------------");

        Worker w1 = new Worker("Jik", 23000);
        Worker w2 = new Worker("Dina", 21000);
        Worker w3 = new Worker("Zef", 27000);

        Worker[] workerArray = {w1, w2, w3};
        System.out.println(EmployeeUtils.searchWorkerOfName(workerArray, "Dina").getName());
        System.out.println(EmployeeUtils.searchWorkerOfPartName(workerArray, "Z").getName());
        System.out.println(EmployeeUtils.getAllSalary(workerArray));
        System.out.println(EmployeeUtils.getMinSalary(workerArray));
        System.out.println(EmployeeUtils.getMaxSalary(workerArray));

        Worker[] workers = {w1, m1, d1};
        System.out.println(EmployeeUtils.getAllSalary(workers));

        IEmployee worker1 = new Worker("George", 1200);
        IEmployee worker2 = new month.Manager("Kol", 32, 'M', 1000, 15);

        IEmployee[] employeeArray = {worker1, worker2};
        for (int i = 0; i < employeeArray.length; i++){
            System.out.println(employeeArray[i].getName() + " - " + employeeArray[i].getSalary());
        }

        IEmployee.println("123");
        worker1.print("123");

    }
}

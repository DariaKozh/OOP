package employees;

public class EmployeeUtils {

    //поиск сотрудника в массиве по его имени
    public static Worker searchWorkerOfName(Worker [] workerArray, String name){
        for (int i = 0; i < workerArray.length; i++){
            if (workerArray[i].getName().equals(name)){

                return workerArray[i];
            }
        }

        return null;
    }
    //поиск сотрудника в массиве по вхождению указанной строки в его имени
    public static Worker searchWorkerOfPartName (Worker [] workerArray, String nameContains){
        for (int i = 0; i < workerArray.length; i++){
            if (workerArray[i].getName().contains(nameContains)){

                return workerArray[i];
            }
        }

        return null;
    }
    //подсчет зарплатного бюджета для всех сотрудников в массиве
    public static double getAllSalary (Worker [] workerArray){
        double sum = 0;
        for (int i = 0; i < workerArray.length; i++){
            sum += workerArray[i].getSalary();
        }

        return sum;
    }

    //поиск наименьшей зарплаты в массиве
    public static double getMinSalary (Worker [] workerArray){
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < workerArray.length; i++){
            if (min > workerArray[i].getSalary()){
                min = workerArray[i].getSalary();
            }
        }

        return min;
    }
    //поиск наибольшей зарплаты в массиве
    public static double getMaxSalary (Worker [] workerArray){
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < workerArray.length; i++){
            if (max < workerArray[i].getSalary()){
                max = workerArray[i].getSalary();
            }
        }

        return max;
    }
    //поиск наименьшего количества подчиненных в массиве менеджеров
    public static int getMinNumberOfSubordinates (Manager [] managersArray){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managersArray.length; i++){
            if (min > managersArray[i].getNumberOfSubordinates()){
                min = managersArray[i].getNumberOfSubordinates();
            }
        }

        return min;
    }

    //поиск наименьшего количества подчиненных в массиве менеджеров - 2й вариант возвращаем менеджера
    public static Manager getMinNumberOfSubordinates2 (Manager [] managersArray){
        Manager min = null;
        for (int i = 0; i < managersArray.length; i++){
            if (min == null || min.getNumberOfSubordinates() > managersArray[i].getNumberOfSubordinates()){
                min = managersArray[i];
            }
        }

        return min;
    }


    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static int getMaxNumberOfSubordinates (Manager [] managersArray){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < managersArray.length; i++){
            if (max < managersArray[i].getNumberOfSubordinates()){
                max = managersArray[i].getNumberOfSubordinates();
            }
        }

        return max;
    }
    //поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    public static double getMaxIncrease (Manager [] managersArray){
        double maxIncrease = Integer.MIN_VALUE;
        for (int i = 0; i < managersArray.length; i++){
            if (maxIncrease < (managersArray[i].getSalary() - managersArray[i].getBaseSalary())){
                maxIncrease = (managersArray[i].getSalary() - managersArray[i].getBaseSalary());
            }
        }

        return maxIncrease;
    }
    //поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static double getMinIncrease (Manager [] managersArray){
        double minIncrease = Integer.MAX_VALUE;
        for (int i = 0; i < managersArray.length; i++){
            if (minIncrease > (managersArray[i].getSalary() - managersArray[i].getBaseSalary())){
                minIncrease = (managersArray[i].getSalary() - managersArray[i].getBaseSalary());
            }
        }

        return minIncrease;
    }
}

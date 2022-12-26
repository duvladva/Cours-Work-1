import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CourseWork.printAllWorkers();
        System.out.println("Ежемесячные затраты на зарплату: "+ CourseWork.calculateTotalSalary());
        System.out.println("Минимальный оклад у сотрудника: "+ CourseWork.findWorkerWithMinSalary());
        System.out.println("Максимальный оклад у сотрудника: "+ CourseWork.findWorkerWithMaxSalary());
        System.out.println("Среднее значение оклада среди всех сотрудников: "+ CourseWork.calculateMiddleSalary());
        System.out.println("Список всех сотрудников: ");
        CourseWork.printListAllWorkers();

    }

}
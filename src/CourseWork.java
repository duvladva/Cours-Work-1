public class CourseWork {

    private static final Employee[] personal = {
            new Employee("Алексей Алексеевич Алексеев", 1, 46000),
            new Employee("Борис Борисович Борисов", 2, 45000),
            new Employee("Алексей Алексеевич Алексеев", 3, 44000),
            new Employee("Василий Васильевич Васильев", 4, 43000),
            new Employee("Геннадий Геннадьевич Геннадьев", 5, 42000),
            new Employee("Дмитрий Дмитриевич Дмитриев", 1, 47500),
            new Employee("Евгений Евгеньевич Евгеньев", 2, 44500)
    };

    public static void printAllWorkers() {
        for (Employee worker : personal) {
            System.out.println(worker);
        }
    }

    public static int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee worker : personal) {
            totalSalary += worker.getSalary();
        }
        return totalSalary;
    }

    public static Employee findWorkerWithMinSalary() {
        Employee workerWithMinSalary = personal[0];
        int minSalary = personal[0].getSalary();
        for (Employee worker : personal) {
            if (minSalary > worker.getSalary()) {
                minSalary = worker.getSalary();
                workerWithMinSalary = worker;
            }
        }
        return workerWithMinSalary;
    }

    public static Employee findWorkerWithMaxSalary() {
        Employee workerWithMaxSalary = personal[0];
        int maxSalary = personal[0].getSalary();
        for (Employee worker : personal) {
            if (maxSalary < worker.getSalary()) {
                maxSalary = worker.getSalary();
                workerWithMaxSalary = worker;
            }
        }
        return workerWithMaxSalary;
    }
    public static double calculateMiddleSalary() {
        double middleSalary = 0;
        int totalSalary = 0;
        int totalWorkers = 0;
        for (Employee worker : personal) {
            totalSalary += worker.getSalary();
            totalWorkers++;
        }
        middleSalary = totalSalary/totalWorkers;
        return middleSalary;
    }

    public static void printListAllWorkers() {
        for (Employee worker : personal) {
            System.out.println(worker.getFullName());
        }
    }

}

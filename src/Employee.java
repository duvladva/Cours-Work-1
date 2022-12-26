public class Employee {
    private String fullName;
    private Integer departmentId;
    private Integer salary;
    private final Integer id;
    private static Integer register = 1;

    public Employee(String fullName, Integer departmentId, Integer salary) {
        this.fullName = fullName;
        this.departmentId = departmentId;
        this.salary = salary;
        this.id = register++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.departmentId = department;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + id + ", ФИО: " + fullName + ", отдел № "+ departmentId + ", оклад: " +salary;
    }
}

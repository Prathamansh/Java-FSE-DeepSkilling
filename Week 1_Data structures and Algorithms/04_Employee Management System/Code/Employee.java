public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private double salary;
    public Employee(String employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void display() {
        System.out.println("ID: " + employeeId + ", Name: " + name +
                ", Position: " + position + ", Salary: " + salary);
    }
}

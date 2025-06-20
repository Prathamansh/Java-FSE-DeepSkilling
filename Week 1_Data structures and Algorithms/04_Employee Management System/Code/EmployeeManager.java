public class EmployeeManager {
    private Employee[] employees;
    private int count;
    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }
    // Add employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee list is full.");
        }
    }
    // Search employee
    public void searchEmployee(String empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    // display all)
    public void displayAll() {
        if (count == 0) {
            System.out.println("No employees found.");
        } else {
            for (int i = 0; i < count; i++) {
                employees[i].display();
            }
        }
    }
    // Delete employee
    public void deleteEmployee(String empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(empId)) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employeeMap;

    public EmployeeBook() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        if (!employeeMap.containsKey(employee.getFullName())) {
            employeeMap.put(employee.getFullName(), employee);
        } else {
            System.out.println("Сотрудник с таким ФИО уже существует");
        }
    }

    public void removeEmployee(String fullName) {
        employeeMap.remove(fullName);
    }

    public Employee findEmployee(String fullName) {
        return employeeMap.get(fullName);
    }
}


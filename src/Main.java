public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        Employee employee1 = new Employee("Иванов Иван Иванович");
        book.addEmployee(employee1);

        Employee employee2 = new Employee("Петров Петр Петрович");
        book.addEmployee(employee2);

        Employee employee3 = new Employee("Иванов Иван Иванович");
        book.addEmployee(employee3);

        book.removeEmployee("Петров Петр Петрович");

        Employee foundEmployee = book.findEmployee("Иванов Иван Иванович");
        if (foundEmployee != null) {
            System.out.println("Найден сотрудник: " + foundEmployee.getFullName());
        } else {
            System.out.println("Сотрудник не найден");
        }
    }
}
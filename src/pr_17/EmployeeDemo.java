package pr_17;

public class EmployeeDemo {
    public static Employee retrieveEmployeeFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Egor");
        employee.setDepartment("ikbo");
        employee.setSalary(4000);
        return employee;
    }
    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        controller.setEmployeeSalary(5000);
        System.out.println("\n\nПосле изменений:");
        controller.updateView();
    }
}

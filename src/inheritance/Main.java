package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();

        customer.firstName="ahmet";

        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();

        customerManager.List();
        employeeManager.BestEmployee();
        employeeManager.Add();


    }
}
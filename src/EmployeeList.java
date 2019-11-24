import java.util.List;

public class EmployeeList {
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        StringBuilder employeeList = new StringBuilder();
        for(Employee employee: this.employees) {
            employeeList.append(employee.toString()).append("\n");
        }
        return employeeList.toString();
    }
}

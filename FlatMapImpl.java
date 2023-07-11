import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;
}
class Department
{
    int id;
    int name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    List<Employee> employeeList;
}

public class FlatMapImpl {
    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();
        Map<Integer, Double> idToSalary = departmentList.stream().flatMap(department -> department.getEmployeeList().stream()).collect(Collectors.toMap(Employee::getId,Employee::getSalary));
    }
}

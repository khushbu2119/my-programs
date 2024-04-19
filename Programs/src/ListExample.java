import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, "Khushbu", "9979680556",3000, "382481"));
        employeeList.add(new Employee(2, "Dipen", "9979680556",10000, "382481"));
        employeeList.add(new Employee(3, "Deep", "9979680556",8000, "382481"));
        employeeList.add(new Employee(4, "Kinjal", "9979680556",3000, "382481"));

        System.out.println("All the employees name: ");
        for(Employee e : employeeList) {
            System.out.println(e.getName());
        }

        Employee e = getEmployeeByName(employeeList, "Dipen");
        System.out.println(e.toString());

        List<Employee> l = getEmployeeByPinCode(employeeList, "382481");
        for(Employee value : l) {
            System.out.println(value.getName() + " " + value.getPinCode());
        }

        List<Employee> l1 = getEmployeeBySalary(employeeList, 5000);
        for(Employee value : l1) {
            System.out.println(value.getName() + " " + value.getSalary());
        }

        Employee e1 = getEmployeeWithMaxSalary(employeeList);
        System.out.println("Max salary employee" + e1.toString());
    }

    public static Employee getEmployeeByName(List<Employee> emp, String name) {
        for(Employee e : emp) {
            if(e.getName().equals(name)){
                return e;
            }
        }
        return null;
    }

    public static List<Employee> getEmployeeByPinCode(List<Employee> emp, String pinCode) {
        List<Employee> l = new ArrayList<>();
        for(Employee e : emp) {
            if(e.getPinCode().equals(pinCode)){
                l.add(e);
            }
        }
        return l;
    }

    public static List<Employee> getEmployeeBySalary(List<Employee> emp, int salary) {
        List<Employee> l = new ArrayList<>();
        for(Employee e : emp) {
            if(e.getSalary() > salary){
                l.add(e);
            }
        }
        return l;
    }

    public static Employee getEmployeeWithMaxSalary(List<Employee> emp) {
        Employee maxSalaryEmp = emp.get(0);
        for(Employee e : emp) {
            if(e.getSalary() > maxSalaryEmp.getSalary()){
                maxSalaryEmp = e;
            }
        }
        return maxSalaryEmp;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private String phoneNumber;
    private String pinCode;
    private int salary;

    public Employee (int id, String name, String phoneNumber, int salary, String pinCode) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.pinCode = pinCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getPhoneNumber() + " " + getSalary() + " " + getPinCode();
    }
}


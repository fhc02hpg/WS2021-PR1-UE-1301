package org.campus02.emp;

import java.util.ArrayList;

public class EmployeeManager {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
        for (Employee e : employees) {
            if(e.getEmpNumber() == number) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department) {

        ArrayList<Employee> found = new ArrayList<>();
        for (Employee e : employees) {
            if(e.getDepartment().equals(department)) {
                found.add(e);
            }
        }
        return found;

    }

}

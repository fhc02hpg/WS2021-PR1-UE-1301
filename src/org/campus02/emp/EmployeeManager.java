package org.campus02.emp;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, ArrayList<Employee>> getAllEmployeesPerDepartment() {

        HashMap<String, ArrayList<Employee>> resultMap = new HashMap<>();

        for(Employee e : employees) {
            if(resultMap.containsKey(e.getDepartment())) {
                //update the map value by adding 1 more employee
                ArrayList<Employee> list = resultMap.get(e.getDepartment());
                list.add(e);
                resultMap.put(e.getDepartment(),list);
            } else {
                //put dept with list and 1 employee
                ArrayList<Employee> list = new ArrayList<>();
                list.add(e);
                resultMap.put(e.getDepartment(),list);
            }
        }

        return resultMap;

    }

    public HashMap<String, Integer> getNumberOfEmployeesPerDepartment() {
        HashMap<String, Integer> resultMap = new HashMap<>();
        for(Employee e : employees) {
            if(resultMap.containsKey(e.getDepartment())) {
                resultMap.put(e.getDepartment(),
                    resultMap.get(e.getDepartment())+1);
            } else {
                resultMap.put(e.getDepartment(),1);
            }
        }
        return resultMap;
    }

    public HashMap<String, Double> getTotalSalaryCostPerDepartment() {
        HashMap<String, Double> resultMap = new HashMap<>();
        for(Employee e : employees) {
            if(resultMap.containsKey(e.getDepartment())){
                resultMap.put(e.getDepartment(),
                    resultMap.get(e.getDepartment())+e.getSalary());
            } else {
                resultMap.put(e.getDepartment(),e.getSalary());
            }
        }
        return resultMap;
    }






}

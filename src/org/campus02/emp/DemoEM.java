package org.campus02.emp;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoEM {

    public static void main(String[] args) {

        EmployeeManager em = new EmployeeManager();

        em.addEmployee(new Employee(1000,"Kim",3800.00,"Finance"));
        em.addEmployee(new Employee(1001,"Jane",5000.00,"Engineering"));
        em.addEmployee(new Employee(1002,"Chris",4900.00,"Marketing"));
        em.addEmployee(new Employee(1003,"Eva",4000.00,"Engineering"));
        em.addEmployee(new Employee(1004,"Jennifer",3500.00,"Sales"));
        em.addEmployee(new Employee(1005,"Keith",3750.00,"Sales"));
        em.addEmployee(new Employee(1006,"Peter",3000.00,"Education"));
        em.addEmployee(new Employee(1007,"Joane",4500.00,"Engineering"));

        //1) employee list per department
        //k: Finance, v: [Kim]
        //k: Sales, v: [Jennifer,Keith]
        //...
        HashMap<String, ArrayList<Employee>> result1 = em.getAllEmployeesPerDepartment();
        System.out.println(result1);

        //2) employee count per department
        //k: Finance, v: 1
        //k: Sales, v: 2
        //...
        HashMap<String,Integer>  result2 = em.getNumberOfEmployeesPerDepartment();
        System.out.println(result2);

        //3) employee count per department
        //k: Finance, v: 3800
        //k: Sales, v: 7250
        //...
        HashMap<String,Double>  result3 = em.getTotalSalaryCostPerDepartment();
        System.out.println(result3);



    }

}



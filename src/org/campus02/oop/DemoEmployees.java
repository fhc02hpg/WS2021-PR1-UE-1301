package org.campus02.oop;

public class DemoEmployees {

  public static void main(String[] args) {

    Employee e1 = new Employee("Mustermann","Max","HR",3000.00);
    System.out.println(e1.lastname + " " + e1.firstname + ": "+
        e1.getFullSalary());

    FixCommissionEmployee fe2 = new FixCommissionEmployee(
        "Siliva","Musterfrau","Marketing",3750.0,250.00
    );

    System.out.println(fe2.lastname + " " + fe2.firstname + ": "+
        fe2.getFullSalary());

    PercentCommissionEmployee pe3 = new PercentCommissionEmployee(
        "Ano","Nym","Engineering",2500,0.2
    );

    System.out.println(pe3.lastname + " " + pe3.firstname + ": "+
        pe3.getFullSalary());

  }

}

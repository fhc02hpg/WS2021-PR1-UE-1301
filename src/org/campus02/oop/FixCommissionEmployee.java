package org.campus02.oop;

public class FixCommissionEmployee extends Employee {

  protected double additionalCommission;

  public FixCommissionEmployee(String lastname, String firstname, String department,
      double baseSalary, double additionalCommission) {
    super(lastname, firstname, department, baseSalary);
    this.additionalCommission = additionalCommission;
  }

  @Override
  public double getFullSalary() {
    return super.getFullSalary() + additionalCommission;
  }

}

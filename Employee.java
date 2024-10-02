package day5;

public class Employee extends Person {
  public void work() {
	  super.work();
	  System.out.println("Employeee Work");
  }
  public void getSalary() {
	
	  System.out.println("Employee Salary");
  }
}

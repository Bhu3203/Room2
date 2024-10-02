package day5;

public class HrManager extends Employee {

	public void work() {
		super.work();
		System.out.println("Hrmanager work");
	}
	public void getSalary() {
		super.getSalary();
		System.out.println("HrManager Salary");
	}
	public void addEmployee() {
		System.out.println("HrManager Add Employee ");
	}
}

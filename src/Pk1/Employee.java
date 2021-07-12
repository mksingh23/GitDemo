package Pk1;

public class Employee {
	private int Emp_id;
	int salary;
	String name;
	public Employee() {
		super();
	}
	public Employee(int emp_id, int salary, String name) {
		super();
		Emp_id = emp_id;
		this.salary = salary;
		this.name = name;
	}
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public void salary() {
		System.out.println("Employee Salary :" + salary);
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", salary=" + salary + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		Employee emp = new Employee(23,12340,"Mohit");
	}
}

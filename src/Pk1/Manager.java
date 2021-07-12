package Pk1;

public class Manager extends Employee{
	int hours;
	int rate;
	
	public Manager() {
		super();
	}
	public Manager(int Emp_id, int salary, String name,int hours, int rate) {
		super(Emp_id, salary, name);
		this.hours = hours;
		this.rate = rate;
	}
	public void salary() {
		System.out.println("Manager Salary :" + salary);
	}
	@Override
	public String toString() {
		return "Manager [hours=" + hours + ", rate=" + rate + ", salary=" + salary + ", name=" + name + ", getEmp_id()="
				+ getEmp_id() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	public static void main(String[] args) {
		Manager mg = new Manager(12,23426,"Rohit",14,24);
		System.out.println(mg);
		
	}
	
}

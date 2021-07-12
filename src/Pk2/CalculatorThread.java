package Pk2;

class Add extends Thread{
	int num1;
	int num2;
	int ans;
	public Add() {
		super();
	}
	public Add(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() {
		ans = num1 + num2;
		System.out.println("Addition :" + num1 + " + " +num2+" = " + ans);
	}
}

class Subtraction extends Thread{
	int num1;
	int num2;
	int ans;
	public Subtraction() {
		super();
	}
	public Subtraction(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() {
		ans = num1 - num2;
		System.out.println("Subtraction :" + num1 + " - " +num2+" = " + ans);
	}
}

class Multiplication extends Thread{
	int num1;
	int num2;
	int ans;
	public Multiplication() {
		super();
	}
	public Multiplication(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() {
		ans = num1 - num2;
		System.out.println("Multiplication :" + num1 + " * " +num2+" = " + ans);
	}
}

class Devide extends Thread{
	int num1;
	int num2;
	int ans;
	public Devide() {
		super();
	}
	public Devide(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() {
		ans = num1 - num2;
		System.out.println("Devide :" + num1 + " / " +num2+" = " + ans);
	}
}
public class CalculatorThread {

	public static void main(String[] args) {
		Add t1 = new Add(12,13);
		Subtraction t2 = new Subtraction(25,14);
		Multiplication t3 = new Multiplication(15,12);
		Devide t4 = new Devide(12,4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}

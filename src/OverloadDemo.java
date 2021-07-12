
public class OverloadDemo {
	public static int add(int a, int b) {
		return a+b;
	}
	public static float add(float a, int b) {
		return a + b;
	}
	
	public static double add(double a, double b) {
		return a + b;
	}
	public static void main(String[] args) {
		OverloadDemo od = new OverloadDemo();
		System.out.println(add(5,8));
		System.out.println(add(0.4f, 18));
		System.out.println(add(5.4f, 9.8f));
	}

}

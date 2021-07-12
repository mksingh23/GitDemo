
public class StringDemo {
	public static void Demo() {
		String s1 = "Apisero";
		System.out.println(s1.hashCode());
		String s2 = " Inc.";
		System.out.println(s2.hashCode());
		String s3 = s1 + s2;// string is immutable so if the string is already present in the string pool it will return the same address
		System.out.println(s3.hashCode());
		System.out.println(s3);
	}
	public static void stringDemo() {
		StringBuilder st = new StringBuilder("Never");
		String s1 = " Settle";
		for(int i = 0; i < s1.length(); i++) {
			st.append(s1.charAt(i));
			System.out.println(st);
			System.out.println(st.hashCode());
		}
	}
	public static void stringDemo2() {
		StringBuffer st = new StringBuffer("Never");
		String s1 = " Settle";
		for(int i = 0; i < s1.length(); i++) {
			st.append(s1.charAt(i));
			System.out.println(st);
			System.out.println(st.hashCode());
		}
	}
	public static void main(String[] args) {
		StringDemo sd = new StringDemo();
		sd.stringDemo2();

	}

}

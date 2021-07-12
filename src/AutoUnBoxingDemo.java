
public class AutoUnBoxingDemo {

	public static void main(String[] args) {
		
		// Autoboxing of Integer 
		Integer i = new Integer(10);
		// Auto Unboxing of object
        int num = i;
        
        System.out.println("Value of i: " + i);
        System.out.println("Value of num: " + num);
  
        // Autoboxing for character
        Character c = 'a';
  
        // Auto-unboxing for object
        char ch = c;
        System.out.println("Value of c: " + c);
        System.out.println("Value of ch: " + ch);
        
        
        // autoboxing for double
        Double d = new Double(12.023f);
        
        //double unboxing for object
        
        double dn = d;
        System.out.println("Value of d: " + d);
        System.out.println("Value of dn: " + dn);
        
        // auto boxing and unboxing for boolean
        Boolean flag = new Boolean("True");
        boolean fl = flag;
        System.out.println("Value of flag: " + flag);
        System.out.println("Value of fl: " + fl);
        
        // auto boxing and unboxing for float
        Float ft = new Float(5.4f);
        float F = ft;
        System.out.println("value of ft :" + ft);
        System.out.println("value of F :" + F);
        
        Long l1 = new Long((int)1e10);
        long ln = l1;
        System.out.println("value of Long(l1)" +l1);
        System.out.println("value of l1" +ln);
        
        byte b = 10;
        Byte b1 = new Byte(b);
        byte bt = b;
        System.out.println("Value of B1" +b1);
        System.out.println("Value of bt" +bt);
        
        short s1 = 12;
        Short st = new Short(s1);
        short s2 = st;
        System.out.println("Value of st" +st);
        System.out.println("Value of s2" +s2);
	}

}

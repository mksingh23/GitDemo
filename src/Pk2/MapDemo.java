package Pk2;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap();
		map.put(1, "india");
		map.put(2, "nepal");
		map.put(3, "Australia");
		map.put(4, "USA");
		System.out.println(map);
		
		Iterator list = map.entrySet().iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
//		while(list.hasNext())  
//		{  
//		int key=(int)list.next();  
//		System.out.println("Key.: "+key+"     CountryName: "+map.get(key));  
//		} 
	}

}

package Pk2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(12);
		list.add(15);
		list.add(32);
		list.add(11);
		list.remove(list.size() - 1);
		list.add(14);
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(14);
		ll.add(45);
		System.out.println(list);
		System.out.println(ll);
	}
}

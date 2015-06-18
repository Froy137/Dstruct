package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello world!");
//		
//		Stack2 s= new Stack2(10);
//		s.push("10");
//		s.push("1");
//		s.push("110");
//		s.push("110");
//		s.push("110");
//		s.push("110");
//		s.push("110");
//		s.push("114");
//		s.push("113");
//		s.push("112");
//		s.push("222");
//		
//		s.peek();
//		s.pop();
//		s.peek();
//		s.pop();
//		s.peek();
//		s.pop();
//		s.peek();
		
		LinkedList ll = new LinkedList();
		
		ll.add("10");
		ll.add("11");
		ll.add("12");
		ll.add("13");

		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println("---------------");
		ll.remove(2);
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println("---------------");
		ll.add("11", 2);
		
		System.out.println(ll.get(1));
		System.out.println(ll.get(2));
		System.out.println(ll.get(3));
		System.out.println(ll.get(4));
}
	}



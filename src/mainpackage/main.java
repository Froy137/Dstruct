package mainpackage;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import binarytree.BinaryTree;
import Queue.*;
import linkedlist.LinkedList;
import stack.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
//		Stack3 s= new Stack3(10);
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
//		
//		LinkedList ll = new LinkedList();
//		
//		ll.add("10");
//		ll.add("11");
//		ll.add("12");
//		ll.add("13");
//
//		System.out.println(ll.get(1));
//		System.out.println(ll.get(2));
//		System.out.println(ll.get(3));
//		System.out.println("---------------");
//		ll.remove(2);
//		System.out.println(ll.get(1));
//		System.out.println(ll.get(2));
//		System.out.println(ll.get(3));
//		System.out.println("---------------");
//		ll.add("11", 2);
//		
//		System.out.println(ll.get(1));
//		System.out.println(ll.get(2));
//		System.out.println(ll.get(3));
//		System.out.println(ll.get(4));
		
		Queue2 q =new Queue2(10);
		q.peek();
		
//		q.priorityInsert("1");
//		q.priorityInsert("4");
//		q.priorityInsert("5");
//		q.priorityInsert("13");
//		q.priorityInsert("0");
//		q.priorityInsert("15");
//		q.priorityInsert("3");
//		q.priorityInsert("7");
//		q.priorityInsert("18");
//		q.priorityInsert("6");
		
		
		q.insert("1");
		q.insert("4");
		q.insert("5");
		q.insert("13");
		q.insert("0");
		q.insert("15");
		q.insert("3");
		q.insert("7");
		q.insert("18");
		q.insert("6");
		
		
		

		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		q.remove();
		q.peek();
		
		
		
		
		System.out.println("---------------");System.out.println("---------------");
		
		            BinaryTree theTree = new BinaryTree();
			 
			        theTree.addNode(50, "Boss");
			 
			        theTree.addNode(25, "Vice President");
			 
			        theTree.addNode(15, "Office Manager");
			 
			        theTree.addNode(30, "Secretary");
			 
			        theTree.addNode(75, "Sales Manager");
			 
			        theTree.addNode(85, "Salesman 1");
			 
			        // Different ways to traverse binary trees
			 
			        // theTree.inOrderTraverseTree(theTree.root);
			 
			        // theTree.preorderTraverseTree(theTree.root);
			 
			         theTree.postOrderTraverseTree(theTree.root);
			 
			        // Find the node with key 75
			 
			        System.out.println("\nNode with the key 75");
			 
			        System.out.println(theTree.findNode(50));
		
		
}
	}



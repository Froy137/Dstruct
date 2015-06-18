package mainpackage;

import java.util.Arrays;

public class Queue {

	private int size=0;
	private int front=0;
	private int rear=0;
	private int numberOfItems=0;
	private String [] data;
	
	public Queue(int size){
		this.size=size;
		data= new String[size];
		Arrays.fill(data, "-1");
	}
	
	public void insert(String input){
		
		data[rear]=input;
		rear++;
		numberOfItems++;
		
		
	}
	public void priorityInsert(){
		
	}
	public void pop(){
		
	}
	public void peek(){
		
	}
	
}

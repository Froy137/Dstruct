package stack;

import java.util.Arrays;

public class Stack3 {

	private String [] data;
	private int stacksize;
	private int stackPointer=-1;
	
	public Stack3(int size){
	    stacksize=size;
		data = new String[size];
		Arrays.fill(data,"-1");
	}
	
	public void push(String data){
		if(stackPointer +1 < this.stacksize)
		{
			this.data[stackPointer]=data;
			stackPointer++;
			
		}
		else{
			System.out.println("The stack is full");
		}
	}
	
	public void pop(){
		if (stackPointer>0){
			data[stackPointer]="-1";
			stackPointer--;
		}
		else{
			System.out.println("there is nothing to pop");
			}
	}
	
	public void peek(){
		if(stackPointer>=0){
			System.out.println("this is the peek "+this.data[stackPointer]);
		}
	}
	
}

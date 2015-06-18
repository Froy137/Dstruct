package mainpackage;

import java.util.Arrays;

public class Stack {

	private int size;
	private int stackPoint=-1;
	String [] data;
	
	public Stack(int size){
		this.size=size;
		data = new String[size];
		Arrays.fill(data,"-1");
		}
	
	public void push(String input){
		
		if(stackPoint+1 < size){
			stackPoint ++;
			data[stackPoint]=input;
			System.out.println("input was added "+input);
		}else{
			System.out.println("The stack is full to accept "+input+"...it will be discarted");
		}
		
	}
	
	public void pop(){
		if (stackPoint>=0){
			
			System.out.println("Item was popped "+data[stackPoint]);
			data[stackPoint]="-1";
		
			stackPoint--;
		}else{
			System.out.println("The stack is empty");
		}
	}
	public void peek()
	{
		if(stackPoint>=0)
		System.out.println("This is the peek: "+data[stackPoint]);
		else{
			System.out.println("Sorry the stack is empty nothing to peek");
		}
	}

	
}
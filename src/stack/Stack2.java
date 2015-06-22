package stack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack2 {

	String []Data;
	private int size;
	private int stackPoint=-1;
	public Stack2(int size){
		this.size=size;
		Data=new String[size];
		Arrays.fill(Data, "-1");
	}
	
	public void push(String data){
		
		if(stackPoint + 1 < size){
		stackPoint++;
		Data[stackPoint]=data;
		System.out.println("This was pushed into the stack "+  data);
		}else{
			System.out.println("The stack is full :(");
		}
	}
	public void pop(){
		if(stackPoint >= 0){
			System.out.println("This number was popped "+Data[stackPoint]);
			Data[stackPoint]="-1";
			stackPoint--;
		}else{
			System.out.println("There is nothing to pop");
		}
		
	}
	
	public void peek(){
		if(stackPoint >=0){
		System.out.println("This is a peek" +Data[stackPoint]);
		}else{
			System.out.println("There is nothing to peek");
			}
	}
}

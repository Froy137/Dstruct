package Queue;

import java.util.Arrays;

public class Queue {
	
	private int queueSize;
	private int front ,rear ,numberOfItems=0;
	private String [] data;
	
	public Queue(int size){
		queueSize=size;
		data=new String[size];
		Arrays.fill(data, "-1");
	}
	
	public void insert(String data){
		if (numberOfItems + 1 <= queueSize){
			System.out.println("Inserting this to the Queue: "+data);
			this.data[rear]=data;
			rear++;
			numberOfItems++;
		}else{
			System.out.println("the queue is full");
			
		}
		
	}
	public void priorityInsert(String data){
		int i;
		if(numberOfItems==0){
			insert(data);
		}
		else{
			for(i=numberOfItems-1;i>=0;i--){
				if(Integer.parseInt(data)>Integer.parseInt(this.data[i]))
				{
					this.data[i+1]=this.data[i];
				}
				else{
					break;
				}
			}
			this.data[i+1]=data;
			rear++;
			numberOfItems++;
		}
	}
	
	public void remove(){
	if(numberOfItems<=0)
	{
		System.out.println("nothing to remove");
	}else
	{
		this.data[front]="-1";
		front++;
		numberOfItems--;
		
	}
		
	}
	public void peek(){
		if(numberOfItems >0){
			System.out.println("Here is your peek: "+this.data[front]);
		}else{
			System.out.println("there is nothing to peek");
		}
	}
	
}

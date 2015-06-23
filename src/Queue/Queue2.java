package Queue;

import java.util.Arrays;

public class Queue2 {

	
	private int size;
	private int rear,front,numberOfItems=0;
	String [] data;
	
	public Queue2(int size){
		//this creates queue in a specified size and initialized the array size!
		this.size=size;
		data=new String[size];
		Arrays.fill(data, "-1");
	}
	
	public void insert(String data){
		
		if(numberOfItems +1 <= size){
			
			System.out.println("this is what you insert! "+data);
			this.data[numberOfItems]=data;
			numberOfItems++;
			rear++;
		}else{
			System.out.println("Srry the Queue is full");
		}
	
	}
	public void priorityInsert(String data){
	
		if(numberOfItems+1<=size)//maybe +2? to have room to shift
		{
				if(numberOfItems==0)
				{
					insert(data);
				}else
				{
						
						int i;
						for(i=numberOfItems-1;i>=0;i--)
						{
							if(Integer.parseInt(data)>Integer.parseInt(this.data[i]))
							{
								this.data[i+1]=this.data[i];
							}else
							{
								break;
							}
						}
						
							System.out.println("this is what you insert! "+data);
							this.data[i+1]=data;
							rear++;
							numberOfItems++;
			     }
			
		}else{
			System.out.println("Srry cant Priority add! Queue is full ");
		}
		
	}
	public void remove(){
		
		if(numberOfItems > 0 ){
			this.data[front]="-1";
					front++;
					numberOfItems--;
			
		}else{
			System.out.println("Srry there is nothing to remove!");
		}
		
	}
	public void peek(){
		if(numberOfItems > 0){
			System.out.println("Here is your peek: "+this.data[front]);
		}
		else{
			System.out.println("Srry there is nothing to peek");
		}
	}
	
}

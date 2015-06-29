package binarytree;

public class Node2 {

	int key;
	String name;
	
	Node rightChild;
	Node leftChild;
	
	public Node2(int key,String name){
		this.key=key;
		this.name=name;
	}

	public String toString(){
		return name+" has key of " +key;
				
	}
	
	
	
}

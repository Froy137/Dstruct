package binarytree;

public class Node3 {
	
	
	private int key;
	private String name;
	
	Node leftChild;
	Node rightChild;
	
	public Node3(int key,String name){
		this.key=key;
		this.name=name;
	}
	
	public String toString(){
		return name +" has key number "+ key;
	}

}

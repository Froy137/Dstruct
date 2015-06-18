package mainpackage;

public class Node {

	private Node nextNode;
	private Object data;
	
	
	public Node(Object data){
		this.data=data;
		nextNode=null;
	}
	public Node(Object data , Node nextNode){
		this.data=data;
		this.nextNode=nextNode;
	}
	
	public void setData(Object data){
		this.data=data;
	}
	public Object getData(){
		return data;
	}
	public void setNextNode(Node nextNode){
		this.nextNode=nextNode;
	}
	public Node getNextNode(){
		return nextNode;
	}
	

	
	
	
	
	
}

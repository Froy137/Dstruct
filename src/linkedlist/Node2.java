package linkedlist;

public class Node2 {

	Object data;
	Node2 nextNode;
	
	public Node2(Object data){
		this.data=data;
		nextNode=null;
	}
	
	public Node2(Object data,Node2 nextNode){
		this.data=data;
		this.nextNode=nextNode;
	}
	
	
	public void setNodeData(Object data){
		this.data=data;
	}
	public Object getNodeData(){
		return this.data;
	}
	
	public void setNextNode(Node2 nextNode){
		this.nextNode=nextNode;
	}
	public Node2 getNextNode(){
		return this.nextNode;
	}
	
	
}

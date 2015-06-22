package linkedlist;


public class LinkedList {

	Node head = new Node(null);
	int sizeList=0;
	
	public void add(Object data){
		Node temp=new Node(data);
		Node current = head;
		
		while(current.getNextNode() != null)
		{
			current=current.getNextNode();			
		}
		current.setNextNode(temp);
		sizeList++;
	}
	public void add(Object data,int index){
		Node temp = new Node(data);
		Node current = head;
		
		for(int x=1;x<index && current.getNextNode()!=null;x++)
		{
			current=current.getNextNode();
		}
		
		//does the order matter????????????
		temp.setNextNode(current.getNextNode());
		
		current.setNextNode(temp);

		sizeList++;
	
	}	
	public boolean remove(int index){
		
		Node current=head;
		if(index<0||index>sizeList){
			return false;
		}
		
		for(int x=1;x<index;x++){
			
			if(current.getNextNode() == null){
				return false;
			}
			
			current=current.getNextNode();
			
		}
		
		current.setNextNode(current.getNextNode().getNextNode());
		sizeList--;
		return true;
	}
	
	public int size(){
		return sizeList;
	}
	
	public Object get(int index){
		
		if(index<0||index>sizeList){
			return null;
		}
		Node current=head;
		
		for(int x=0;x<index;x++){
			if (current.getNextNode() == null){
				return null;
			}
			current=current.getNextNode();
		}
		
		return current.getData();
	}
	
}

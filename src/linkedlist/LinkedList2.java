package linkedlist;

public class LinkedList2 {
	Node2 head;
	int size;
	public void add(Object data){
		
		Node2 temp = new Node2(data);
		Node2 focus=head;
		
		
		while(focus.nextNode!=null){
			focus=focus.getNextNode();
		}
		focus.setNextNode(temp);
		size++;
		
	}
	
	public void delete(int index){
		
		Node2 focusNode=head;
		
		if (index>size||index<0){
			System.out.println("invalid index");
		}
		else{
			
			for(int i=1;i<index;i++){
				focusNode=focusNode.getNextNode();
			}
			
			focusNode.setNextNode(focusNode.getNextNode().getNextNode());
			size--;
		}
		
	}
	
	public void get(){
		
		
		
	}
	
	
}

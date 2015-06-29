package binarytree;

public class BinaryTree2 {
	Node root;
	
	public void add(int key,String name){
		
		Node newNode = new Node(key,name);
		
		if(root==null){
			root=newNode;
		}else{
			
			Node focusNode = root;
			Node parentNode;
			
			while(true)
			{
				parentNode=focusNode;
			
				if(key<focusNode.key)
				{
					focusNode=focusNode.leftChild;
				
					if(focusNode==null)
					{
						parentNode.leftChild=newNode;
						return;
					}
				}
				else
				{
				focusNode=focusNode.rightChild;
				
					if(focusNode==null)
					{
					parentNode.rightChild=newNode;
					return;
					}
				}
				
				
				
			}
			
		}
		
	}
	
	public Node findNode(int key)
	{
		
		Node focusNode = root;
		
				
		while(key!=focusNode.key){
			
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			
			}else{
				focusNode=focusNode.rightChild;
			}
			if(focusNode==null){
				return null;
			}
		}
		return focusNode;
		
	}
	
	
	public void inOrderTraverseTree(Node focusNode){
		if(focusNode != null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
		
	}
	
	
	public void preorderTraverseTree(Node focusNode){
		
		if(focusNode != null){
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
		
	}
	
	public void postOrderTraverseTree(Node focusNode){
		
		if(focusNode != null){
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
		
	}
	
	
	
}

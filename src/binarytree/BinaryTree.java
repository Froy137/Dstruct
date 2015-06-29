package binarytree;
//import binarytree.Node;

public class BinaryTree {

	public Node root;
	
	public void addNode(int key,String name){
		
		//create a new node and intialize it 
		
		Node newNode=new Node(key,name);
		
		
		// if there is no root node this becomes the root node
		
		if (root == null)
		{
			root = newNode;
		}
		else{
			//set root as the Node that we will start with the traverse of the tree
			Node focusNode = root;
			
			//future parent of our node
			Node parent;
			
			while(true)
			{
					parent=focusNode;
					
					if(key<focusNode.key)
					{
						focusNode =focusNode.leftChild;
						
						if(focusNode == null)
						{
							parent.leftChild=newNode;
							return;
						}
					}
					else
					{
						focusNode=focusNode.rightChild;
						
						if(focusNode == null) 
						{
							parent.rightChild=newNode;
							return;
						}
					}
					

			  }
			
			
			
		}
		
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		
		while(key != focusNode.key){
			
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
			}
			else{
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
	
	
	public boolean remove(int key){
		//start at the top of the tree
		
		Node focusNode=root;
		Node parentNode=root;
		
		
		//When searching for a node this will tell us to search to the right or to the left.
		
		boolean isItAtLeftChild=true;
		
		
		while(focusNode.key!=key){
			
			
			parentNode=focusNode;
			
			if(key<focusNode.key){
				isItAtLeftChild=true;
				focusNode=focusNode.leftChild;
			}else{
				isItAtLeftChild=false;
				focusNode=focusNode.rightChild;
			}
			
			//the node wasn't found
			if(focusNode==null){
				return false;
			}
		}
		
		
		//if the node doesnt have a child ; delete it!
		
		if(focusNode.leftChild==null && focusNode.rightChild==null){
			//if it's root , delete it!
			if(focusNode==root){
				root=null;
			}
			
			
			else if(isItAtLeftChild){
				parentNode.leftChild=null;
			}else{
				parentNode.rightChild=null;
			}
		}
		//if the node has no right child!
		else if(focusNode.rightChild==null){
			
			if(focusNode==root){
				root=focusNode.leftChild;
			}
			
			//if focus Node was on the left of the parent move the focus node left child up to the parent node;
			
			if(isItAtLeftChild){
				parentNode.leftChild=focusNode.leftChild;
			}else{
				parentNode.rightChild=focusNode.leftChild;
			}
			
		}
	
		
		
		
	}//end of remove method
	
}

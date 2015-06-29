package binarytree;

public class BinaryTree3 {

	Node root;
	
	public void add(int key,String name){
		Node newNode= new Node(key ,name);
		Node focusNode=root;
		Node parentNode;
		
		if(root==null){
			root=newNode;
		}
		while(true){
			parentNode=focusNode;
			
			if(key<focusNode.key)
			{
				focusNode=focusNode.leftChild;
				if(focusNode==null){
					parentNode.leftChild=newNode;
					return;
				}
				
			}else{
				focusNode=focusNode.rightChild;
				if(focusNode==null){
					parentNode.rightChild=newNode;
					return;
				}
			}
			
		}
		
	}
	
	public Node findNode(int key){
		Node focusNode = root;
		
		while (key!=focusNode.key){
			
			if(key<focusNode.key){
				focusNode=focusNode.leftChild;
				if(focusNode==null){
					return null;
				}
			}else{
				focusNode=focusNode.rightChild;
				
				if(focusNode == null){
					return null;
				}
			}
		}
		return focusNode;
		 	
	}
	
	public void inOrderTraverseTree(Node focusNode){
		
		if(focusNode!=null){
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
			
		}
	}
		public void preOrderTraverseTree(Node focusNode){
			
			if(focusNode!=null){
				System.out.println(focusNode);
				preOrderTraverseTree(focusNode.leftChild);
				
				preOrderTraverseTree(focusNode.rightChild);
				
			}
		
	}
		
		public void postOrderTraverseTree(Node focusNode){
			
			if(focusNode!=null){
				
				postOrderTraverseTree(focusNode.leftChild);
				
				postOrderTraverseTree(focusNode.rightChild);
				System.out.println(focusNode);
			}
		
	}
	
	
	
	
}

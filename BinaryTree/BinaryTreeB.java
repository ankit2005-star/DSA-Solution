import java.util.*;
public class BinaryTreeB{



	static class Node{

		int data ;
		Node left ,right;
		
		Node(int data){

			this.data = data;
			right = null;
			left = null;

		}
		

	}


	static class BinaryTree{
		static int idx = -1;

		public static Node buildTree( int nodes[] ){
		 	 idx++;
			if( nodes[idx] == -1) return null;
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			

			return newNode;

		
		}


	}
	
	//preorder -> root ->left subtree -> right subtree
	public static void preorder(Node root){
				
		if(root == null) return;
		System.out.println(root.data + " " );
		preorder(root.left);
		preorder(root.right);
		


	}

	//inorder -> leftsubtree -> root -> right subtree
	public static void inorder(Node root){
				
		if(root == null) return;
		 
		inorder(root.left);
		System.out.println(root.data + " " );
		inorder(root.right);



	}

	//postorder -> leftsubtree ->  right subtree -> root 

	public static void postorder(Node root){
				
		if(root == null) return;
		 
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " " );




	}


	//levelorder -> leftsubtree ->  right subtree -> root 

	public static void levelorder(Node root){
				
		if(root == null) return;

		Queue<Node>q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty()){
			
		   Node curr = q.remove();
		   if( curr == null) {
		    System.out.println();
			if( q.isEmpty()) break;
			else q.add(null);

		   }
		   else{  
			System.out.print(curr.data + " ");
			if( curr.left != null)
			q.add(curr.left);
			if(curr.right != null)
			q.add(curr.right);
		      
		   }

		}
		 


	}
	
	public static int countOfNode( Node root){

		if( root == null ) return 0;

		return 1 + countOfNode(root.left) + countOfNode(root.right);
	}

	public static int sumOfNodes( Node root){
		if( root == null) return 0;

		return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);

	}	

	public static int treeHeight( Node root){

		if(root == null ) return 0;

		int leftHeight = treeHeight(root.left);
		int rightHeight = treeHeight(root.right);

		return Math.max(leftHeight , rightHeight) + 1;

	}
	

	//print kth level of an tree 

	public static void kThLevel(Node root , int level , int k ){
		if( root == null) return;
		
		if( level == k ){
		   System.out.print( root.data + " " ) ;
			return;  //don't need to go deeper 
		}
		
		kThLevel(root.left , level + 1 , k);
		kThLevel(root.right , level + 1 , k);
		

	}

        

	public static int kThLevelSum(Node root , int k , int level){
		 if( root == null) return 0;
		 
		  
		  if( level == k ) return root.data;

		 return kThLevelSum( root.left , k , level+1) + kThLevelSum(root.right , k , level + 1);
		
		 
		

	}


	public static void main(String[] args){
		int[] nodes = {1, 2, 4, -1, -1, 5, -1 , -1, 3, 6, -1 , -1, 7, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		levelorder(root);

		 
		System.out.print(kThLevelSum(root , 1 , 1));
		 


	}



}
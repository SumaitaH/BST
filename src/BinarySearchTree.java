class BinarySearchTree{
	
	//variables 
	//1. node instance 
	
	node tree; 
	
	//functions 
	//1. get current node value
	//2. insert elements into BST
	//3. remove elements into BST
	//4. flip search tree 
	//5. get leftmost value
	//6. get rightmost value
	
	BinarySearchTree(int value){
		tree = new node(value);
	}
	
	// insert elements into BST - recursive
	public void insert(int val, node T) {

			if(T.value >= val) {
				if(T.leftNode == null) {
					node left = new node(val);
					T.leftNode = left;
				}else {
					insert(val, T.leftNode);
				}
			}else {
					if(T.rightNode == null) {
						node right = new node(val);
						T.rightNode = right;
					}else {

						insert(val, T.rightNode);
					}
			}
	}
	public static void main(String[] args) {
		
		BinarySearchTree test = new BinarySearchTree(1);
		test.insert(2, test.tree);
		test.insert(5, test.tree);
		test.insert(3, test.tree);
		
		System.out.println(test.tree.rightNode.value);
	}
	
}
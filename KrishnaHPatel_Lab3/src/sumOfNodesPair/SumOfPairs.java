package sumOfNodesPair;

import java.util.*; 
  
class Node { 
      
    int data; 
    Node left, right; 
      
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
}  
class BinarySearchTree 
{ 
    Node root; 
    BinarySearchTree() {  
        root = null;  
    } 
    void inorder() 
    { 
        inorderNodes(this.root); 
    } 
      
   void inorderNodes(Node node) 
    { 
        if(node == null) 
            return; 
          
        inorderNodes(node.left); 
        System.out.print(node.data + " "); 
        inorderNodes(node.right); 
    } 
      
    void insert(int key) 
    { 
    root = insertNodes(root, key); 
    } 
    Node insertNodes(Node root, int data) 
    { 
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
        if (data < root.data) 
            root.left = insertNodes(root.left, data); 
        else if (data > root.data) 
            root.right = insertNodes(root.right, data); 
  
        return root; 
    } 
      
    
    ArrayList<Integer> treeList(Node node, ArrayList<Integer> list) 
                                                      
    {      
         
        if(node == null) 
            return list; 
          
        treeList(node.left, list); 
        list.add(node.data); 
        treeList(node.right, list); 
          
        return list; 
    } 
      
    
    boolean isPairAvailable(Node node, int sum) 
    {    
        
        ArrayList<Integer> a1 = new ArrayList<>();  
        ArrayList<Integer> a2 = treeList(node, a1);  
          
        int start = 0;  
        int end = a2.size()-1;  
        while(start<end) 
        { 
          if(a2.get(start)+a2.get(end)==sum)
        { 
        	System.out.println("Sum = "+sum);
            System.out.println("Pair is"+"(" +a2.get(start)+","+a2.get(end)+")"); 
            return true; 
        }  
        if(a2.get(start)+a2.get(end)>sum)
        { 
            end--; 
        }   
        if(a2.get(start)+a2.get(end)<sum)
        { 
            start++; 
        } 
    } 
  
        System.err.println("No such values are found!"); 
        return false; 
    }
	
          
    
   
} 
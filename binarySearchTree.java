import java.util.*;

public class binarySearchTree {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int value){
        if(root==null){
            root = new Node(value);
            return root;
        }
        if(root.data>value){
            //we add it to the left subtree
            root.left = insert(root.left,value);

        }
        else{
            root.right = insert(root.right,value);
        }
        return root;

    }
    public static boolean searchInTree(Node root ,int key){
        if(root==null){
            return false;

        }
        if(root.data>key){
            return searchInTree(root.left, key);
        }
        else if (root.data == key ){
            return true;
        } 
        else{
            return searchInTree(root.right, key);
        }
    }
    public static Node deleteNodeFromTheTree(Node root,int value){
        if(root.data>value){
            root.left = deleteNodeFromTheTree(root.left, value);
        }
        else if(root.data<value){
            root.right = deleteNodeFromTheTree(root.right, value);
        }
        else{
            //no child
            if(root.left==null&&root.right==null){
                return null;
            }

            //only 1 child
            if(root.left==null){
                return root.left;
            }
            else if(root.right==null){
                return root.left;
            }

            //has 2 children
            Node inOrderSuccessor = findInOrderSuccessor(root.right);
            root.data = inOrderSuccessor.data;
            root.right = deleteNodeFromTheTree(root.right, inOrderSuccessor.data);
        }
        return root;
    }

    public static Node findInOrderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y){
        if(root==null){
            return;
        }
        if(x<=root.data && root.data<=y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        }
        else if(root.data<=x){
            printInRange(root.right, x, y);
        }
        else if (root.data>=y){
            printInRange(root.left, x, y);
        }
    }

    public static void printRootToLeafNode(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printThePaths(path);
        }
        else{
            printRootToLeafNode(root.left, path);
            printRootToLeafNode(root.right, path);
        }
        //removes the last node to backtrack to previous level
        path.remove(path.size()-1);
    }
    public static void printThePaths(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void inOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    
    public static void main(String[] args) {
        int [] values ={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i= 0; i< values.length; i++) {
            root = insert(root, values[i]);
        }
        inOrderTraversal(root);
        System.out.println();
        if(searchInTree(root, 5)){
            System.out.println("Element is present");
         }
        else{
            System.out.println("Element not found");
        }

      inOrderTraversal(root);
      System.out.println();
      //deleteNodeFromTheTree(root, 6);
      inOrderTraversal(root);
      System.out.println();
      printInRange(root, 5, 10);
      System.out.println();
      printRootToLeafNode(root,new ArrayList<>());
     
       
    }
}

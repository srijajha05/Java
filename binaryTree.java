import java.util.*;

public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class myBinaryTree{
        static int index = -1;
        public static Node buildMyTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildMyTree(nodes);
            newNode.right = buildMyTree(nodes);

            return newNode;
            
        }
        

    }
    public static void preOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        System.out.print(root.data +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        
    }
    public static void inOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }
    public static void postOrderTraversal(Node root) {
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currentNode = q.remove();
            if(currentNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }

            }else{
                System.out.print(currentNode.data+" ");
                if(currentNode.left != null){
                    q.add(currentNode.left);
                }
                if(currentNode.right != null){
                    q.add(currentNode.right);
                }

            }
        }    
    }
    public static int countOfNodes(Node root) {
        if(root==null){
            return 0;
        }
        int leftNodes= countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;
        
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
        
    }
    public static int heightOfTree(Node root) {
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int MyHeight = Math.max(leftHeight, rightHeight);

        return MyHeight+1;
        
    }
    public static int diameterOfBinaryTree(Node root) {
        if(root == null){
            return 0;
        }  
        int diameterLeftSubtree = diameterOfBinaryTree(root.left);
        int diameterRightSubtree = diameterOfBinaryTree(root.right);
        int diameterThroughtRootNode = heightOfTree(root.left)+heightOfTree(root.right)+1;  

        return Math.max(diameterThroughtRootNode, Math.max(diameterLeftSubtree, diameterRightSubtree));
    }
    static class TreeInfo{
        int diameter;
        int height;

        TreeInfo(int height,int diameter){
            this.height= height;
            this.diameter= diameter;
        }
    }
    public static TreeInfo diameterCalculator(Node root) {
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftTreeInformation = diameterCalculator(root.left);
        TreeInfo rightTreeInformation = diameterCalculator(root.right);
        int myHeight = Math.max(leftTreeInformation.height,rightTreeInformation.height)+1;

        int diameter1 = leftTreeInformation.height+rightTreeInformation.height+1;
        int diameter2 = leftTreeInformation.diameter;
        int diameter3 = rightTreeInformation.diameter;

        int myDiameter = Math.max(diameter1,(Math.max(diameter2, diameter3)));

        return new TreeInfo(myHeight,myDiameter);

        
    }
    public static void main(String[] args) {
        int[] myTreeNodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    
        myBinaryTree obj = new myBinaryTree();
        Node root = obj.buildMyTree(myTreeNodes);

       preOrderTraversal(root);
       System.out.println();
       inOrderTraversal(root);
       System.out.println();
       postOrderTraversal(root);
       System.out.println();
       levelOrderTraversal(root);
       int n = countOfNodes(root);
       System.out.println("The number of nodes in the tree is " + n);
       System.out.println("Sum of values of the nodes is "+sumOfNodes(root));
       System.out.println("The height of the tree is "+heightOfTree(root));
       System.out.println("The diameter of the binary tree is "+diameterOfBinaryTree(root));
       System.out.println("The diameter is "+diameterCalculator(root).diameter);

    }
    
}

public class treePractice {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static class binaryTreesBuild{
        static int i=-1;
        public static Node build(int [] arr){
            i++;
            if(arr[i]==-1){
                return null;
            }
            Node newNode = new Node(arr[i]);
            newNode.left=build(arr);
            newNode.right = build(arr);
            return newNode;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTreesBuild obj = new binaryTreesBuild();
        Node root = obj.build(nodes);
        System.out.println(root.data);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}

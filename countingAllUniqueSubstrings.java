public class countingAllUniqueSubstrings {
    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            for(int i=0;i<26;i++){
                children[i] = null;//initialized with null value otherwise gives error
            }
            endOfWord = false;//initiliazed with false

        }
    }

    static Node root = new Node();//root node made which always remains empty

    public static void insertInTrie(String word){
        Node current = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(current.children[index] == null){//roots children does not have that character
                current.children[index] = new Node();
            }
            if(i==word.length()-1){
                current.children[index].endOfWord = true;
            }
            current = current.children[index];//root updated to next node in trie
        }
    }
    public static boolean containsKey(String key){
        Node current =root;
         for(int i=0;i<key.length();i++){
             int index = key.charAt(i) -'a';
 
             Node node = current.children[index];
         
             if(node==null){
                 return false;
             }
             if(i==key.length()-1 && node.endOfWord == false){
                 return false;
             }
             current = current.children[index];
         }
         return true;
     }
 
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count = count+countNodes(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args) {

        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insertInTrie(suffix);
            
        }
        System.out.println(countNodes(root));
        
    }
}

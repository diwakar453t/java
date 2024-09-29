class Main{
    static class Node{
       //PreOrder   left and Right

        int data;
        Node left;
        Node right;


        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    public static class binerryTree{
    static  int idx=-1;
    public static Node buieldTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buieldTree(nodes);
        newNode.right=buieldTree(nodes);
        return newNode;
    }

    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }



    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binerryTree tree= new binerryTree();
        Node root=tree.buieldTree(nodes);
          tree.preOrder(root);

    }

}
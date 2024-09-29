package InOrder;
//4,2,5,1,3,6
//InOrder first left and          second  root print            right at last
class inOrder{
    static class Node{


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

    /*    public static void inOrder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data+" ");
            inOrder(root.left);
            inOrder(root.right);
        }*/



    }
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");

        inOrder(root.right);
    }
    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,6,-1,-1};
         binerryTree tree= new binerryTree();
        Node root=tree.buieldTree(nodes);
      //  tree.inOrder(root);
        System.out.println();
        inOrder(root);

    }

}

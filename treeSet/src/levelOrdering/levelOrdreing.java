package levelOrdering;
//1  23   456

import java.util.LinkedList;
import java.util.Queue;

/*
* 1
* / \
* 2  3
* / \  \
* 4  5   6
* */
public class levelOrdreing {
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
    public static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }

        public static void levelOrder(Node root){
            if (root == null) {

                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node currentNode=q.remove();
                if (currentNode==null){
                    System.out.println();

                    if (q.isEmpty()){
                    break;
                    }
                    else {
                        q.add(null);
                         }}
                    else{
                        System.out.print(currentNode.data+" ");
                            if (currentNode.left!=null){
                                q.add(currentNode.left);
                            }
                            if (currentNode.right!=null){
                                q.add(currentNode.right);
                            }
                }
            }

            //code
        }
    }








    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tree=new binaryTree();
        Node root=tree.buildTree(nodes);
        tree.levelOrder(root);
    }

}

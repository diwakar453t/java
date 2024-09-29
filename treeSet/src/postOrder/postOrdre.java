package postOrder;
//4,5,2,3,6,1,  root at last        first  left and second   right
class postOrdre {
    static class Node {


        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public static class binerryTree {
        static int idx = -1;

        public static Node buieldTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buieldTree(nodes);
            newNode.right = buieldTree(nodes);
            return newNode;
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }


    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binerryTree tree = new binerryTree();
        Node root = tree.buieldTree(nodes);
        tree.postOrder(root);

    }
}

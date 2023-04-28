package BinaryTrees;
import java.util.*;

public class LevelOrderTraversal {
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

    static class BinaryTree {
        static int indx = -1;
        public static Node BuildTree(int nodes[]) {
            indx++;
            if(nodes[indx] == -1)
                return null;
            
            Node newNode = new Node(nodes[indx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);

            return newNode;
        }

        public static void LevelOrder(Node root) {
            if(root == null)
                return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {

                Node currentNode = q.remove();
                if(currentNode == null) {
                    System.out.println();

                    if(q.isEmpty())
                        break;
                    else 
                    q.add(null);
                }
                else {
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left != null) 
                        q.add(currentNode.left);
                    if(currentNode.right != null)
                        q.add(currentNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        tree.LevelOrder(root);
    }
}

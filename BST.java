public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right.right = new Node(14);

        int key = 4;
        Node result = searchBST(root, key); // Passing null as initial path
        if (result != null) {
            System.out.println("Found your key: " + result.data);
            System.out.print("Your path of key is: ");
            printPath(result,root);
        } else {
            System.out.println("Not found");
        }
    }

    public static Node searchBST(Node root, int key ) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return searchBST(root.left, key);
        } else {
            return searchBST(root.right, key);
        }
    }


        public static void printPath(Node key, Node root) {
            if (root != null) {
                System.out.print(root.data);
                if (root == key) {
                    return; // Stop recursion when the target node is reached
                }
                System.out.print(" -> ");
                if (key.data < root.data) {
                    printPath(key, root.left);
                } else {
                    printPath(key, root.right);
                }
            }
        }
    }




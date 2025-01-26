
// Binary Search Tree
public class AVL {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public AVL() {
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        insert(nums[mid]);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    public int height() {
        return root.height;
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        } else if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // If node != null returning the same node.
        return rotate(node);
    }

    public Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            // Left Heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                // left-left case
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                // left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // Right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right-right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                // right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    public void display() {
        display(this.root, "Root node : ");
    }

    private void display(Node node, String details) {
        if (node == null) return;

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // TYPES OF TRAVERSAL IN BINARY TREE
    // (1) Pre-Order Traversal
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // (2) In-Order Traversal
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;
        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }

    // (3) Post-Order Traversal
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }


    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }
        System.out.println(tree.height());
    }
}

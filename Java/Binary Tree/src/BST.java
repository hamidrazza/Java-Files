
// Binary Search Tree
public class BST {
    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end) return;

        int mid = start+(end-start)/2;

        insert(nums[mid]);

        populateSorted(nums,start,mid-1);
        populateSorted(nums,mid+1,end);
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root, value);
    }
    private Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }
        else if (value < node.value){
            node.left = insert(node.left, value);
        }
        else if(value > node.value){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        // If node != null returning the same node.
        return node;
    }

    public void display(){
        display(this.root, "Root node : ");
    }
    private void display(Node node, String details){
        if(node == null) return;

        System.out.println(details + node.value);

        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left)-height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    // TYPES OF TRAVERSAL IN BINARY TREE
    // (1) Pre-Order Traversal
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null) return;

        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // (2) In-Order Traversal
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        System.out.println(node.value + " ");
        preOrder(node.right);
    }

    // (3) Post-Order Traversal
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node == null) return;
        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.value + " ");
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {15,8,5,20,12};
        tree.populate(nums);
        tree.display();
    }
}

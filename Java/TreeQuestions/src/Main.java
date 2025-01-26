import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static TreeNode findSuccessor(TreeNode node, int key){
        if(node == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            TreeNode currentNode = queue.poll();
            if(currentNode.val == key){
                break;
            }
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }
        return queue.peek();
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){

    }
    public TreeNode(int val){
        this.val = val;
    }
}
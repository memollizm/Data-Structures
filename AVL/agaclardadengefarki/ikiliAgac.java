package agaclardadengefarki;
import java.util.Stack;

public class ikiliAgac {
    
    Node root;
    
    public ikiliAgac()
    {
        root = null;
    }
    
    public void insert(int value) {
        root = insertRecursive(root, value);
    }
    
    public Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        
        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }
        
        current.dengeFaktoru = height(current.left) - height(current.right);
        
        return current;
    }
    
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public Node findNodeWithMaxBalanceFactor() {
        Node nodeWithMaxBalanceFactor = null;
        int maxBalanceFactor = 0;
        
        if (root == null) {
            return null;
        }
        
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            int balanceFactor = current.dengeFaktoru;
            
            if (Math.abs(balanceFactor) > Math.abs(maxBalanceFactor)) {
                maxBalanceFactor = balanceFactor;
                nodeWithMaxBalanceFactor = current;
            }
            
            if (current.right != null) {
                stack.push(current.right);
            }
            
            if (current.left != null) {
                stack.push(current.left);
            }
        }
        
        return nodeWithMaxBalanceFactor;
    }
    
}

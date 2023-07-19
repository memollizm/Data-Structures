package agaclardamaxmin;

import java.util.ArrayList;
import java.util.List;

public class ikiliAgacYapisi {
    
    Node root;
    
    public ikiliAgacYapisi()
    {
        root = null;
    }
    
    public Node kucukBul(Node root) {
        if (root == null) {
            return null;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public Node buyukBul(Node root) {
        if (root == null) {
            return null;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
    
    public Pair<Node, List<Node>> findParentAndSiblings(Node root, int val) {
        if (root == null) {
            return null;
        }
        Node parent = null;
        List<Node> siblings = new ArrayList<>();
        Node current = root;
        while (current != null) {
            if (val < current.data) {
                parent = current;
                current = current.left;
            } else if (val > current.data) {
                parent = current;
                current = current.right;
            } else {
                if (current.left != null) {
                    siblings.add(current.left);
                }
                if (current.right != null) {
                    siblings.add(current.right);
                }
                break;
            }
        }
        if (current == null) {
            return null;
        }
        return 0;
    }
}

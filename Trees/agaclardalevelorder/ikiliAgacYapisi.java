package agaclardalevelorder;
import java.util.LinkedList;
import java.util.Queue;
public class ikiliAgacYapisi {
    
    Node root;
    
    public ikiliAgacYapisi()
    {
        root = null;
    }
    
    Node newNode(int data)
    {
        root = new Node(data);
        return root;
    }
    
    Node insert(Node root, int data)
    {
        if(root != null)
        {
            if(data < root.data)
            {
                root.left = insert(root.left, data);
            }
            else
            {
                root.right = insert(root.right, data);
            }
        }
        else
        {
            root = newNode(data);
        }
        return root;
    }
    
    void levelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
           //System.out.print(root.data+" ");
           //levelOrder(root.left);
           //levelOrder(root.right);         
           Queue<Node> queue = new LinkedList<>();
           queue.offer(root);
        
        while (!queue.isEmpty()) 
        {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                System.out.print(currentNode.data + " ");

                
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            System.out.println();
        }
       }
    }
    
}

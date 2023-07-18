package agaclar;
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
    
}

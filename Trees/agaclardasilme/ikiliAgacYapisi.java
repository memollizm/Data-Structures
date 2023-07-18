package agaclardasilme;
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
                root.right = insert(root.right,data);
            }
        }
        else
        {
         root = new Node(data);   
        }
        return root;
    }
    
    void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    Node delete(Node root, int data)
    {
        Node t1,t2;
        
        if(root == null)
        {
            return null;
        }
        if(root.data == data)
        {
            if(root.left == root.right)
            {
                root = null;
                return null;
            }
            else if(root.left == null)
            {
                t1 = root.right;
                return t1;
            }
            else if(root.right == null)
            {
                t1 = root.left;
                return t1;
            }
            else
            {
                t1 = t2 = root.right;
                
                while(t1.left != null)
                {
                    t1 = t1.left;
                }
                t1.left = root.left;
                
                return t2;
            }
        }
        else
        {
            if(data < root.data)
            {
                root.left = delete(root.left,data);
            }
            else
            {
                root.right = delete(root.right,data);
            }
        }
        return root;
    }
}

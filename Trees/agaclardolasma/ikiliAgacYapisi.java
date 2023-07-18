package agaclardolasma;
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
            root = new Node(data);
        }
        return root;
    }
    
    void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    void infix(Node root)
    {
        if(root != null)
        {
            infix(root.left);
            System.out.print(root.data+" ");
            infix(root.right);
        }
    }
    
    void postOrder(Node root)
    {
        if(root != null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            int sag =0, sol =0;
            sag = height(root.right);
            sol = height(root.left);
            
            if(sol > sag)
            {
                return sol +1;
            }
            else
            {
                return sag+1;
            }
        }
    }
    
    int size(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        else
        {
            return size(root.left) + 1 + size(root.right);
        }
    }
    
}

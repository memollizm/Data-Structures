package agaclardaavl;
public class avlYapisi {
    
    Node root;
    
    public avlYapisi()
    {
        root = null;
    }
    
    int height(Node node)
    {
        if(node == null)
        {
            return -1;
        }
        else
        {
            return node.height;
        }
    }
    
    public Node insert(Node root, int x)
    {
        if(root == null)
        {
            root = new Node();           
            root.data = x;
        }
        else
        {
            if(x < root.data)
            {
                root.left = insert(root.left, x);
                if(height(root.left)-height(root.right) == 2)
                    if(x < root.left.data)
                        root = singlerotateright(root);
                else
                        root = doublerotateright(root);
            }
            else if(x > root.data)
            {
                root.right = insert(root.right,x);
                if(height(root.left)-height(root.right) == 2)
                    if(x > root.right.data)
                        root = singlerotateleft(root); //RR
                else
                        root = doublerotateleft(root); //RL
            }
        }
        root.height = max(height(root.left),height(root.right)) +1;
        return root;
    }
    
    int max(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    Node singlerotateright(Node root)  //LL fonksiyonu
    {
        Node lc = root.left;
        root.left = lc.right;
        lc.right = root;
        root.height = max(height(root.left),height(root.right)) +1;
        lc.height = max(height(lc.left),lc.height) +1;
        return lc;
    }
    
    Node singlerotateleft(Node root)  //RR fonksiyonu
    {
        Node rc = root.right;
        root.right = rc.left;
        rc.left = root;
        root.height = max(height(root.left),height(root.right)) +1;
        rc.height = max(height(rc.right),rc.height) +1;
        return rc;
    }
    
    
    Node doublerotateright(Node root)  //LR fonksiyonu
    {
        root.left = singlerotateleft(root.left);
        return singlerotateright(root);
    }
    
    Node doublerotateleft(Node root)  //RL fonksiyonu
    {
        root.right = singlerotateright(root.right);
        return singlerotateleft(root);
    }
}

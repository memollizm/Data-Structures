package splayagaci;
public class agacYapisi {
    
    Node root;

    
    Node newNode(int data)
    {
        Node root = new Node();
        root.data = data;
        root.left = null;
        root.right = null;
        return root;
    }
    
    Node rightRotate(Node root)
    {
        Node y = root.left;
        root.left = y.right;
        y.right = root;
        return y;
    }
    
    Node leftRotate(Node root)
    {
        Node x = root.right;
        root.right = x.left;
        x.left = root;
        return x;
    }
    
    Node splay(Node root, int data)
    {
        if(root == null || root.data == data)
        {
            return root;
        }
        
        if(root.data > data)
        {
            if(root.left == null)
            {
                return root;
            }
            
            if(root.left.data > data)
            {
                root.left.left = splay(root.left.left, data);
                root = rightRotate(root);
            }
            else if(root.left.data < data)
            {
                root.left.right = splay(root.left.right, data);
                if(root.left.right != null)
                {
                    root.left = leftRotate(root.left);
                }
            }
            
            return root.left == null ? root:rightRotate(root);
        }
        else
        {
            if(root.right == null)
            {
                return root;
            }
            
            if(root.right.data > data)
            {
                root.right.left = splay(root.right.left, data);
                if(root.right.left != null)
                {
                    root.right = rightRotate(root.right);
                }
            }
            else if(root.right.data < data)
            {
                root.right.right = splay(root.right.right, data);
                root = leftRotate(root);
            }
            
            return root.right == null ? root:leftRotate(root);
        }
    }
    
    Node search(Node root, int data)
    {
        return splay(root,data);
    }
    
    void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.println(root.data+" ");
            inOrder(root.right);
        }
    }
    
    
}

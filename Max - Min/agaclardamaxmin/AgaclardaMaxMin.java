package agaclardamaxmin;

import java.util.List;

public class AgaclardaMaxMin {
    public static void main(String[] args) {
        
        Node root = new Node(8);
        root.left = new Node(3);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right = new Node(10);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        ikiliAgacYapisi tree = new ikiliAgacYapisi();
        Node minNode = tree.kucukBul(root);
        Node maxNode = tree.buyukBul(root);
        System.out.println("Minimum node value: " + minNode.data);
        System.out.println("Maximum node value: " + maxNode.data);
        
        Pair<Node, List<Node>> result = tree.findParentAndSiblings(root, 4);
        if (result == null) {
            System.out.println("Dugum bulunamadi");
        }
    }  
}

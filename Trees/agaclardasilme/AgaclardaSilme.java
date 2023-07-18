package agaclardasilme;
public class AgaclardaSilme {

    public static void main(String[] args) {
        
        ikiliAgacYapisi bst = new ikiliAgacYapisi();
        
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 4);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 12);
        
        bst.inOrder(bst.root);
        
        System.out.println("\nkok dugumdeki deger: "+bst.root.data);
        bst.root = bst.delete(bst.root,10);
        
        System.out.println("\nSilmeden sonra ");
        bst.inOrder(bst.root);
        
        System.out.println("\nKok dugumdeki deger: "+bst.root.data);
    }  
}

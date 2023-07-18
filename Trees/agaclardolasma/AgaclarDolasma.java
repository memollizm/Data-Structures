package agaclardolasma;
public class AgaclarDolasma {
    
    public static void main(String[] args) {
        
        ikiliAgacYapisi bst  = new ikiliAgacYapisi();
        
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 9);
        bst.root = bst.insert(bst.root, 12);
        bst.root = bst.insert(bst.root, 20);
        
        System.out.print("preOrder:  ");
        bst.preOrder(bst.root);
        System.out.println();
        
        System.out.print("infix:     ");
        bst.infix(bst.root);
        System.out.println();
        
        System.out.print("postOrder: ");
        bst.postOrder(bst.root);
        System.out.println();
        
        System.out.print("Yukseklik: "+bst.height(bst.root));
        System.out.println();
        
        System.out.println("Eleman sayisi: "+bst.size(bst.root));
        
    }   
}

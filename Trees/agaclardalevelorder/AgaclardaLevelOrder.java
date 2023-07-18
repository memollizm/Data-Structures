package agaclardalevelorder;
public class AgaclardaLevelOrder {
    public static void main(String[] args) {
       
        ikiliAgacYapisi bt = new ikiliAgacYapisi();
        
        bt.root = bt.insert(bt.root,10);
        bt.root = bt.insert(bt.root,8);
        bt.root = bt.insert(bt.root,15);
        bt.root = bt.insert(bt.root,5);
        bt.root = bt.insert(bt.root,9);
        bt.root = bt.insert(bt.root,12);
        bt.root = bt.insert(bt.root,21);
        bt.root = bt.insert(bt.root,24);
        bt.root = bt.insert(bt.root,20);
        
        System.out.println("levelOrder: ");
        bt.levelOrder(bt.root);
    }  
}

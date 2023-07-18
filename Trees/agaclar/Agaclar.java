package agaclar;
public class Agaclar {
    
    public static void main(String[] args) {
        
        ikiliAgacYapisi bt = new ikiliAgacYapisi();
        
        bt.root = bt.insert(bt.root, 10);
        bt.root = bt.insert(bt.root, 15);
        bt.root = bt.insert(bt.root, 8);
        bt.root = bt.insert(bt.root, 20);
        
        
        System.out.println("Agacin koku: "+bt.root.data);
        System.out.println("Kokun sagi: "+bt.root.right.data);
        System.out.println("Kokun solu: "+bt.root.left.data);
        System.out.println("Kokun saginin sagi: "+bt.root.right.right.data);
        
    }  
}

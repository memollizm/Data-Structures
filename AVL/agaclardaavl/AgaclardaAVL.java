package agaclardaavl;
public class AgaclardaAVL {
    
    public static void main(String[] args) {
        
        avlYapisi avl = new avlYapisi();
        
        avl.insert(avl.root, 1);
        avl.insert(avl.root, 2);
        avl.insert(avl.root, 3);
        avl.insert(avl.root, 4);
        avl.insert(avl.root, 5);
        avl.insert(avl.root, 6);
        avl.insert(avl.root, 7);
        avl.insert(avl.root, 8);
        avl.insert(avl.root, 9);
        avl.insert(avl.root, 10);
        
        System.out.println("Agacin koku: "+avl.root.data);
    }   
}

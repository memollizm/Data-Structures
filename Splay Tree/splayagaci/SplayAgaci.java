package splayagaci;
public class SplayAgaci {
    
    public static void main(String[] args) {
       
        agacYapisi splayAgaci = new agacYapisi();
        
        
        splayAgaci.root.data = 100;
        splayAgaci.root.left.data = 50;
        splayAgaci.root.right.data = 200;
        splayAgaci.root.left.left.data = 40;
        splayAgaci.root.left.left.left.data = 30;
        splayAgaci.root.left.left.left.left.data = 20;
        
        splayAgaci.root = search(splayAgaci, 20);
        
        System.out.print("Preorder Gezinme");
        splayAgaci.preOrder(splayAgaci.root);
        
    }  
}

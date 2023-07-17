package tekyonlubagliliste;

public class TekYonluBagliListe {
    public static void main(String[] args) {
        
        ListeYapisi liste = new ListeYapisi();
        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);
        liste.ekle(55);
        liste.ekle(66);
        
        System.out.println();
        
        liste.yazdir();
        
    }   
}

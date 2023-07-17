package tekyonludaireselbagliliste;
import java.util.Scanner;
public class TekYonluDaireselBagliListe {

    public static void main(String[] args) {
        BagliListe liste = new BagliListe();
        
        Scanner klavye = new Scanner(System.in);
        
        int secim = -1;
        while(secim != 0)
        {
            System.out.println("1 - Basa ekle");
            System.out.println("2 - Araya ekle");
            System.out.println("3 - Sona ekle");
            System.out.println("4 - Bastan sil");
            System.out.println("5 - Aradan sil");
            System.out.println("6 - Sondan sil");
            System.out.println("0- Cikis");
            System.out.println("seciminiz: ");
            secim = klavye.nextInt();
            klavye.nextLine();
            
            switch(secim)
            {
                case 1: liste.basaEkle(); break;
                case 2: liste.arayaEkle(); break;
                case 3: liste.sonaEkle();break;
                case 4: liste.bastanSil();break;
                case 5: liste.aradanSil();break;
                case 6: liste.sondanSil();break;
                case 0: System.out.println("Cikis yaptiniz..."); break;
                default: System.out.println("Hatali secim yaptiniz... ");
            }
            liste.yazdir();
        }
    } 
}

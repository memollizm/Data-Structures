package ciftyonludaireselbagliliste;
import java.util.Scanner;
public class CiftYonluDaireselBagliListe {
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        BagliListe liste = new BagliListe();
        
        int secim = -1;
        while(secim != 0)
        {
            System.out.println("1- Basa ekleme");
            System.out.println("2- Araya ekleme");
            System.out.println("3- Sona ekleme");
            System.out.println("4- Bastan sil");
            System.out.println("5- Aradan sil");
            System.out.println("6- Sondan sil");
            System.out.println("7- Tersten yazdir ");
            System.out.println("0- Cikis");
            System.out.print("seciminiz: ");
            secim = klavye.nextInt();
            
            switch(secim)
            {
                case 1: liste.basaEkle(); break;
                case 2: liste.arayaEkle();break;
                case 3: liste.sonaEkle(); break;
                case 4: liste.bastanSil(); break;
                case 5: liste.aradanSil(); break;
                case 6: liste.sondanSil(); break;
                case 7: liste.sondanYazdir();break;
                case 0: System.out.println("Cikis yaptiniz...");; break;
                default: System.out.println("Hatali giris yaptiniz... "); break;
            }
            liste.yazdir();
        }
        
    }   
}

package tekyonlubasaekleme;
import java.util.Scanner;
public class TekYonluBasaEkleme {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        ListeYapisi liste = new ListeYapisi();
        
        int indis,sayi;
        int secim = 1;
        
        while(secim != 0)
        {
            System.out.println();
            System.out.println("1 basa ekle");
            System.out.println("2 sona ekle");
            System.out.println("3 araya ekle");
            System.out.println("4 bastan sil");
            System.out.println("5 sondan sil");
            System.out.println("6 aradan sil");
            System.out.println("0 cikis");
            System.out.println("seciminiz: ");
            secim = klavye.nextInt();
            
            if(secim == 1)
            {
                System.out.println("sayi: ");
                sayi = klavye.nextInt();
                liste.basaEkleme(sayi);
            }
            else if(secim == 2)
            {
                System.out.println("sayi: ");
                sayi = klavye.nextInt();
                liste.sonaEkleme(sayi);
            }
            else if(secim == 3)
            {
                System.out.println("sayi: ");
                sayi = klavye.nextInt();
                System.out.println("indis: ");
                indis = klavye.nextInt();
                liste.arayaEkleme(indis, sayi);
            }
            else if(secim == 4)
            {
                liste.bastanSil();
            }
            else if(secim == 5)
            {
                liste.sondanSil();
            }
            else if(secim == 6)
            {
                System.out.println("indis: ");
                indis = klavye.nextInt();
                liste.aradanSil(indis);
            }
            else if(secim == 0)
            {
                System.out.println("Program sonlandirildi...");
            }
            else
            {
                System.out.println("Gecersiz secim yaptiniz...");
            }
            
            liste.yazdir();
           
        }
        
    }   
}

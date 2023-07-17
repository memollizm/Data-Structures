package ciftyonlubagliliste;
import java.util.Scanner;
public class CiftYonluBagliListe {
    
    public static void main(String[] args) {
        BagliListe bl = new BagliListe();
        
        Scanner klavye = new Scanner(System.in);
        
        int secim = -1;
        int sayi, indis;
       
        while(secim != 0)
        {
           System.out.println("1- Basa ekle");
           System.out.println("2- Sona ekle");
           System.out.println("3- Bastan sil");
           System.out.println("4- Aradan sil");
           System.out.println("5- Sondan sil");
           System.out.println("6- Sondan basa yazdir");
           System.out.println("0- Cikis");
        
           System.out.print("seciminiz: ");
           secim = klavye.nextInt();
           
           if(secim == 0)
           {
               System.out.println("Program sonlandirildi...");
           }
           
           else if(secim == 1)
           {
              System.out.print("Sayi: ");
              sayi = klavye.nextInt();
              bl.basaEkle(sayi);
           }
           else if(secim == 2)
           {
              System.out.print("Sayi: ");
              sayi = klavye.nextInt();
              bl.sonaEkle(sayi);
           }
           else if(secim == 3)
           {
               bl.bastanSil();
           }
           else if(secim == 4)
           {
               System.out.print("indis: ");
               indis = klavye.nextInt();
               bl.aradanSil(indis);
           }
           else if(secim == 5)
           {
               bl.sondanSil();
           }
           else if(secim == 6)
           {
               bl.sondanYazdir();
           }
           bl.yazdir();
        }
   
    }
    
}

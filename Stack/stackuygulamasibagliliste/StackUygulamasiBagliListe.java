package stackuygulamasibagliliste;
import java.util.Scanner;
public class StackUygulamasiBagliListe {
    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        
        StackYapisi stack = new StackYapisi(5);
        
        int secim = -1, data;
        
        while(secim != 0)
        {
            System.out.println("1- Ekle");
            System.out.println("2- Cikar");
            System.out.println("3- Top elemani");
            System.out.println("4- Yazdir");
            System.out.println("0- Cikis");
            System.out.print("seciminiz: ");
            secim = klavye.nextInt();
            
            switch(secim)
            {
                case 1:
                    System.out.print("data: ");
                    data = klavye.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.topGoster();
                    break ;
                case 4:
                    stack.print();
                    break ;
                case 0:
                    System.out.println("Cikis yaptiniz...");
                    break;
                default:
                    System.out.println("Hatali giris");
                    break;
            }
        }
        
    }   
}

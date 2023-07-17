package hanoikuleleri;
import java.util.Scanner;
public class HanoiKuleleri {
    public static void main(String[] args) {
       
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("n degerini giriniz: ");
        int n = klavye.nextInt();
        
        tasi(n,'A','B','C');
    }
    
    public static void tasi(int n, char A, char B, char C)
    {
        if(n == 1)
        {
            System.out.println(A + "-->" + B);
        }
        else
        {
           tasi(n-1,A,C,B);
           tasi(1,A,B,C);
           tasi(n-1,C,B,A);
           return;
        }
    }
}

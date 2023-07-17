package tekyonludaireselbagliliste;
import java.util.Scanner;
public class BagliListe {
    
    Scanner klavye = new Scanner(System.in);   
    
    Node head = null;
    Node tail = null;
    
    void basaEkle()
    {
        int data;
        System.out.println("data: ");
        data = klavye.nextInt();
        
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            tail.next = head;   //Tek yönlü dairesel olduğu için tail.next head'e bağlıdır
        }
        else
        {
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }
    }
    
    void sonaEkle()
    {
        int data;
        System.out.println("data: ");
        data = klavye.nextInt();
        
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else
        {
            tail.next = eleman;
            tail = eleman;
            tail.next = head;
        }
    }
    
    void arayaEkle()
    {
        int data,indis;
        System.out.println("data: ");
        data = klavye.nextInt();
        System.out.println("indis: ");
        indis = klavye.nextInt();
        
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            tail.next = head;
        }
        else if(indis == 0)
        {
            eleman.next = head;
            head = eleman;
            tail.next = head;
        }           //Buraya kadar yapılan işlemler head mi yoksa tail'e mi ekleme yapılacak onu kontrol etti
        else
        {
            int n=0;
            Node temp = head;
            Node temp2 = head;
            while(temp != tail)
            {
                n++;
                temp = temp.next;
            }
            n++;    //Dairesel olduğu için temp tail'in önündeki düğüme kadar geldi ve döngü sayısı 1 az oldu bunun için döngü dışında n++ yaptık
            
            if(indis >= n)  //Girilen indis sayısı listedeki düğüm sayısından fazla olduğu için sona eklenir
            {
              tail.next = eleman;
              tail = eleman;
              tail.next = head;
            }
            else
            {
             int i = 0;
             temp = head;
             temp2 = head;             
             while(i < indis)
             {
                 i++;
                 temp2 = temp;
                 temp = temp.next;
             }
             temp2.next = eleman;
             eleman.next = temp;
            }
        }           
    }
    
    void bastanSil()
    {
        if(head == null)
        {
            System.out.println("Liste bos !!");
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
        }
        else
        {
            head = head.next;
            tail.next = head;
        }
    }
    
    void sondanSil()
    {
        if(head == null)
        {
           System.out.println("Liste bos !!");
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
        }
        else 
        {
            Node temp = head;    //temp ile son düğüme gitmeye çalışıyoruz
            while(temp.next != tail)
            {
                temp = temp.next;
            }
            tail = temp;
            temp.next = head;
        }
    }
    
    void aradanSil()
    {
        if(head == null)
        {
            System.out.println("Liste bos !!!");
        }
        else if(head == tail)
        {
            head = null;
            tail = null;
        }
        else    //if ve else if kısımlarında 1 düğüm yada 0 düğüm durumlarını kontrol ettiğimiz için scanner kullanmadık
        {
            int indis ,n=0;
            System.out.println("indis: ");
            indis = klavye.nextInt();
            klavye.nextLine();     //int değer aldığımız zaman bunu kullanmamız gerekir
            
            Node temp = head;
            Node temp2 = temp;
            
            while(temp != tail)
            {
                temp = temp.next;
                n++;
            }
            n++;
            
            temp = head;
            int i =0;        
            while(i < indis)
            {
                temp2 = temp;
                temp = temp.next;
                i++;
            }
            temp2.next = temp.next;
            
        }
    }
    
    void yazdir()
    {
        Node temp;
        
        if(head == null)
        {
            System.out.println("Liste boştur !!!");
        }
        else
        {
            temp = head;
            System.out.print("bas ->");
            
            while(temp != tail)
            {
                System.out.print(temp.data+" ->");
                temp = temp.next;
            }
            System.out.println(temp.data+" ->"); //while döngüsü tail'den önceki düğüme kadar geldi taili yazdırmak için döngü dışında bir adet daha yazdırma işlemi yaptık
        }
    }    
}

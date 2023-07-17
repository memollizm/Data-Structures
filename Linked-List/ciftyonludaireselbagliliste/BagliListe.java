package ciftyonludaireselbagliliste;
import java.util.Scanner;
public class BagliListe {
    
    Scanner klavye = new Scanner(System.in);
    Node head = null;
    Node tail = null;
    Node temp = null;
    Node temp2 = null;
    int indis, data;
    
    void basaEkle()
    {
        System.out.println("data: ");
        data = klavye.nextInt();
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else
        {
            eleman.next= head;
            head.prev = eleman;
            head = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    
    void sonaEkle()
    {
        System.out.println("data: ");
        data = klavye.nextInt();
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else
        {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
            tail.next = head;
            head.prev = tail;
        }
    }
    
    void arayaEkle()
    {
        System.out.println("indis: ");
        indis = klavye.nextInt();
        System.out.println("data: ");
        data = klavye.nextInt();
        
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
        }
        else if(indis == 0)
        {
           eleman.next= head;
           head.prev = eleman;
           head = eleman;
           tail.next = head;
           head.prev = tail;
        }
        else
        {
         temp = head;
         temp2 = temp;
         int n = 0;
         
         while(temp != tail)
         {
             n++;
             temp = temp.next;
         }
         
         temp = head;
         int i=0;
         
         while(i <  indis)
         {
             temp2 = temp;
             temp = temp.next;
             i++;
         }
         
         if(n < indis)
         {
             tail.next = eleman;
             eleman.prev = tail;
             
             tail = eleman;
             
             tail.next = head;
             head.prev = tail;
         }
         else
         {
             temp2.next = eleman;
             eleman.prev = temp2;
             
             eleman.next = temp;
             temp.prev = eleman;
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
            head.prev = tail;
            tail.next = head;
        }
    }
    
    void sondanSil()
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
        else
        {
            temp = head;
            while(temp.next != tail)
            {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
            head.prev = tail;
        }
    }
    
    void aradanSil()
    {
        if(head == null)
        {
            System.out.println("Liste bos !!!");
        }
        else
        {
           System.out.println("indis: ");
           indis = klavye.nextInt();
           if(head == null && indis == 0)
           {
               head = null;
               tail = null;
           }
           else if(head != null && indis == 0)
           {
               head = head.next;
               head.prev = tail;
               tail.next = head;
           }
           else
           {
               temp = head;
               int n = 0;
               while(temp != tail)
               {
                   n++;
                   temp = temp.next;
               }
                
               if(indis >= n)  //Listedeki eleman sayısından büyük indis değeri girilirse tail silinir
               {
                   tail = temp;
                   tail.next= head;
                   head.prev = tail;
               }
               else
               {
                   temp = head;
                   temp2= temp;
                   int i = 0;
                   while(i < indis)
                   {
                       i++;
                       temp2 = temp;
                       temp = temp.next;
                   }
                   
                   temp2.next = temp.next;
                   temp.next.prev = temp2;
               }
           }
        
        }
    }
    
    void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste bos !!");
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
            System.out.println(temp.data+" -> son.");
        }
    }
    
    void sondanYazdir()
    {
        if(head == null)
        {
            System.out.println("Liste bos !!");
        }
        else
        {
            temp = tail;
            System.out.print("son ->");
            while(temp != head)
            {
                System.out.print(temp.data+" ->");
                temp = temp.prev;
            }
            System.out.println(temp.data+" ->bas.");
        }
    }
}

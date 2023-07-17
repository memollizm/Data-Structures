package ciftyonlubagliliste;

public class BagliListe {
    
    Node head = null;
    Node tail = null;
    
    void basaEkle(int data)
    {
       Node eleman = new Node(data);
       
       if(head == null)
       {
           head = eleman;
           tail = eleman;
       }
       else
       {
           eleman.next = head;
           head.prev = eleman;
           head = eleman;
       }
    }
    
    void sonaEkle(int data)
    {
        Node eleman = new Node(data);
        
        if(head == null)
        {
            head = eleman;
            tail = eleman;
        }
        else
        {
            tail.next = eleman;
            eleman.prev = tail;
            tail = eleman;
        }
    }
    
    void arayaEkle(int indis, int data)
    {
        Node eleman = new Node(data);
        
        if(head == null)  //Liste boş mu kontrol edilir
        {
            head = eleman;
            tail = eleman;
        }
        else if(head != null && indis == 0) //Liste boş değil ama başa eleman ekledik
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
        }
        // Buraya kadar head olaylarını kontrol ettik
        else
        {
            int n = 0;
            Node temp = head;  
            while(temp != null)    //Burada listenin kaç elemanlı olduğunu bulduk
            {
                temp = temp.next;
                n++;
            }
            temp = head;     //temp tail'e gitiği için tekrar head'a aldık
            
            if(indis > n)  //Kullanıcı liste eleman sayısından büyük girerse direkt sona ekleriz
            {
                tail.next = eleman;
                eleman.prev = tail;
                tail = eleman;
            }
            else
            {
                int i = 0;
                
                while(i != indis)  //kullanıcının girdiği indisi bulmaya çalışıyoruz
                {
                    temp = temp.next;
                    i++;
                }
                
                eleman.prev = temp.prev;  //temp'den önceki düğümle elemanı bağladık
                temp.prev.next = eleman;  //temp'den önceki düğümle elemanı bağladık
               
                eleman.next = temp;  //temp'i kaydırdıktan sonra elemanla bağladık
                temp.prev = eleman;  //temp'i kaydırdıktan sonra elemanla bağladık
            }
        }
    }
    
    void bastanSil()
    {
        if(head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                head = head.next;
                head.prev = null;
            }
        }
    }
    
    void sondanSil()
    {
        if(head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    
    void aradanSil(int indis)
    {
        if(head != null)
        {
            if(head.next == null && indis <= 0)
            {
                head = null;
                tail = null;
            }
            else if(head.next != null && indis <= 0)
            {
                head = head.next;
                head.prev = null;
            }
            else
            {
                int n = 0;
                Node temp = head;
                
                while(temp != null)
                {
                    n++;
                    temp = temp.next;
                }
                
                if(indis >= (n-1)) //kullanıcının girdiği indis eleman sayısından büyükse sondaki elemanı(tail) sileriz
                {
                    tail = tail.prev;
                    tail.next = null;
                }
                else
                {
                    temp = head;
                    int i = 0;
                    while(i < indis)  //Buradaki döngü ile silinecek olan düğüme temp sayesinde ulaştık
                    {
                        i++;
                        temp = temp.next;
                    }
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
            }
        }
        
    }
    
    void yazdir()
    {
        Node temp = head;
        System.out.print("bas ->");
        while(temp != null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println(" son.");
    }
    
    void sondanYazdir()
    {
        Node temp = tail;
        System.out.print("son -> ");
        while(temp != null)
        {
            System.out.print(temp.data +" -> ");
            temp = temp.prev;
        }
        System.out.println(" bas.");
    }
}

package tekyonlubasaekleme;

public class ListeYapisi {
    
    Node head = null;
    Node tail = null;
    
    
    void basaEkleme(int x)
    {
        Node eleman = new Node();
        eleman.data = x;
        
        
        if(head == null)
        {
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else
        {
            eleman.next = head;   //Listenin başına burada ekleme yapıldı.
            head = eleman;
            System.out.println("Basa eleman eklendi");
        }
    }
    
    void sonaEkleme(int x)
    {
        Node eleman = new Node();
        eleman.data = x;
        
        if(head == null)
        {
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else
        {
            eleman.next = null;
            tail.next = eleman;   //Sona eleman eklendi
            tail = eleman;        // Kuyruk güncellendi(Sona alındı)
            System.out.println("Sona eleman eklendi");
        }
    }
    
    void arayaEkleme(int indis, int x)  //Araya eklenecek eleman indis numarasına göre eklenecektir.
    {
        Node eleman = new Node();
        eleman.data = x;
        
        if(head == null && indis == 0)
        {
            eleman.next = null;
            head = eleman;
            tail = eleman;
        }
        else if(head != null && indis == 0)  //Burada başa ekleme durumu oluşur
        {
           eleman.next = head;   //Listenin başına burada ekleme yapıldı.
           head = eleman;
           System.out.println(indis+" indisinci siraya yeni eleman eklendi");
        }
        else
        {
            int n=0;          //Burada listedeki düğüm sayısı bulunur
            Node temp = head;
            Node temp2= head;  //Tail(kuyruk)'den hemen önceki düğümü tutmak için oluşturduk 
            
            while(temp.next != null)
            {
              n++;
              temp2 = temp;
              temp = temp.next;
            }
            
            if(n == indis)   //Sona ekleneceği anlamına gelmektedir
            {
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("eleman eklendi");
            }
            else            //Listenin arasında herhangi bir yere ekleneceği anlamına gelir
            {
                temp = head;
                temp2 = head;
                int i=0;
                
                while(i != indis)
                {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                
                temp2.next = eleman;
                eleman.next = temp;
                
                System.out.println(indis+" indisinci siraya yeni eleman eklendi");
                
            }
        }
    }
    
    void bastanSil()
    {
        if(head == null){   //Listede eleman yok
            System.out.println("Listede silinecek eleman yok");
        }
        else if(head.next == null)  //Listede sadece bir eleman var
        {
            head = null;
            tail = null;
            System.out.println("Listede bulunan son elemanda silindi");
        }
        else{     //Listede bir çok eleman var en baştaki silinir
            head = head.next;
            System.out.println("Bastaki eleman silindi");
        }
    }
    
    void sondanSil()
    {
        if(head == null){   //Listede eleman yok
            System.out.println("Listede silinecek eleman yok");
        }
        else if(head.next == null)  //Listede sadece bir eleman var
        {
            head = null;
            tail = null;
            System.out.println("Listede bulunan son elemanda silindi");
        }
        else    //Listede sondaki eleman silinir
        {     
            Node temp = head;
            Node temp2 = head;
            while(temp.next != null)
            {
                temp2 = temp;
                temp = temp.next;
            }
            
            temp2.next = null;
            tail = temp2;
            System.out.println("Sondaki eleman silindi");
        }
    }
    
    void aradanSil(int indis)
    {
        if(head == null)
        {
            System.out.println("Listede eleman yok");
        }
        else if(head.next == null && indis ==0)
        {
            head = null;
            tail = null;
            System.out.println("Listedeki son elemanda silindi");
        }
        else if(head != null && indis == 0)
        {
            head = head.next;
            System.out.println("Bastaki eleman silindi");
        }
        else
        {
            int i = 0;
            Node temp = head;
            Node temp2 = head;
            
            while(temp != null)
            {
                i++;
                temp2 = temp;
                temp = temp.next;
            }
            
            if(i == indis)
            {
                temp2.next = null;
                tail = temp2;
                System.out.println("Sondaki eleman silindi");
            }     
            //Buraya kadar yapılan işlemlerin hepsi head ve taili bulmaya yönelikti
            else
            {
                int j = 0;
                temp = head;
                temp2 = head;
                
                while (j != indis)
                {
                    temp2 = temp;
                    temp = temp.next;
                    j++;
                }
                
                temp2.next = temp.next;
                System.out.println("Aradaki eleman silindi");
            }
        }
    }
    
    void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste yapisi bostur!!");
        }
        else
        {
            Node temp = head;
            System.out.print("bas -> ");
            while(temp != null)
            {
              System.out.print(temp.data+" ->");
              temp = temp.next;
            }
            System.out.println(" son.");
        }
    }
}

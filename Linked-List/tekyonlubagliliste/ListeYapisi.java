package tekyonlubagliliste;
public class ListeYapisi {
    
    Node head = null;
    Node tail = null;
    
    void ekle(int x)
    {
        Node eleman = new Node();  //Eklenecek olan düğüm(obje)
        eleman.data = x;
        eleman.next = null;
        
        if(head == null)
        {
          head = eleman;
          tail = eleman;
          System.out.println("Liste olusturuldu ve ilk dugum(obje) eklendi");
        }  
        else
        {
          tail.next = eleman;   //Son elemanın devamına yeni düğüm eklendi
          tail = eleman;   //tail(son eleman) güncellendi
          System.out.println("Listenin sonuna eleman eklendi");
        }
    }
    void yazdir()
    {
        if(head == null)
        {
            System.out.println("Liste yapisi bos ");
        }
        else
        {
            Node temp = head;
            System.out.print("\nbas->");
            while(temp!=null)
            {
                System.out.print(temp.data+"-> ");
                temp = temp.next;
            }
            System.out.print("son");
        }
    }
}

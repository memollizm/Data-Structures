package kuyrukyapisibagliliste;
public class kuyrukYapisi {
    
    Node front;
    Node rear;
    int cnt;
    int size;
    
    public kuyrukYapisi(int size)
    {
        this.size = size;
        cnt = 0;
        front = null;
        rear = null;
    }
    
    void enQueue(int data)
    {
        if(cnt == size)
        {
            System.out.println("Kuyruk yapisi dolu !!! ");
        }
        else
        {
            Node eleman = new Node(data);
            
            if(cnt == 0)
            {
                front = eleman;
                rear = eleman;
                 System.out.println(data + " kuyruga ilk eleman olarak eklendi");
            }
            else
            {
                rear.next = eleman;
                rear = rear.next;
                System.out.println(data + " kuyruga eklendi");
            }
            cnt++;
        }
    }
    
    void deQueue()
    {
        if(cnt == 0)
        {
            System.out.println("Silinecek eleman yok");
        }
        else
        {
            System.out.println(front.data+" silindi");
            front = front.next;
            cnt--;
        }
    }
    
    void yazdir()
    {
        if(cnt == 0)
        {
            System.out.println("Kuyruk bos, yazdirilacak eleman yok");
        }
        else
        {
            Node temp = front;
            System.out.print("bas <-");
            while(temp != null)
            {
                System.out.print(temp.data + " <- ");
                temp = temp.next;
            }
            System.out.println("son");
        }
    }
}

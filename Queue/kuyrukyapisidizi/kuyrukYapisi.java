package kuyrukyapisidizi;

public class kuyrukYapisi {
   
    int dizi[];
    int size;
    int front;  //head
    int rear;   //tail
    
    public kuyrukYapisi(int size)
    {
        this.size = size;
        dizi = new int[size];
        front = 0;
        rear = -1;
    }
    
    void enQueue(int data)
    {
        if(rear == size-1)
        {
            System.out.println("kuyruk dolu eleman eklenemez");
        }
        else
        {
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + " kuyruga eklendi");
        }
    }
    
    void deQueue()
    {
        if(rear == -1)
        {
            System.out.println("Kuyruk bos silinecek eleman yok");
        }
        else
        {
            int sayi = dizi[front];
            for(int i=1;i<=rear;i++)
            {
                dizi[i-1] = dizi[i];
            }
            rear--;
            System.out.println(sayi+" kuyruktan cikartildi");
        }
    }
    
    void yazdir()
    {
        if(rear == -1)
        {
            System.out.println("Kuyruk bos yazdirilacak eleman yok");
        }
        else
        {
            int i = rear;
            System.out.print("son ->");
            while(i >= 0)
            {
                System.out.print(dizi[i]+" -> ");
                i--;
            }
            System.out.print(" bas");
        }
    }
    
    void elemanSayisi()
    {
        System.out.println("Eleman sayisi: "+(rear+1));
    }
    
}

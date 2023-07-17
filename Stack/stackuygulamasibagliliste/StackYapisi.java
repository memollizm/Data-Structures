package stackuygulamasibagliliste;
public class StackYapisi {
    
    Node top;
    int size;
    int cnt;
    
    public StackYapisi(int size)
    {
        this.size = size;
        cnt = 0;
        top = null;
    }
    
    
    void push(int data)
    {
        Node eleman = new Node(data);
        
        if(isFull())
        {           
            System.out.println("Stack dolu ekleme yapilamadi!!!");
        }
        else
        {
            if(isEmpty())
            {
                top = eleman;
                System.out.println(top.data +" stacke ilk eleman olarak eklendi");
            }
            else
            {
                eleman.next = top;
                top = eleman;
                System.out.println(top.data +" stacke eklendi");
            }
            cnt++;
        }
    }
    
    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack bos !!!");
        }
        else
        {
            System.out.println(top.data+" cikartildi");
            top = top.next;
            cnt--;
        }
    }
    
    void print()
    {
        if(isEmpty())
        {
            System.out.println("Stack bos !!!");
        }
        else
        {
            Node temp = top;
            System.out.println("stack deki veriler\n");
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
    
    void topGoster()
    {
        if(isEmpty())
        {
            System.out.println("Stack bos !!!");
        }
        else
        {
            System.out.println("top elemanin datasi: "+top.data);
        }
    }
    
    boolean isEmpty()
    {
        return cnt == 0;
    }
    
    boolean isFull()
    {
        return cnt == size;
    }
       
}

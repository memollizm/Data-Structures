package stackuygulamasi;
public class StackYigin {
    
    int indis;
    int size;
    int dizi[];
    
    public StackYigin(int size)
    {
        this.size = size;
        dizi = new int[size];
        indis = -1;
    }
    
    void push(int data)      //Ekleme(push()) işleminin geriye dönüş tipi "void" olur
    {
      if(isFull())
      {
          System.out.println("stack dolu !");
      }
      else
      {
          indis++;
          dizi[indis] = data;
          System.out.println("eklendi: "+dizi[indis]);
      }
    }
    
    int pop()              
    {
        if(isEmpty())
        {
            System.out.println("Dizi bos !!");
            return -1;
        }
        else
        {
            return dizi[indis --];
        }
    }
    
    boolean isEmpty()
    {
        return(indis == -1);
    }
    
    boolean isFull()
    {
        return(indis == size-1);
    }
}

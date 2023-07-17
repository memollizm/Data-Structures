package kuyrukyapisidizi;
public class KuyrukYapisiDizi {
    
    public static void main(String[] args) {
        
        kuyrukYapisi kuyruk = new kuyrukYapisi(5);
        
        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        
        kuyruk.deQueue();
        kuyruk.deQueue();
        kuyruk.deQueue();
        
        kuyruk.elemanSayisi();
        
        kuyruk.yazdir();
    }  
}

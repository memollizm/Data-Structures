package kuyrukyapisibagliliste;
public class KuyrukYapisiBagliListe {
    public static void main(String[] args) {
        
        kuyrukYapisi kuyruk = new kuyrukYapisi(5);
        
        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);
        kuyruk.enQueue(50);
        
        kuyruk.deQueue();

        kuyruk.yazdir();
        
        System.out.println("Kuyruktaki eleman sayisi: "+kuyruk.cnt);
        
        System.out.println("Kuyrugun ilk elemani: "+kuyruk.front.data);
        System.out.println("Kuyrugun son elemani: "+kuyruk.rear.data);
    }   
}

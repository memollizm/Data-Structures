package agaclardadengefarki;
public class AgaclardaDengeFarki {
    
    public static void main(String[] args) {
        
        ikiliAgac agac = new ikiliAgac();
        
        agac.insert(5);
        agac.insert(3);
        agac.insert(7);
        agac.insert(2);
        agac.insert(4);
        agac.insert(6);
        agac.insert(8);
        
        Node nodeWithMaxBalanceFactor = agac.findNodeWithMaxBalanceFactor();
        
        System.out.println("Node with max balance factor: " + nodeWithMaxBalanceFactor.data);
        
    }  
}

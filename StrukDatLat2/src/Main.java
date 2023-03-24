
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rafid
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan : " + Hewan);
        
        Hewan.remove(1);
        Hewan.remove(1);
        Hewan.remove(1);
        
        ArrayList<String> Delete = new ArrayList<>();
        Delete.add("Kelinci");
        Delete.add("Kambing");
        Delete.add("Unta");
        
        System.out.println("Hewan yang dihapus \n" + Delete);   
        System.out.println("Output Hewan :");
        System.out.println(Hewan);
    }
}

    

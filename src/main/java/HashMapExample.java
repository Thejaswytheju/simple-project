import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String args[]){
        Map<String,Integer> Map = new HashMap<String, Integer>();
        Map.put("jain",12);
        Map.put("sai",15);
        Map.put("ravi",20);

        System.out.println("values before remove:" +Map);

        Map.remove(12);

        System.out.println("values after remove:" +Map);



    }

}

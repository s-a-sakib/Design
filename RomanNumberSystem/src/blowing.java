import java.util.HashMap;
import java.util.Map;

public class blowing {
    HashMap < String , Integer > player = new HashMap<String,Integer>();
    public void setValue(String Name , int point){
        player.put(Name,point);
    }
    public void getValue(){
        System.out.println(player.getKey);
    }
}

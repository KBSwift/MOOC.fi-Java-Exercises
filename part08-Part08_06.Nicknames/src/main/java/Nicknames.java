
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> names = new HashMap<>();
        
        names.put("matthew", "matt");
        names.put("michael", "mix");
        names.put("arthur", "artie");
        
        System.out.println(names.get("matthew"));
    }

}

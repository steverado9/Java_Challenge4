package HashMap;

import java.util.HashMap;
import java.util.Map;

public class CitynamesAndPopulations {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("KABUL", 300000);
        map.put("TIRANA", 2000456);
        map.put("KABUL", 34598722);
        map.put("LA VELLA", 904567888);

        System.out.println(map);
    }
}

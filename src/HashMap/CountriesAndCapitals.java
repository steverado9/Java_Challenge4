package HashMap;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap to store the mappings of country names to their capitals.
public class CountriesAndCapitals {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("AFGHANISTAN", "KABUL");
        map.put("ALBANIA", "TIRANA");
        map.put("ALGERIA", "KABUL");
        map.put("ANDORRA", "LA VELLA");

        System.out.println(map);
    }
}

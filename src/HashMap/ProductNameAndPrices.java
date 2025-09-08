package HashMap;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap to store the mappings of product names to their prices.
public class ProductNameAndPrices {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Iphone 1", "30$");
        map.put("Iphone 2", "206$");
        map.put("Iphone 3", "3459$");
        map.put("Iphone 4", "9045$");

        System.out.println(map);
    }
}

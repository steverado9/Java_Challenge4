package HashMap;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap to store the mappings of employee IDs to their names.
public class EmployeesAndID {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Stephen");
        map.put(2, "Fola");
        map.put(3, "Mavo");
        map.put(4, "Taves");

        System.out.println(map);
    }
}

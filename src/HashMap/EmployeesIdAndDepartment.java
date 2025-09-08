package HashMap;

import java.util.HashMap;
import java.util.Map;

//Create a HashMap to store the mappings of employee IDs to their departments.
public class EmployeesIdAndDepartment {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Information Technology");
        map.put(2, "Marketing");
        map.put(3, "Sales");
        map.put(4, "Promotion");

        System.out.println(map);
    }
}

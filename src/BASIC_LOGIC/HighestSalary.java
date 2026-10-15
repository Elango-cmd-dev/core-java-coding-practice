package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class HighestSalary {

    private static String checkHighestSalary(Map<String, Integer> input) {
        String employee = "";
        int highestSalary = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                employee = entry.getKey();
            }
        }
        return employee + " → " + highestSalary;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Employee1", 45000);
        map.put("Employee2", 55000);
        map.put("Employee3", 35000);
        System.out.print(checkHighestSalary(map));
    }
}

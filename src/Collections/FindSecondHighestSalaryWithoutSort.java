package Collections;

import java.util.HashMap;
import java.util.Map;

public class FindSecondHighestSalaryWithoutSort {

    public static void main(String[] args) {

        Map<String, Integer> employees = new HashMap<>();
        employees.put("John", 50000);
        employees.put("David", 30000);
        employees.put("Alex", 70000);
        employees.put("Sam", 40000);
        employees.put("Mike", 60000);
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        String highestEmployee = "";
        String secondHighestEmployee = "";
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() > highest) {
                secondHighest = highest;
                secondHighestEmployee = highestEmployee;
                highest = entry.getValue();
                highestEmployee = entry.getKey();
            } else if (entry.getValue() > secondHighest && entry.getValue() != highest) {
                secondHighest = entry.getValue();
                secondHighestEmployee = entry.getKey();
            }
        }
        System.out.println(secondHighestEmployee + " → " + secondHighest);
    }
}
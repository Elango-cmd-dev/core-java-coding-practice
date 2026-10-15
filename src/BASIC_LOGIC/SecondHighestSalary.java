package BASIC_LOGIC;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestSalary {

    private static String findSecondHighest(Map<String, Integer> employees) {
        String employee = "";
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            int salary = entry.getValue();
            if (salary > highest) {
                secondHighest = highest;
                highest = salary;
            } else if (salary > secondHighest && salary != highest) {
                secondHighest = salary;
                employee = entry.getKey();
            }
        }
        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() == secondHighest) {
                employee = entry.getKey();
                break;
            }
        }
        return employee + " → " + secondHighest;
    }

    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        employees.put("Employee1", 45000);
        employees.put("Employee2", 55000);
        employees.put("Employee3", 35000);
        employees.put("Employee4", 50000);
        System.out.print(findSecondHighest(employees));
    }
}
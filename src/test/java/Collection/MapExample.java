package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> weekdays = new HashMap<>();

        weekdays.put(1, "Monday");
        weekdays.put(2, "Tuesday");
        weekdays.put(3, "Wednesday");
        weekdays.put(4, "Thursday");
        weekdays.put(5, "Friday");
        weekdays.put(6, "Saturday");
        weekdays.put(7, "Sunday");

        System.out.println(weekdays);

        for (Map.Entry<Integer, String> entry : weekdays.entrySet()) {
            if (entry.getValue().endsWith("day")) {
                if (entry.getKey() > 5) {
                    System.out.println("Weekends --> \t" + entry.getKey() + " : " + entry.getValue());
                } else {
                    System.out.println("Weekdays --> \t" + entry.getKey() + " : " + entry.getValue());

                }
            }
        }

        weekdays.remove(6);
        weekdays.remove(7, "Sunday");

        weekdays.put(6, "Partial Working day");

        weekdays.putIfAbsent(7, "No Working Day");

        System.out.println(weekdays.getOrDefault(8, "Week has only 7 days"));

        System.out.println(weekdays);
        System.out.println(weekdays.size());
        weekdays.clear();
    }

}

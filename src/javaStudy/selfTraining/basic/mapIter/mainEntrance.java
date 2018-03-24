package javaStudy.selfTraining.basic.mapIter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mainEntrance {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        mapIter2((HashMap<String, String>) map);
    }

    // Travelsal by foreach of elements in map
    public static void mapIter1(HashMap<String, String> map) {
        // for entryset
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + " | " + "val=" + entry.getValue());
        }

        // for keys
        for (String key : map.keySet()) {
            System.out.println("key=" + key);
        }

        // for values
        for (String val : map.values()) {
            System.out.println("value=" + val);
        }
    }

    // Travelsal by iterator of elements in map
    public static void mapIter2(HashMap<String, String> map) {
        Iterator<Map.Entry<String, String>> entries = map.entrySet().iterator();

        while (entries.hasNext()) {
            Map.Entry entry = entries.next();
            System.out.println("key=" + entry.getKey() + " | " + "val=" + entry.getValue());
        }
    }
}

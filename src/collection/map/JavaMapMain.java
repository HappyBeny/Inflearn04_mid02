package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());

    }

    public static void run(Map<String, Integer> map){
        System.out.println("map = " + map);
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " = " + map.get(key) + " ");
        }
    }
}

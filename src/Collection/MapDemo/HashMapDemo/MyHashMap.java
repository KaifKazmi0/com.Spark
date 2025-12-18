package Collection.MapDemo.HashMapDemo;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Kaif",1);// get ignored by jvm
        map.put("Kaif",4);
        map.put("Kumail",5);
        map.put("Ali",3);
        map.put("Arif",2);

        map.put(null,2);
        map.put(null,3);
        System.out.println(map);

        System.out.println(map.get("Kaif"));

    }
}

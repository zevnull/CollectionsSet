package my.test.collections.examples;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    //начальный размер
    private static final int INITIAL_CAPACITY = 5;

    //фактор загрузки
    private static final float LOAD_FACTOR = 1;

    //порядок по доступу. false - (по умолчанию) порядок согласно вставке в Map.
    //                    true - порядок согласно частоте доступа (от меньшей к большей)
    private static final boolean ACCESS_ORDER = true;

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap< Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> linkedHashMapWithAccessOrder = new LinkedHashMap<Integer, String>(INITIAL_CAPACITY, LOAD_FACTOR, ACCESS_ORDER);
        Map<Integer, String> simpleLRUCache = new SimpleLRUCache<Integer, String>(2);


        map.put(5, "a");
        map.put(4, "b");
        map.put(3, "c");
        map.put(2, "d");
        map.put(1, "e");
        System.out.println("HashMap: " + map);

        //----------------------------------------------

        linkedHashMap.put(5, "a");
        linkedHashMap.put(4, "b");
        linkedHashMap.put(3, "c");
        linkedHashMap.put(2, "d");
        linkedHashMap.put(1, "e");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        //-------------------------------------------------

        linkedHashMapWithAccessOrder.put(5, "a");
        linkedHashMapWithAccessOrder.put(4, "b");
        linkedHashMapWithAccessOrder.put(3, "c");
        linkedHashMapWithAccessOrder.put(2, "d");
        linkedHashMapWithAccessOrder.put(1, "e");


        linkedHashMapWithAccessOrder.get(3);
        linkedHashMapWithAccessOrder.get(5);
        linkedHashMapWithAccessOrder.get(1);
        System.out.println("LinkedHashMapWithAccessOrder: " + linkedHashMap);

        //---------------------------------------------------

        simpleLRUCache.put(1, "a");
        simpleLRUCache.put(2, "b");
        simpleLRUCache.put(3, "c");
        simpleLRUCache.get(2);
        simpleLRUCache.put(9,"z");
        System.out.println("simpleLRUCache: " + simpleLRUCache);



    }
}

package my.test.collections.examples;

import java.util.Map;

public class WeakHashMap {

    public static void main(String[] args) {


        Map<Object, String> map = new java.util.WeakHashMap<Object,String>();
        Object data = new Object(); //просто какой-то объект
        map.put(data, "information");

        data = null;     //делаем доступ для GC()
        System.gc();

        for (int i =1; i < 10000; i++)
        {
            if (map.isEmpty()){
                System.out.println("Iteration: " + i);
                System.out.println("Empty!!!");
                break;
            }
        }

    }
}

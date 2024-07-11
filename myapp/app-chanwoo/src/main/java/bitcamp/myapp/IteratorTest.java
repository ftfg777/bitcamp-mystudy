package bitcamp.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class IteratorTest {


    public static void main(String[] args) throws NoSuchElementException {
        List<String> list1 = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        Set<String> set1 = new HashSet<>();
        list1.add("list1");
        map1.put("map1", "map1");
        set1.add("set1");

        Iterator<String> iteratorList1 = list1.iterator();
        Iterator<String> iteratorMap1 = map1.keySet().iterator();
        Iterator<String> iteratorSet1 = set1.iterator();

        while (iteratorList1.hasNext()) {
            System.out.println(iteratorList1.next());
        }

        while (iteratorSet1.hasNext()) {
            System.out.println(iteratorSet1.next());
        }

        while (iteratorMap1.hasNext()) {
            String key = iteratorMap1.next();
            System.out.println("key: " + key + " value: " + map1.get(key));
        }


    }

}

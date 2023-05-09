package assistedPracticeProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

public class collections {
    public static void main(String args[])
    {
        //arraylist collections
    	
    	ArrayList<String> list = new ArrayList<String>();
        list.add("hey");
        list.add("your");
        list.add("doing");
        list.add("good!");
 
        for (String quote : list) {
            System.out.println(quote);
        }
        
       //hashsets
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("HashSet:");
        for (int num : set) {
            System.out.println(num);
        }
        
        //hashmaps
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("HashMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}

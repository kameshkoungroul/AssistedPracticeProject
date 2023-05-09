package assistedPracticeProject;

import java.util.HashMap;
import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {
		  HashMap<String, Integer> map = new HashMap<>();
	        map.put("one", 1);
	        map.put("two", 2);
	        map.put("three", 3);
	        System.out.println("HashMap:");
	        for (String key : map.keySet()) {
	            System.out.println(key + " = " + map.get(key));
	        }
	        
	        // TreeMap
	        TreeMap<String, Integer> treeMap = new TreeMap<>();
	       
	        treeMap.put("one", 1);
	        treeMap.put("two", 2);
	        treeMap.put("three", 3);
	        System.out.println("TreeMap:");
	        for (String key : treeMap.keySet()) {
	            System.out.println(key + " = " + treeMap.get(key));
	        }

	}

}

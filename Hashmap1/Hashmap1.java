package Hashmap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Hashmap1 {
	 public static List<String> sortSales(Map<String, Integer> sales) {
	        List<Map.Entry<String, Integer>> list = new ArrayList<>(sales.entrySet());
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        List<String> result = new ArrayList<>();
	        for (Map.Entry<String, Integer> entry : list) {
	            result.add(entry.getKey());
	        }
	        return result;
	    }
	
}

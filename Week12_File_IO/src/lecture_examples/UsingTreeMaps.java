package lecture_examples;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UsingTreeMaps {
	public static void main(String[] args) {
		//Map Create Syntax:
		//TreeMap<KeyType, ValueType> mapName = new TreeMap<>();
		
		TreeMap<String, Double> games = new TreeMap<>();
			
		//Adding values to a TreeMap
		games.put("Subnautica", 29.99);
		games.put("No Man's Sky", 59.99);
		games.put("Valheim", 19.99);
		
		//Getting Values
		System.out.println(games.get("Subnautica"));
		
		//Getting a Set of the Keys and printing the map.
		Set<String> keys =  games.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String nextKey = it.next();
			System.out.println("key = " + nextKey + ", value = " + games.get(nextKey));
		}
		
		//Using a Map Entry object to print out the map.
		for (Map.Entry<String, Double> entry : games.entrySet()) {
		    System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
		}
	}
}
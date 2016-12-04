package collection;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConurrentModificationIterationTest {

	public static void main(String[] args) {
	Map<Integer, String> hs=new ConcurrentHashMap<Integer, String>();
		hs.put(11, "Spring Aop");
		hs.put(22,"Spring Ioc");
		hs.put(33, "Spring MVC");

		Iterator<Integer> keySetIterator = hs.keySet().iterator();
		while(keySetIterator.hasNext()){ 
			Integer key = keySetIterator.next(); 
			System.out.println("key: " + key + " value: " + hs.get(key));
			hs.put(44, "Spring DAO");
		}
       
		
		



	}

}

package SamplePractice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class has_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] queryType = new String[]{"insert","insert","addToValue","addToKey","get"};
		int[][] query = new int[][] {{1,2},{2,3},{2},{1},{3}};
		int result = hash(queryType, query);
		System.out.println("hashMap(queryType,query)= " + result);
	}
	
	public static int hash(String[] types, int[][] query) {
		HashMap<Integer, Integer> h = new HashMap<>();
		int len = types.length;
		int result = 0;
		for( int i =0; i< len; i++) {
			switch(types[i]) {
				case "insert":
					insertToHash(h, query[i]);
					break;
				case "addToValue":
					addValueTo(h, query[i]);
					break;
				case "addToKey":
					h = addKeyTo(h, query[i]);
					break;
				case "get":
					result += h.get(query[i][0]);
			}
		}
		return result;
	}
	
	public static void insertToHash(HashMap<Integer, Integer> hash, int[] query) {
		hash.put(query[0], query[1]);
	}
	public static void addValueTo(HashMap<Integer, Integer> hash, int[] query) {
		int elem = 0;
		for(Map.Entry<Integer,Integer> entry : hash.entrySet()) {
			elem = entry.getValue();
			entry.setValue(elem + query[0]);
		}
	}
	public static HashMap<Integer, Integer> addKeyTo(HashMap<Integer, Integer> hash, int[] query) {
		int elem = 0;
		HashMap<Integer, Integer> h = new HashMap<>();
		for(Map.Entry<Integer,Integer> entry : hash.entrySet()) {
			elem = entry.getKey();
			h.put(elem + query[0], entry.getValue());
		}
		return h;
	}
}

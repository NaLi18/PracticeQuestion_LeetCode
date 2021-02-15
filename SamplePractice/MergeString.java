package SamplePractice;
import java.util.HashMap;

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="eccccgftdopoqac";
		String b="fgdchfdhle";
		System.out.println(mergeString(a,b));
	}
	public static String mergeString(String a, String b){
		String result ="";
		int len1 = a.length(),len2 = b.length(), i=0, j=0;
		HashMap<Character, Integer> hash1 = countFrequency(a);
		HashMap<Character, Integer> hash2 = countFrequency(b);
		while(i<len1 && j<len2) {
			if(hash1.get(a.charAt(i)) < hash2.get(b.charAt(j))) {
				result+=a.charAt(i);
				i++;
			}else if(hash1.get(a.charAt(i)) > hash2.get(b.charAt(j))) {
				result+= b.charAt(j);
				j++;
			}else {
				if(a.charAt(i)<= b.charAt(j)) {
					result+=a.charAt(i);
					i++;
				}else {
					result+=b.charAt(j);
					j++;
				}
			}
		}
		while(i<len1) {
			result+= a.charAt(i);
			i++;
		}
		while(j<len2) {
			result+=b.charAt(j);
			j++;
		}
		return result;
	}
	public static HashMap<Character, Integer> countFrequency(String a){
		HashMap<Character, Integer> hash = new HashMap<>();
		for(int i=0; i< a.length(); i++){
			if(hash.containsKey(a.charAt(i))) {
				hash.replace(a.charAt(i), hash.get(a.charAt(i)), hash.get(a.charAt(i))+1);
			}else {
				hash.put(a.charAt(i), 1);
			}
		}
		return hash;
	}

}

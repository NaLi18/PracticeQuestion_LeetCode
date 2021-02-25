package SamplePractice;
import java.util.*;
public class twoStrings_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "axsiobhhgftydrfcghckuhuhisaaedfxhbjb";
		String b = "llolklkiillyttrewszxcvbmmnnbcxx";
		System.out.println(twoStrings(a,b));
	}
	public static String twoStrings(String s1, String s2) {
        Set<Character> c1 = new HashSet<Character>();
        for(char c : s1.toCharArray()) c1.add(c);
        for(char b: s2.toCharArray()){
            if(c1.contains(b)){
                return "YES";
            }
        }
        return "NO";
    }
}

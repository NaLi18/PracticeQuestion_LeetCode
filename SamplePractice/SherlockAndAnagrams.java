package SamplePractice;
import java.util.*;
public class SherlockAndAnagrams {
	public static void main(String[] args) {
			System.out.println(sherlockAndAnagrams("shjkajknjcjknklqnilnwinlknkndhjbcjbsjcbsjhjhkjnbvnznxa"));
	}
	public static int sherlockAndAnagrams(String s) {
        int result =0,a=0,b=1, len = s.length();
        String revs; 
        List<String> ls = new ArrayList<>();
        while(a< len){
            for(b=1; b<=len-a; b++){
                ls.add(s.substring(a,a+b));
            }
            a++;
        }
        int j=0;
        for(int i=0; i< ls.size(); i++){
            String elem = ls.get(i);
            j=i+1;
            while(j<ls.size()){
                if(count(ls.get(j), elem)){
                    result++;
                }
                j++;
            }
        }
        return result;
    }
    public static boolean count(String sub, String sub1){
        if(sub.length() != sub1.length()){
            return false;
        }
        int[] letters = new int[26];
        char ch;
        for(int i=0; i< sub.length(); i++){
            ch = sub.charAt(i);
            letters[ch-'a']++;
            ch = sub1.charAt(i);
            letters[ch-'a']--;
        }
        for(int j=0; j<letters.length; j++){
            if(letters[j] !=0){
                return false;
            }
        }
        return true;
    }
}

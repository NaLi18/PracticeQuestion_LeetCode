package SamplePractice;
import java.util.*;

public class parenthesis_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using hashmap
		System.out.println(isValid1("{{[]()}[][()]}"));
		//using stack
		System.out.println(isValid2("{{[]()}[][()]}"));
	}
	// check for valid parenthesis
	public static boolean isValid1(String s) {
	        HashMap<Character, Character> str = new HashMap<>();
	        str.put('{', '}');
	        str.put('[',']');
	        str.put('(', ')');
	        int len = s.length();
	        if(len <= 1){
	            return false;
	        }
	        while(len > 1){
	            int lastOpen = stopPoint(s,str);
	            if(lastOpen<0 || lastOpen == len-1 || s.charAt(lastOpen+1) != str.get(s.charAt(lastOpen))){
	                return false;
	            }
	            s = s.substring(0, lastOpen)+s.substring(lastOpen+2, len);
	            len = s.length();
	        }
	        if(len == 1){
	            return false;
	        }
	        return true;     
	}
	public static int stopPoint(String s, HashMap<Character, Character> str){
	        int stop = s.length()-1;
	        while(stop >= 0 && !str.containsKey(s.charAt(stop))){
	            // System.out.println("look for last open");
	            stop --;
	        }
	        // System.out.println("last open at " + stop);
	        return stop;
	}

	public static boolean isValid2(String s) {
	       char[] stack = new char[s.length()];
			int head = 0;
			for(char c : s.toCharArray()) {
				switch(c) {
					case '{':
					case '[':
					case '(':
						stack[head++] = c;
						break;
					case '}':
						if(head == 0 || stack[--head] != '{') return false;
						break;
					case ')':
						if(head == 0 || stack[--head] != '(') return false;
						break;
					case ']':
						if(head == 0 || stack[--head] != '[') return false;
						break;
				}
			}
			return head == 0;

	}
}

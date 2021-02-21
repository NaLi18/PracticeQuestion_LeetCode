package SamplePractice;

public class BuildPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abaaabcbccb";
		System.out.println(buildPalindrome(st));
	}
	public static String buildPalindrome(String st) {
	    String end = "";
	    int len = st.length()-1, i =0;
	    while(i<=len){
	        if (st.charAt(i) != st.charAt(len)){
	            end = st.charAt(i) + end;
	        }else{
	            if(palindrome(st.substring(i, len+1))){
	                return st+end;
	            }else{
	                end = st.charAt(i) + end;
	            }
	        }
	        i++;
	    }
	    return st+end;
	}

	public static boolean palindrome(String s){
	    int i =0, j =s.length()-1;
	    while(i<j){
	        if(s.charAt(i) != s.charAt(j)){
	            return false;
	        }
	        i++;
	        j--;
	    }
	    return true;
	}
}

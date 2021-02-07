package SamplePractice;

public class Add_Binary {
	public static void main(String[] args) {
		String a = "11011011001111011";
		String b = "10110101001011";
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
        String result =""; 
        int add = 0; 
        int i = a.length(), j = b.length();
        int max_len = (i>j)? i : j;
        int k=0 ;
        int p=i-1, q=j-1;
        while(k<max_len){
            if(k<i && k<j){
                if(a.charAt(p) == '1' && b.charAt(q) == '1'){
                    if(add == 1){
                        result = "1" + result;
                    } else{
                        result = "0" + result;
                        add = 1;
                    }
                } else if( a.charAt(p) == '1' ||  b.charAt(q) == '1'){
                    if(add == 1){
                        result = '0' + result;
                    } else{
                        result = "1"  + result;
                        add = 0;
                    }
                } else {
                    if(add == 1){
                        result = "1" + result;
                        add = 0;
                    } else {
                        result = "0" + result;
                    }
                }
                k++;
                p--;
                q--;
            }
            else if(k<i){
                if(a.charAt(p) == '0'){
                    if(add == 1){
                        result = "1" + result;
                        add = 0;
                    }
                    else{
                        result = "0"  + result;
                    }
                } else{
                    if(add == 1){
                        result = "0" + result;
                        add = 1;
                    } else{
                        result = "1" + result;
                        add = 0;
                    }
                }
                p--;
                k++;
            } else if(k<j){
                if(b.charAt(q) == '0'){
                    if(add == 1){
                        result = "1" + result;
                        add = 0;
                    }
                    else{
                        result = "0" + result;
                    }
                } else{
                    if(add == 1){
                        result = "0" + result;
                        add = 1;
                    } else{
                        result = "1" + result;
                        add = 0;
                    }
                }
                q--;
                k++;
            }
        }
        if(add == 1){
            result = "1" + result;
        }
        return result;
    }
}

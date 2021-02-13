package SamplePractice;
import java.util.*;
public class almostIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {1,2,3,4,5,6,7,9,7,8,10,11,12};
		System.out.println(func(test));
	}
	public static boolean func(int[] sequence) {
	    int movedCount = 0;
	    int a, b, c;
	    for(int i=0; i< sequence.length-2 && movedCount < 3; i++){
	        a= sequence[i];
	        b= sequence[i+1];
	        c= sequence[i+2];
	        
	        if(a>=b){
	            movedCount++;
	            a = b-1;
	        }
	        
	        if(b>=c){
	            movedCount++;
	            if(a==c){
	                sequence[i+2] = a+2;
	            }
	            else{
	                sequence[i+1] = a;
	            }
	        }
	    }
	    return movedCount <=1;
	}

}

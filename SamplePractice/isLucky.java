package SamplePractice;
import java.util.*;
import java.math.*;
public class isLucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isLucky(435921));
	}
	public static boolean isLucky(int n) {
	    String s = String.valueOf(n);
	    int middle = s.length()/2, sum1=0, sum2=0, i=0, j=middle;
	    while(i<middle && j<s.length()){
	        sum1 += (int) (n/Math.pow(10, j))%10;
	        sum2 += (int) (n/Math.pow(10, i))%10;
	        i++;
	        j++;
	    }
	    if(sum1 == sum2){
	        return true;
	    } else{
	        return false;
	    }
	}

}

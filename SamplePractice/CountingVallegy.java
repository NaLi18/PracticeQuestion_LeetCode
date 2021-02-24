package SamplePractice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountingVallegy {

	public static void main(String[] args) throws IOException {
		String path = "DDUUDDDUDUUDUDDDUUDDUDDDUDDDUDUUDDUUDDDUDDDUDDDUUUDUDDDUDUDUDUUDDUDUDUDUDUUUUDDUDDUUDUUDUUDUUUUUUUUU";
		String path1 = "DDUUDDUDUUUD";
		int step = 100, step1=12;
		System.out.println(countingValleys(step1, path1));
	}
	public static int countingValleys(int steps, String path) {
	    // Write your code here
	        int i =0, result = 1, revs = 0;
	        while(i<steps){
	            if(path.charAt(i)=='U'){
	                result++;
	            }else if(path.charAt(i) == 'D'){
	                result--;
	            }
	            if(result == 1 && path.charAt(i) == 'U'){
	            	System.out.println("increase " + revs);
	                revs++;
	            }
	            i++;
	        }
	        return revs;
	}
}

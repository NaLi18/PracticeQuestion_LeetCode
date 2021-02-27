package SamplePractice;
import java.util.*;
import java.io.File;

public class CountTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> arr = new ArrayList<>();
		for(int i =0; i<10000; i++) {
			arr.add((long) 1237);
		}
		long r =1;
		long[] a = new long[] {1,3,9,9,27,81};
		List<Long> arr2 = new ArrayList<>();
		for(long i: a) {
			arr2.add(i);
		}
		System.out.println(countTriplets(arr, 1));
		System.out.println(countTriplets2(arr,1));
	}
	//First-Method
	public static long countTriplets(List<Long> arr, long r) {
		long result=0, a, b, c;
        int len = arr.size(),j=0,k=0;
        List<Long> temp;
        for(int i=0; i< len-2; i++){
            a= arr.get(i);
            b = a*r;
            c = b*r;
            j=i+1;
            temp = arr.subList(j,len);
            if(temp.contains(b) && temp.contains(c)){
                k = count(temp, b,c);
                result += k;
            }
        }
        return result;
    }
    public static int count(List<Long> arr, long b, long c){
        int count =0, len = arr.size(), i = len-1, countC =0;
        while(i>=0){
        	if(arr.get(i) == b){
                count+=countC;
            }
            if(arr.get(i) == c){
                countC++;
            }
            i--;
        }
        return count;
    }
    //Second Method
    static long countTriplets2(List<Long> arr, long r) {
        long result=0,a,b,c;
        int len = arr.size(), i = len-1;
        HashMap<Long, Long[]> hash = new HashMap<>();
        Long[] temp;
        while(i>=0){
            b = arr.get(i);
            a = b/r;
            c = b*r;
            temp = new Long[2];
            if(hash.containsKey(b)){
                result += (hash.get(b)[0] * hash.get(b)[1]);
            }else{
                temp[0] = count2(arr.subList(0,i),a);
                temp[1] = count2(arr.subList(i+1,len), c);
                hash.put(b,temp);
                result += (temp[0]*temp[1]);
            }
            if(hash.containsKey(a)){
                hash.get(a)[1]++;
            }
            if(hash.containsKey(c)){
                hash.get(c)[0]--;
            }
            i--;
        }
        return result;
    }
    public static long count2(List<Long> arr, long b){
        long count =0;
        for(int i=0; i< arr.size(); i++){
            if(arr.get(i) == b){
                count++;
            }
        }
        return count;
    }
}

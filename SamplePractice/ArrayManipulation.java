package SamplePractice;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] queries = new int[][] {{1,5,7},{1,9,-3},{2,10,1}};
		System.out.println(arrayManipulation(n , queries));
	}
	public static long arrayManipulation(int n, int[][] queries) {
        long maxValue=0, sum=0;
        long[] ls = new long[n+1];
        int i =0, a,b,k; 
        while(i< queries.length){
            a = queries[i][0]-1;
            b = queries[i][1];
            k = queries[i][2];
            ls[a] += k;
            ls[b] -= k;
            i++;
        }
        for(int j=0; j< n; j++) {
            sum += ls[j]; 
            maxValue = Math.max(sum, maxValue);
        }
        return maxValue;
    }
}

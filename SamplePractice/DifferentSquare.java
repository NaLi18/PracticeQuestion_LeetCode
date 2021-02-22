package SamplePractice;
import java.util.HashMap;
import java.util.*;

public class DifferentSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {{2,5,3,4,3,1,3,2}, 
		                              {4,5,4,1,2,4,1,3}, 
		                              {1,1,2,1,4,1,1,5}, 
		                              {1,3,4,2,3,4,2,4}, 
		                              {1,5,5,2,1,3,1,1}, 
		                              {1,2,3,3,5,1,2,4}, 
		                              {3,1,4,4,4,1,5,5}, 
		                              {5,1,3,3,1,5,3,5}, 
		                              {5,4,4,3,5,4,4,4}};
		System.out.println(differentSquares(matrix));
	}
	public static int differentSquares(int[][] matrix) {
	    HashMap<int[], Integer> hash = new HashMap<>();
	    int result = 0, i=0,j=0;
	    int[] elem;
	    int row = matrix.length, col = matrix[0].length;
	    while(i< row-1){
	        while(j < col -1){
	            elem = new int[4];
	            elem[0] = matrix[i][j];
	            elem[1] = matrix[i][j+1];
	            elem[2] = matrix[i+1][j];
	            elem[3] = matrix[i+1][j+1];
	            if(!include(hash, elem)){
	                result++;
	                hash.put(elem, 1);
	            }
	            j++;
	        }
	        i++;
	        j=0;
	    }
	    return result;
	}

	public static boolean include(HashMap<int[], Integer> hash, int[] elem){
	    boolean res = false;
	    int i=0;
	    Set<int[]> keys = hash.keySet();
	    for(Iterator<int[]> it = keys.iterator(); it.hasNext(); ) {
	        int[] f = it.next();
	        for(i =0; i<4; i++){
	            if(f[i] != elem[i]){
	                break;
	            }
	        }
	        if(i == 4){
	            return true;
	        }
	    }
	    return res;
	}
}

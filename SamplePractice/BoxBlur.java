package SamplePractice;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class BoxBlur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int image[][] = {{36,0,18,9,9,45,27}, {27,0,254,9,0,63,90}, 
		                 {81,255,72,45,18,27,0}, {0,0,9,81,27,18,45}, 
		                 {45,45,227,227,90,81,72},{45,18,9,255,9,18,45}, 
		                 {27,81,36,127,255,72,81}};
		printAll(boxBlur(image));
	}
	public static int[][] boxBlur(int[][] image) {
	    int row= image.length;
	    int column = image[0].length;
	     int[][] result = new int[column-2][];
	    if(row<3 || column < 3){
	        return result;
	    }
	    int c=0, r=0;
	    HashMap<Integer, List<Integer>> hash = new HashMap<>();
	    while(r<row-2){
	        if(c<column-2){
	            if(hash.containsKey(r)){
	                hash.get(r).add(sumNine(image, r,c));
	            }else{
	                List<Integer> elem = new ArrayList<>();
	                elem.add(sumNine(image, r, c));
	                hash.put(r, elem);
	            }
	            c++;
	        }else{
	            r++;
	            c=0;
	        }
	    }
	    result = new int[hash.size()][];
	    int idx =0;
	    for(Map.Entry<Integer, List<Integer>> entry : hash.entrySet()) {
				int[] e = entry.getValue().stream().mapToInt(p->p).toArray();
				result[idx] = e; 
				idx++;
		}
	    return result;
	}

	public static int sumNine(int[][] image, int rbegin, int cbegin){
	    int sum=0;
	    int i = rbegin, j = cbegin;
	    while(i<rbegin+3){
	        if(j< cbegin+3){
	            sum+=image[i][j];
	            j++;
	        }else{
	            i++;
	            j=cbegin;
	        }
	    }
	    return sum/9;
	}
	
	public static void printAll(int[][] elem) {
		for(int[] k: elem) {
			if(k != null) {
				System.out.print("[");
				for(int o: k) {
        			System.out.print(o + ",");
        		}
			}
        	System.out.println("]");
        }
	}
}

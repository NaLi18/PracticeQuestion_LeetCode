package SamplePractice;
import java.util.*;
import java.util.HashMap;
public class MeanGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = new int[][]{{3,3,4,2},
            {4,4},
            {4,0,3,3},
            {2,3},
            {3,3,3}};
        printAll(meanG(test));
	}
	
	public static int[][] meanG(int[][] test){
		HashMap<Double, List<Integer>> hash = new HashMap<>();
		double m;
		for(int i=0; i< test.length; i++) {
			m = means(test[i]);
			if(hash.containsKey(m)) {
				hash.get(m).add(i);
			}else {
				List<Integer> sample = new ArrayList<>();
				sample.add(i);
				hash.put(m, sample);
			}
		}
		int[][] res = new int[hash.size()][];
		int idx =0;
		for(Map.Entry<Double, List<Integer>> entry : hash.entrySet()) {
			//List<Integer> el = entry.getValue();
			int[] elem = entry.getValue().stream().mapToInt(i->i).toArray();
			/*
			int[] elem = new int[el.size()];
			int ll= 0;
			for(Integer e: el) {
				elem[ll] = e.intValue();
				System.out.println("add to a list " + idx + " value " + elem[ll]);
				ll++;
			}*/
			res[idx] = elem; 
			idx++;
		}
		return res;
	}
	
	public static double means(int[] nums) {
		double m =0;
		double sum =0;
		for(int i =0; i< nums.length; i++) {
			sum += nums[i];
		}
		m = (double)(sum/nums.length);
		return m;
	}
	
	public static void printAll(int[][] elem) {
		for(int[] k: elem) {
			if(k != null) {
				for(int o: k) {
        			System.out.print(o);
        		}
			}
        	System.out.println();
        }
	}
}

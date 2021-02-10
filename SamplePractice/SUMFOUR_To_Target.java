package SamplePractice;
import java.util.*;
import java.util.stream.IntStream;

public class SUMFOUR_To_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-9,-1,2,0,-4,7,-1,-2,4,5,7,-3,-5,9,8};
		System.out.println( fourSum(nums, 10).toString());
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result =  new ArrayList<>();
        List<Integer> elem;
        Arrays.sort(nums);
        int a,b,c,d,r;
        int len = nums.length;
        if(len < 4 && IntStream.of(nums).sum() == target){
            elem = new ArrayList<>(len){{
                for(int i : nums) add(i); 
            }};
            return result;
        }
        for(a = 0; a< len-3; a++){
            for(b = a+1; b < len-2; b++){
                c = b+1;
                d = len-1;
                while(c < len-1){
                    elem = new ArrayList<>();
                    r = target - (nums[a]+nums[b]+nums[c]+nums[d]);
                    if(r == 0){
                        elem.add(nums[a]);
                        elem.add(nums[b]);
                        elem.add(nums[c]);
                        elem.add(nums[d]);
                        if(! result.contains(elem)) result.add(elem);
                    }
                    d--;
                    if(d == c){
                        c++;
                        d = len-1;
                    }
                }
            }
        }
        return result;
    }
}

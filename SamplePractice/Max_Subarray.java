package SamplePractice;
//need remember how he solve this problem.
public class Max_Subarray {
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(max_array(arr));
	}
	public static int max_array(int[] nums) {
		int size = nums.length;
		//maxValue stored, max_end is the start of the sum
        int max_so_far= Integer.MIN_VALUE, max_ending_here=0;
        for(int i=0;i< size;i++)
        {
        	//get the sum of continuous integers
            max_ending_here+=nums[i];
            //if the sum greater than the maxValue then assign the value of sum to maxValue
            if(max_so_far<max_ending_here)
                max_so_far= max_ending_here;
            //if the sum is less than 0 then stop the continue add else continue add to sum
            if(max_ending_here<0)
                max_ending_here=0;
        }
        return max_so_far;
	}
}

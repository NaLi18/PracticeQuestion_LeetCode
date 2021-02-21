package SamplePractice;

public class countSubsegments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[] {1,3,5,2,7,9};
		System.out.print(countSegment(test));
	}
	public static int countSegment(int[] nums) {
		int ways =0, a=1, b=2, len= nums.length;
		int s1,s2,s3,c=b;
		while( a < len-1) {
			if(b<len) {
				s1 = sumSubSegment(nums, 0,a);
				s2 = sumSubSegment(nums, a,b);
				s3 = sumSubSegment(nums, b,c+1);
				System.out.println("compare " + a + ", " +b + "," + c);
				if(c<len) {
					if(s1<=s2 && s2<=s3) {
						System.out.println("add ways " + (len-b));
						ways++;
					}
					c++;
				}else {
					b++;
					c=b;
				}
			}else {
				a++;
				b= a+1;
			}
			
		}
		return ways;
	}
	public static int sumSubSegment(int[] nums, int begin, int end) {
		int sum =0;
		while(begin<end) {
			sum += nums[begin];
			begin++;
		}
		return sum;
	}
}

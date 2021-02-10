package SamplePractice;

public class ClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int answer1 = bruteForce(0,44);
        int answer2 = logistic(44);
        //System.out.println(answer1); // method1's complexity > method2
        System.out.println(answer2);
	}
    public static int logistic(int n){
        int[] result = new int[n+1];
        if(n<3){
            return n;
        }
        result[0]=1;
        result[1]=2;
        int k=2;
        while(k<n){
            result[k] = result[k-2]+result[k-1]; 
            k++;
        }
        return result[n-1];
    }
    public static int bruteForce(int start, int target){
        if( start > target){
            return 0;
        }
        if(start == target){
            return 1;
        }
        
        return bruteForce(start+1, target) +  bruteForce(start+2, target);
    }
}

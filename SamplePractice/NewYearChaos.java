package SamplePractice;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testcase = new int[]{1,2,5,3,7,8,6,4};
		minimumBribes(testcase);
	}
	public static void minimumBribes(int[] q) {
		int swaps = 0;
        int min = q.length;
        for (int i = q.length - 1; i >= 0; i--){
        	System.out.println("Compare " + q[i] + " with "+ i);
            if (q[i] - i > 3){
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] > i+1){
                swaps += (q[i]-(i+1));
            } else {
                if (min > q[i]){
                    min = q[i];
                } else if (q[i] != min){
                    swaps++;
                }
            }
        }
        System.out.println(swaps);
	}

}

package SamplePractice;

public class Minesweeper_setUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] matrix = new boolean[][]{{true,false}, {true,false}, 
		                               {false,true}, 
		                               {false,false}, 
		                               {false,false}};
		printAll(minesweeper(matrix));
	}
	public static int[][] minesweeper(boolean[][] matrix) {
	    int row = matrix.length, column = matrix[0].length;
	    int[][] minesweeper = new int[row][column];
	    int i = 0, j=0;
	    while(i<row){
	        if(j<column){
	            minesweeper[i][j] = countFlags(matrix, i, j);
	            j++;
	        }else{
	            i++;
	            j=0;
	        }
	    }
	    return minesweeper;
	}

	public static int countFlags(boolean[][] matrix, int r, int c){
	    int count=0;
	    int i=r-1 , rbegin = r-1;
	    int j=c-1, cbegin= c-1;
	    if(i<0){
	        i++;
	        rbegin = i;
	    }
	    if(j<0){
	        j++;
	        cbegin = j;
	    }
	    while(i<matrix.length && i<r+2){
		        if(j<matrix[0].length && j< c+2){
		            if(matrix[i][j]){
	                    count++;
	                }
		            j++;
		        }else{
		            i++;
		            j=cbegin;
		        }
		    }
	    if(matrix[r][c]){
	        count--;
	    }
	    return count;
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

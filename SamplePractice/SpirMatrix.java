package SamplePractice;
import java.util.*;
public class SpirMatrix {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{5,6,7},{9,10,11},{12,14,16},{17,18,20}};
		int[][] matrix2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		System.out.print(convertMatrix(matrix2).toString());

	}
	public static List<Integer> convertMatrix(int[][] matrix){
		List<Integer> ls = new ArrayList<Integer>();
		boolean stop = false;
		int row = matrix.length;
		int column = matrix[0].length;
		int rstart = 0;
		int cstart = 0;
		while(!stop) {
			if(row < rstart+1 && column < cstart+1) {
				stop=true;
			}else {
				// System.out.println("go left until row "+ rstart + " column " + (column-1));
				if(goLeft(matrix, ls, column, rstart, cstart)) {
					rstart++;
					//System.out.println("go down until row "+ (row-1) + " column " + (column-1));
					if( goDown(matrix, ls, row, column, rstart )){
						column--;
						System.out.println("go right until row "+ (row-1) + " column " + (cstart));
						if(goRight(matrix, ls, column,row, cstart )){
							row--;
							System.out.println("go up until row "+ (rstart) + "column" +cstart);
							if(goUp(matrix, ls,row, cstart, rstart )) { cstart++; } else{ break; };
						} else {break;}
					}else {break;}
					
				} else {break;}
			}
		}
		return ls;
	}
	public static boolean goLeft(int[][] matrix, List<Integer> ls, int stop, int r,int begin) {
		boolean flag = false;
		for(int i = begin; i < stop; i++) {
			System.out.println(matrix[r][i]);
			ls.add(matrix[r][i]);
			flag = true;
		}
		return flag;
	}
	public static boolean goDown(int[][] matrix, List<Integer> ls, int stop, int col, int begin) {
		boolean flag = false;
		for(int i = begin; i < stop; i++) {
			System.out.println(matrix[i][col-1]);
			ls.add(matrix[i][col-1]);
			flag = true;
		}
		return flag;
	}
	public static boolean goRight(int[][] matrix, List<Integer> ls, int stop, int r, int begin) {
		boolean flag = false;
		for(int i = stop-1 ; i>= begin; i--) {
			System.out.println(matrix[r-1][i]);
			ls.add(matrix[r-1][i]);
			flag = true;
		}
		return flag;
	}
	public static boolean goUp(int[][] matrix, List<Integer> ls, int stop, int c, int begin) {
		boolean flag = false;
		for(int i= stop-1; i>=begin; i--) {
			System.out.println(matrix[i][c]);
			ls.add(matrix[i][c]);
			flag = true;
		}
		return flag;
	}
}

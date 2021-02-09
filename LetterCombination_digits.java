package SamplePractice;
import java.util.*;

public class LetterCombination_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(letterCombinations("56478")); // 9> digit >1
	}
	public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> digitLetters = new HashMap<>();
        digitLetters.put('2',"abc");
        digitLetters.put('3',"def");
        digitLetters.put('4',"ghi");
        digitLetters.put('5',"jkl");
        digitLetters.put('6',"mno");
        digitLetters.put('7',"pqrs");
        digitLetters.put('8',"tuv");
        digitLetters.put('9',"wxyz");
        int len = digits.length();
        if(len<=0){
            return new ArrayList<>();
        }
        int i = 0,sumLength = 1;
        while(i < len){
            sumLength *= digitLetters.get(digits.charAt(i)).length();
            i++;
        }
        List<String> result = new ArrayList<>(sumLength);
        // System.out.println(result.size());
        int rep, tempSum = sumLength, p,j=0,stop=0,keep = tempSum;
        String tempSign,temp2;
        while(j < digits.length() || stop < sumLength){
            keep =  tempSum / digitLetters.get(digits.charAt(j)).length();
            tempSign = digitLetters.get(digits.charAt(j));
            rep = keep-1;
            p = 0;
            while( p < tempSign.length()){
                if(result.size() < sumLength){
                    // System.out.print(tempSign.charAt(p));
                    result.add(String.valueOf(tempSign.charAt(p)));   
                } else {
                    // System.out.print(tempSign.charAt(p));
                    result.set(stop, (result.get(stop).concat(String.valueOf(tempSign.charAt(p)))));
                }
                ++stop;
                if(rep == 0){
                    ++p;
                    rep = keep-1;
                } else {
                    --rep;
                }
            }
            if(j < digits.length()-1 && stop == sumLength){
                    j++;
                    tempSum = keep;
                    stop = 0;
            }
            if ( j == digits.length()-1 && stop == sumLength){
                break;
            }
        }
        return result;
    }
}

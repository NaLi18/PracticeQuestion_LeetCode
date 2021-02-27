package SamplePractice;
import java.util.*;

public class Sherlock_Valid_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
		String s1 ="aaaaabc";
		System.out.println(isValid(s));
	}
	public static String isValid(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(hash.containsKey(c)){
                hash.replace(c, hash.get(c)+1);
            }else{
                hash.put(c, 1);
            }
        }
        int count =0, prev = hash.get(s.charAt(0));
        for(Character cc: hash.keySet()){
            if((hash.get(cc)-prev)!=0) {
            	if(hash.get(cc) == 1) {
            		count+=1;
            	}else {
                	count+= Math.abs(hash.get(cc)-prev);
                }
            }
        }
        if(count == s.length()-1 || count ==1){
            return "YES";
        }
        return "NO";
    }
}

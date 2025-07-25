import java.util.*;
public class Main8 {
	boolean solution(String sentence){
        // 한줄을 수정하시오)]]
        String str = "";
        for(int i = 0; i < sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c != ' ' && c != '.') str += c;
        }
        int len = str.length();
        for(int i = 0; i < len / 2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
        }
        return true;
    }
	public static void main(String[] args) {
	        Main8 sol = new Main8();
	        String sentence1 = "never odd or even.";
	        boolean ret1 = sol.solution(sentence1);
	        
	        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	        
	        
	        String sentence2 = "palindrome";
	        boolean ret2 = sol.solution(sentence2);
	        
	        System.out.println("solution 메소드의 반환 값은 " + ret2+ " 입니다.");
	    }
}

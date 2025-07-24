import java.util.*;
public class Main3_4 {
	public int solution(String[] words, String word) {
        int count = 0;
        for(String i : words) {
        	for(int j=0; j<i.length(); j++) {
        		if(i.charAt(j) != word.charAt(j))
        			count++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		Main3_4 sol = new Main3_4();
        String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
        String word = new String("CODE");
        int ret = sol.solution(words, word);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
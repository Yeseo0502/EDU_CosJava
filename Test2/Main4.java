import java.util.*;
public class Main2_4 {
	public String solution(String[] words) {
        String answer = "";
				int count=0;
				for(int i=0; i<words.length; i++){
						if(words[i].length()>=5){
							answer+=words[i];
							count+=1;
						}
				}
				if(count==0){
						answer="empty";
				}
        return answer;
    }
	public static void main(String[] args) {
		Main2_4 sol = new Main2_4();
        String[] words1 = {"my", "favorite", "color", "is", "violet"};
        String ret1 = sol.solution(words1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
        System.out.println("solution 메소드의 반환 값은 \"" + ret1 + "\" 입니다.");
        
        String[] words2 = {"yes", "i", "am"};
        String ret2 = sol.solution(words2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
        System.out.println("solution 메소드의 반환 값은 \"" + ret2 + "\" 입니다.");
    }
}
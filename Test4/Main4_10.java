import java.util.*;
public class Main4_10 {
	public int solution(int[] scores, int cutline) {
        int answer = 0;
				for(int i=0; i<scores.length; i++){
					if(scores[i]>= cutline){
						answer++;
					}
				}
        return answer;
    }
	public static void main(String[] args) {
		Main4_10 sol = new Main4_10();
        int[] scores = {80, 90, 55, 60, 59};
        int cutline = 60;
        int ret = sol.solution(scores, cutline);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
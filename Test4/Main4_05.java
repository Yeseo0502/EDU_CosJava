import java.util.*;
public class Main4_05 {
	public int solution(int[] calorie) {
        int minCal = calorie[0];
        int answer = 0;
        for(int i=0; i<calorie.length; i++) {
            if(calorie[i] > minCal)
                answer += calorie[i] - minCal;
            else
                minCal = calorie[i];
        }
        return answer;
    }
	public static void main(String[] args) {
		Main4_05 sol = new Main4_05();
        int[] calorie = {713, 665, 873, 500, 751};
        int ret = sol.solution(calorie);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
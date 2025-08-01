import java.util.Arrays;
public class Main4_01 {
	public int[] solution(String[] schedule) {
        int xCount = 0;
        for(int i=0; i<10; i++)
            if(schedule[i].charAt(0) == 'X')
                 xCount++;

        int[] answer = new int[xCount];
        for(int i=0, j=0; i<10; i++) {
            if(schedule[i].charAt(0) == 'X') {
                 answer[j++] = i+1;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		Main4_01 sol = new Main4_01();
        String[] schedule = {"O", "X", "X", "O", "O", "O", "X", "O", "X", "X"};
        int[] ret = sol.solution(schedule);

       // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.print("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.println(" 입니다.");
    }
}

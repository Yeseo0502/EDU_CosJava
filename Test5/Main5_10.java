
import java.util.*;
class Main5_10{
    public int solution(int[] timeTable, int n) {
        int answer = 0;
				int[] count = new int[n];
				for(int i=0; i<timeTable.length; i++)
					count[i%n] +=timeTable[i];
				answer=count[0];
				for(int k=0; k<count.length; k++){
					// System.out.println(count[k]);
					if(answer<count[k]){
						answer=count[k];
					}
				}
        return answer;
    }
    public static void main(String[] args) {
    	Main5_10 sol = new Main5_10();
    	int[] timeTable1 = {1, 5, 1, 9};
    	int n1 = 3;
    	int ret1 = sol.solution(timeTable1, n1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] timeTable2 = {4, 8, 2, 5, 4, 6, 7};
    	int n2 = 4;
    	int ret2 = sol.solution(timeTable2, n2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
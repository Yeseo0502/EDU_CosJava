import java.util.*;
public class Main13_2 {
	public int solution(int N, int M) {
        int answer = 0;
				for(int i=N; i<=M; i++){
					if(i%2==0){
						answer+=i*i;
					}
				}
        return answer;
    }
    public static void main(String[] args) {
    	Main13_2 sol = new Main13_2();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N, M);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }

}
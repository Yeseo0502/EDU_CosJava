public class Main5_01 {
	public int solution(int[][] ladders, int win) {
        int answer = 0;
        
        int[] player = { 1, 2, 3, 4, 5, 6 };
        
        for(int i = 0; i < ladders.length; i++) {
            int temp = player[ladders[i][0]-1];
            player[ladders[i][0]-1] = player[ladders[i][1]-1];
            player[ladders[i][1]-1] = temp;
        }
        
        answer = player[win-1];
        
        return answer;
    }
	public static void main(String[] args) {
		Main5_01 sol = new Main5_01();
        int[][] ladders = {{1, 2}, {3, 4}, {2, 3}, {4, 5}, {5, 6}};
        int win = 3;
        int ret = sol.solution(ladders, win);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
//사다리 게임의 승리자를 구해주세요!
public class Main5_01 {
	public int solution(int[][] ladders, int win) {
        int answer = 0;
        
        int[] player = { 1, 2, 3, 4, 5, 6 };
        
        for(int i = 0; i < ladders.length; i++) {
            int temp = player[ladders[i][0]-1];
            player[ladders[i][0]-1] = player[ladders[i][1]-1];
            player[ladders[i][1]-1] = temp;
        }
        
        answer = player[win-1];
        
        return answer;
    }
	public static void main(String[] args) {
		Main5_01 sol = new Main5_01();
        int[][] ladders = {{1, 2}, {3, 4}, {2, 3}, {4, 5}, {5, 6}};
        int win = 3;
        int ret = sol.solution(ladders, win);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
>>>>>>> ba25c7f922fdb6e79a50fc622f3d07888cb5e465

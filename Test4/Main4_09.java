import java.util.*;
public class Main4_09 {
	public int solution(int[][] height) {
        int count = 0;
				int[] dx= {-1,1,0,0}; //상하좌우
				int[] dy = {0,0,-1,1};
				//미워 내가 이걸 할 것 같아>>/?
				for(int i=0; i<4; i++){
					for(int j=0; j<4; j++){
							boolean is_danger = true;
						for(int k=0; k<4; k++){
							if(i+dx[k] >= 0 && i+dx[k] < 4 && j+dy[k] >= 0 && j+dy[k] < 4){
								if(height[i+dx[k]][j+dy[k]] <= height[i][j]){
									is_danger = false;
								}
							}
						}
						if(is_danger) count++;
					}
				}
        return count;
    }
	public static void main(String[] args) {
		Main4_09 sol = new Main4_09();
        int[][] height = {{3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9}};
        int ret = sol.solution(height);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
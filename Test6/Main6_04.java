import java.util.*;
class Main6_04{
    public int solution(String[][] cards) {
        int answer = 0;
				int count = 0;
				for(int i=0; i<cards.length; i++){
					for(int j=i+1; j<cards.length; j++){
						if(cards[i][0].equals(cards[j][0]))
							count++;
					}
				}
				for(int i=0; i<cards.length; i++){
						answer+=Integer.parseInt(cards[i][1]);
				}
				if(count==1){ //2장이 색이 같다면?
					answer=answer*2;
				}
				else if(count==2){
					//3장의 색이 모두 같다면?
					answer=answer*3;
				}
        return answer;
    }
    public static void main(String[] args) {
        Main6_04 sol = new Main6_04();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
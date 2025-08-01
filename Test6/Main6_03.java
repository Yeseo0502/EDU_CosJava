import java.util.*;
class Main6_03{
     public int[] solution(int[] people) {
        int[] answer = new int[4];
				for(int i=0; i<people.length; i++){
					if(people[i]<95){
						answer[0]+=1;
					}
					else if(people[i]>=95 && people[i]<100)
						answer[1]+=1;
					else if(people[i]>=100 && people[i]<105)
						answer[2]+=1;
					else if(people[i]>=105)
						answer[3]+=1;
				}
        return answer;
    }
    public static void main(String[] args) {
        Main6_03 sol = new Main6_03();
        int[] people = {97, 102, 93, 100, 107};
        int[] ret = sol.solution(people);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
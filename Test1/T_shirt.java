import java.util.*;
class T_shirt {
	public int[] solution(String[] shirtSize) {
		int[] answer = new int[6];
		for (int i = 0; i<shirtSize.length; i++){
				if(shirtSize[i] == "XS"){
					answer[0]+=1;
				}
				else if(shirtSize[i] == "S"){
					answer[1]+=1;
				}
				else if(shirtSize[i] == "M"){
					answer[2]+=1;
				}
				else if(shirtSize[i] == "L"){
					answer[3]+=1;
				}
				else if(shirtSize[i] == "XL"){
					answer[4]+=1;
				}
				else if(shirtSize[i] == "XXL"){
					answer[5]+=1;
				}
			}
        return answer;
    }
	public static void main(String[] args) {
		T_shirt sol = new T_shirt();
		String[] shirtSize = {"XS", "S", "L", "L", "XL", "S"};
		int[] ret = sol.solution(shirtSize);

		System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
	}
}
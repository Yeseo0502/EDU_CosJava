public class Main4_04 {
	public int solution(int[] classes, int m) {
        int answer = 0;
        for(int i=0; i<classes.length; i++) {
            answer += classes[i] / m;
            if (classes[i] - m != 0)
                answer++;
        }
        return answer;
    }
	public static void main(String[] args) {
		Main4_04 sol = new Main4_04();
        int[] classes = {80, 45, 33, 20};
        int m = 30;
        int ret = sol.solution(classes, m);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
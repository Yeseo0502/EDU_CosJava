public class Main3_10 {
	public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if (arr[i]%2 == 0 && arr[i]/2 == arr[j]) {
                    answer++;
                }
        return answer;
    }
	public static void main(String[] args) {
		Main3_10 sol = new Main3_10();
        int[] arr = {4, 8, 3, 6, 7};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

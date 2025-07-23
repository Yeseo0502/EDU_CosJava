public class Main7 {
	public int solution(int[] scores) {
        // 한줄을 수정하시오)]]
        int count = 0;
        for (int i = 0; i < scores.length; i++)
            if (650 <= scores[i] && scores[i] < 800) 
                count += 1;
        return count;
    }
	public static void main(String[] args) {
        Main7 sol = new Main7();
        int[] scores = {650, 722, 914, 558, 714, 803, 650, 679, 669, 800};
        int ret = sol.solution(scores);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
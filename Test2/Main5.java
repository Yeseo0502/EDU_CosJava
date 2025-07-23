public class Main5 {
	public int solution(int attack, int recovery, int hp) {
        int count = 0;
        while(true){
            count += 1;
            hp -= 30;
            if(hp <= 0)
                break;
            hp += 10;
        }
        return count;
    }
	public static void main(String[] args) {
		Main5 sol = new Main5();
        int attack = 30;
        int recovery = 10;
        int hp = 60;
        int ret = sol.solution(attack, recovery, hp);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
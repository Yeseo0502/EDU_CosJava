public class Main10 {
	public int solution(int[] purchase) {
        int total = 0;
        for(int i = 0; i < purchase.length; ++i){
            if(purchase[i] >= 1000000)
                total += 50000;
            else if(purchase[i] >= 600000)
                total += 30000;
            else if(purchase[i] >= 400000)
                total += 20000;
//            else 나머지가 되기 때문에 20만원 이하 값도 추가됨
            else if(purchase[i]>=200000)
                total += 10000;
        }
        return total;
    }
	public static void main(String[] args) {
		Main10 sol = new Main10();
        int[] purchase = {150000, 210000, 399990, 990000, 1000000};
        int ret = sol.solution(purchase);


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
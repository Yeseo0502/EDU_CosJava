public class Main3_5 {
	public int solution(int[] memberAge, String transportation) {
		int adultExpense = 0;
		int childExpense = 0;

		if(transportation.equals("Bus")) {
			adultExpense = 40000;
			childExpense = 15000;
		}
		else if(transportation.equals("Ship")) {
			adultExpense = 30000;
			childExpense = 13000;
		}
		else if(transportation.equals("Airplane")) {
			adultExpense = 70000;
			childExpense = 45000;
		}

		if(memberAge.length >= 10) {
			adultExpense = (int)(adultExpense-(adultExpense*0.1));
			childExpense = (int)(childExpense - (childExpense*0.2));
		}

		int totalExpenses = 0;
		for(int i = 0; i < memberAge.length; i++) {
			if(memberAge[i]>=20)
				totalExpenses += adultExpense;
			else
				totalExpenses += childExpense;
		}
	
		return totalExpenses;
	}
	public static void main(String[] args) {
		Main3_5 sol = new Main3_5();
		int[] memberAge1 = {13, 33, 45, 11, 20};
		String transportation1 = "Bus";
		int ret1 = sol.solution(memberAge1, transportation1);
        
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
		int[] memberAge2 = {25, 11, 27, 56, 7, 19, 52, 31, 77, 8};
		String transportation2 = "Ship";
		int ret2 = sol.solution(memberAge2, transportation2);
        
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}

public class Main7 {
	public int solution(int value, String unit) {
        int converted = 0;
        if (unit.equals("C"))
            converted = (int)(value * 1.8 + 32);
        if (unit.equals("F"))
            converted = (int)((value - 32) / 1.8);
        return converted;
    }
	public static void main(String[] args) {
		Main7 sol = new Main7();
        int value = 527;
        String unit = "C";
        int ret = sol.solution(value, unit);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
			value = 980;
			unit = "F";
			ret = sol.solution(value,unit);
			System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
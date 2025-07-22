import java.util.*;

public class Shopping {
	public int solution(int price, String grade) {
        int answer = price;
        double discount = 0;
        if(grade.equals("S")) {
        	discount=price*0.05;
        }
        else if (grade.equals("G")) {
        	discount =price*0.1;
        }
        else if(grade.equals("V")) {
        	discount =price*0.15;
        }
        answer-=discount;
        return (int)answer;
    }
	public static void main(String[] args) {
		shopping sol = new shopping();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

    }
}
class Main6_10{
    public int solution(int weight, int[] boxes) {
        int answer = 0;

        for(int i = 0; i < boxes.length; i++) 
        	if(!((weight-weight*0.1) <= boxes[i] && boxes[i]<=(weight+weight*0.1)))
        		answer++;
        	
        return answer;
    }
    public static void main(String[] args) {
        Main6_10 sol = new Main6_10();
        int weight = 600;
        int[] boxes = {653, 670, 533, 540, 660};
        int ret = sol.solution(weight, boxes);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
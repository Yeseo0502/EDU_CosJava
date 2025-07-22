import java.util.*;
public class len_turn {
	public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
            System.out.println(left+" "+right);
        }
        return arr;
    }
	public static void main(String[] args) {
		len_turn sol = new len_turn();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}
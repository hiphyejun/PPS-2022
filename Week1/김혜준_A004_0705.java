import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer ={-1}; //default
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            } 
        }

        if(count >= 1){
            answer = new int[count];
        } //배열사이즈 재할당

        for(int i = 0; i < arr.length; i++){
             if(arr[i] % divisor == 0){
                 answer[count-1] = arr[i];
                 count--;
             }
             if(count == 0){
                 break;
             }
        }

        Arrays.sort(answer);

        return answer;
    }
}
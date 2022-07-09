class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        // 10으로 나눈 나머지를 하면 1의자리, 그 다음꺼는 1/10된 값에서 다시 이짓을 반복. sum에 스택식으로 반복마다 값이 더해지고 그걸로 나눠지면 true 아니면 false 
    int num5 = x/10000;
    int num4 = (x%10000)/1000;
    int num3 = (x%1000)/100;
    int num2 = (x%100)/10;
    int num1 = x%10;
    int sum = (num5+num4+num3+num2+num1);
        
       if (x%sum!=0)
            answer = false;
        
        return answer;
    }
}
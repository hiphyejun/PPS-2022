/*
알고리즘 : 인풋 left right 는 수의 범위이다. 
큰 반복문은 이 범위를 할당해 주어야 한다. 
그리고 그 내부의 코드에서는 주어진 숫자의 각 자리수별로 나누는 작업이 필요하다. 
각 자리수로 자신을 나눈 나머지가 0이라면 배열에 push 한다. 
이후 생성된 배열을 리턴해주면 된다.
나누기를 진행할때 숫자가 0인 경우를 따로 다뤄줘야한다. 0으로 나누면 에러가 발생하기 때문이다. 
*/

class Solution {
    
    public List<Integer> selfDividingNumbers(int left, int right) {
        
       ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =left; i<=right; i++){
            if(isDivide(i)==true)
            arr.add(i);    
        }
        
   return arr;
}
    
    boolean isDivide(int x)
    {
        int num =x;//원래 숫자
        while(x!=0)
        {
            int mod =x%10;
            if(mod == 0||num % mod !=0 ) //이거 순서바뀌면 에러뜬다.
                return false;
            else
                x/=10;
            }
        return true;
    }

    
}
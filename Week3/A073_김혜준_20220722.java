/*
3의 배수는 Fizz 5의 배수는 Buzz 공통배수는 FizzBuzz 로 대신 출력되게 한다.
인풋으로 n이 들어가면 1부터 n까지 
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        
       for(int i=1; i<=n; i++)
       {
           if(i%3==0 && i%5==0)
               ans.add("FizzBuzz");
           else if(i%3==0)
               ans.add("Fizz");
           else if(i%5==0)
               ans.add("Buzz");
           else 
               ans.add(Integer.toString(i));
       }
        return ans;
    }
    
    
}

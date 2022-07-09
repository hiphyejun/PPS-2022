import java.util.*;
import java.lang.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP=0;
        int countY=0;
        
        for(int i=0; i<s.length(); i++)
        {
           if(s.charAt(i) == 'P' ||s.charAt(i) == 'p')
               countP++;
            if(s.charAt(i) == 'Y' ||s.charAt(i) == 'y')
               countY++;  
        }
        if(countP != countY)
            answer = false;
        
        return answer;
    }
}

//length() 는 java.lang.lang.String.length()에 속해있다. 
//자바에서 String 값을 char값으로 만들어 배열화 하는 기능이 charAt이다. 
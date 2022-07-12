/*
문제 : s 문자열을 입력받고 그것을 반으로 나눈다. 
왼쪽이 a 오른족이 b인데 그중 bowl {a,e,i,o,u,A,E,I,O,U}가 속해있는 숫자를 세고 양쪽의 수가 같으면 true 
틀리면 false 이다.

알고리즘 : 
1. s를 2/n 만큼 나누고 a b변수에 할당한다. 문자열을 자르는 메소드 : substring(시작,끝) 
2. 나눠진 문자열에서 bowl의 요소가 속해있는지 찾아보고 카운트한다(변수에 저장). 서칭 메소드 :charAt으로 바꿔서 요소를 하나씩 비교한다? => nO(n)
3. 둘의 수를 비교해서 같으면 true 틀리면 false를 입력한다. 
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        //a,b 할당.
        
        s=s.toLowerCase();//하나로 통일해서 확인하면 시간이 줄어든다.
        
        String a  = s.substring(0, s.length()/2);
        String b  = s.substring(s.length()/2,s.length());
    
        int countA=0;
        int countB=0;
        
        //bowl searching
        for(int i=0; i<a.length(); i++){
            char tempA = a.charAt(i);
            char tempB = b.charAt(i);
            if(tempA=='a'||tempA=='e'||tempA=='i'||tempA=='o'||tempA=='u')
                countA++;
            if(tempB=='a'||tempB=='e'||tempB=='i'||tempB=='o'||tempB=='u')
                countB++;      
        }//bowl 서칭 끝
    
    if(countA==countB)
        return true;
    else
        return false;
    }
}

/*
문제 : 개근상을 t/f로 구분해서 출력하는데 조건은 A가 2회보다 작아야하고 연속으로 3번 지각하면 안된다. 
알고리즘: charAt으로 문자 배열로 만들고 결석을 세는 변수, L을 세는 변수를 만들고 한 요소씩 검사하며 이 값을 할당한다.
L은 연속이 끊기면 0으로 초기화한다.
*/
class Solution {
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        boolean ans= true;
        int aps = 0;
        int late= 0;
        for(int i =0; i<s.length(); i++){
            if(arr[i]=='A')
            {
                aps ++;
                late=0;
            }
            else if (arr[i]=='L')
            {
                late++;
                if(late>=3)
                    ans =false;
            
            }
            else if(arr[i]=='P')
                late=0;
        }
        if( aps >=2)
            ans =false;
        return ans;
    }
}

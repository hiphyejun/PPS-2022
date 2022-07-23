/*
문자열 s 를 거꾸로읽어도 같은 문장이 되는 것을 palindrome이라고 한다. t/f 여부를 출력하라
알고리즘1 : 이거 리버스 sort 메소드 있음 비문자 빼고 소문자로 다 바꾸고 리버스해서 같으면 t 아니면 f 
isLetterOrNum으로 구분하고 char에 담고 다른 char에 reverse를 저장해서 비교한다.

알고리즘2 : 포인터를 앞 뒤로 설정하고 문자나 숫자가 아니면 건너뛰고 서로를 비교하는 방식 
better 
*/ 

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}

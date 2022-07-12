/*
문제 : s 와 t라는 문자가 있는데 #은 앞서 입력된 값을 지우는 것을 의미한다. 
따라서, 문자열을 #을 해석하여 적용한 값이 서로 같으면 true 틀리면 false 를 반환한다.

알고리즘 : char 타입의 배열로 변환해서 한 요소씩 #인지 아닌지 구분. toCharArray()
#이 나오면 이전에 넣은 값을 빼주는데 배열을 사용하기보다 stack구조가 적합하다.
stack의 push와 pop을 사용해 해석된 문자를 만들고 valueOf 메소드를 값으로 반환한다.
해석된 s와 t를 비교하는 메소드 : equals()

*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        if(newString(s).equals(newString(t)))
            return true;
            else 
                return false;
    }
    
    public String newString(String str){
        Stack<Character> ans = new Stack();
        for( char c: str.toCharArray()){
            if(c!='#')
                ans.push(c);
            else if(!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}

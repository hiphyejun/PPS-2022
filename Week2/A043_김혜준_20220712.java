/*
문제 : 소문자 str 배열의 값을 받아서 중복되는 가장 긴접두사를 찾아서 반환하라. 없다면 "" 를 반환한다.

알고리즘 : 
핵심 메소드 = Array의 indexOf = indexOf() 메서드는 배열에서 지정된 요소를 찾을 수 있는 첫 번째 인덱스를 반환하고 존재하지 않으면 -1을 반환합니다.

Working:
1)배열의 첫번째 값 전체를 prefix로 설정한다.
2)반복문으로 다음 배열의 값과 indexOf를 사용해 prefix가 존재하는지 찾아본다.
3)없다면 prefix의 마지막 문자를 제거하고 다시 비교하는 식으로 반복한다 (prefix가 없어지지 않는 동안) 있다면 0을 없다면 -1이 나온다
4)문자의 제거는 substring을 사용한다.
5)prefix의 길이가 0이면 ""를 반환하고, 배열의 전체 요소들과 비교가 끝났을때 남은 prefix가 최고길이임으로 그것을 리턴해준다.
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
       
        for(int index=1;index<strs.length;index++)//배열의 요소들의 반복문
        {
            if(prefix.isEmpty()){
                break; 
            }
            while(strs[index].indexOf(prefix) != 0)//prefix가 없다면
            {
                prefix=prefix.substring(0,prefix.length()-1); //prefix를 하나 잘라준다.
            }
        }
        
        return prefix;
    }
}


import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        //오름차순 정렬 default 
        int output=0;
        int point=0;
        for(int i=0;i<s.length;i++)
        {
            if(point==g.length)
                break;
            //배열의 끝을 넘어서면 반복문 break
            if(s[i]>=g[point])
            {
                output++;
                point++;
            }
        }
           
        return output;
    }
}
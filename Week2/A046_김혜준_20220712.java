/*
문제 : 백준1159번/첫번째 입력으로 사람수가 주어지고 이후에 사람이름이 소문자로 주어진다. 첫글자로 판단해서 5명 이상이라면 출전가능하다. 출전가능한 성을 공백없이 출력하고 출전이 불가능하다면 PREDAJA를 출력하라.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int[] count = new int[26];//알파벳
        
      for(int i=0; i<n; i++){        
        String str = sc.next();
        char first = str.charAt(0);    
        int num = first -'a' ;
        count[num]++;
        }
      int cnt=0;
      for (int i = 0; i < count.length; i++) {
            if(count[i]>=5){
              char fam = (char)(i+'a');
              System.out.print(fam);
              cnt++;   
            }
        }
      if(cnt==0)
              System.out.println("PREDAJA");
        
        
    }
}

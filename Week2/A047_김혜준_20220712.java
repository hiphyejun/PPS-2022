/*
문제 : 백준11721번 열개씩 끊어서 출력하기.
문자열이 주어지면 10개까지 끊어서 한줄에 출력하기.

알고리즘 : charAt을 사용해서 한 문자씩 출력하고 
반복문에 count 변수를 줘서 10에 도달할때마다 줄 바꿈을 같이 입력해주면 된다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
      for(int i=0; i<str.length(); i++){        
        char temp = str.charAt(i);
        if(i!=0 && i%10==0)//10단위일때마다
          System.out.println();
         
          System.out.print(temp);
      }
                
    }
}

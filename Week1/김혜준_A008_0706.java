import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> score = new ArrayList<Integer>();
    
    Scanner cs = new Scanner(System.in);
    int Case = cs.nextInt();
    
    for (int i=0; i < Case; i++){
      Scanner sc = new Scanner(System.in);
      Scanner sco = new Scanner(System.in);
      
      int studentNum = sc.nextInt();//학생수 입력받기.
      
      for ( int k= 0; k <studentNum; k++){
          score.add(sco.nextInt());
      }
      //학생수 만큼 점수 입력하고 score에 저장하기.
      
      int sum =0;
      for ( int a =0; a<studentNum; a++)
      {
        sum+=score.get(a);`
      }      
      //sum 값 할당.
      //System.out.println("sum: " + sum);      
      
      int avg = sum/studentNum;
      //System.out.println("avg: " + avg);
      
      int count =0;
      for ( int z =0; z <studentNum; z++)
        {
          if(score.get(z) > avg)
            count ++;
        }
      //System.out.println("count: " + count);
      float percent = ((float)count/(float)studentNum) * 100;
      System.out.println(String.format("%.3f", percent)+"%");
    }
    score.clear(); // reset score array
}
}
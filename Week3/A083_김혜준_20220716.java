import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        //BufferedReader의 .readLine()을 사용하면 값을 spacebar 로 구분하여 받을 수 없으므로, 런타임 에러가 발생한다.
        // ** BufferedReader를 사용하려면 StringTockenizer를 활용하면 된다.
        //따라서 Scanner의 .nextInt()를 사용함.
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
 
        //중복값을 받지 않기위해 HashSet을 사용함.
        HashSet<Integer> hashSet = new HashSet<Integer>();
 
        for (int i=0; i < cnt; i++){
            hashSet.add(sc.nextInt());  //입력 시 자동으로 중복값을 제거해줌.
        }
 
        //입력이 끝난 HashSet을 ArrayList로 담은 뒤, Collections.sort()를 이용하여 오름차순 정렬.
        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        Collections.sort(arrayList);
 
        //동작 속도 향상을 위해 StringBuilder 사용.
        StringBuilder sb = new StringBuilder();
        for (int i : arrayList){
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}

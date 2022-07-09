import java.util.*;

//nextLine(), split()

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums= sc.nextLine().split(" ");
        int sum=0;
        for(String s: nums) {
            int num = Integer.parseInt(s);
            sum += num*num;
        }
        int result = sum %10;
        System.out.println(result);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int open = sc.nextInt();
        
        if (num >5)
            System.out.println("Love is open door");
        else{
        for (int i=0; i<num-1; i++ )
            if (open ==1){
            System.out.println("0");
            open = 0;   
            }
            else{
            System.out.println("1");
            open = 1;   
            }
        }
    }

}
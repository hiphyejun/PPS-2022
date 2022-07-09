import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[8];
    int countasc =0; 
    int countdes =0;

    for(int i=0; i<arr.length; i++)
      {
        arr[i]= sc.nextInt();
      }
     
    //오름차순
    for (int i=0; i<arr.length-1; i++){
      if(arr[i] > arr[i+1])  
        break;
      else
        countasc++;
    }
    for (int i=0; i<arr.length-1; i++){
      if(arr[i] < arr[i+1])  
        break;
      else
        countdes++;
    }
    
    if(countasc==7)
    System.out.println("ascending");
    else if (countdes ==7)
    System.out.println("descending");
    else
    System.out.println("mixed"); 
    }
}
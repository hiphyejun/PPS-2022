import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		String[] word = new String[N];
		for(int i = 0; i< N; i++) {
			word[i] = sc.next();
		}
		
		Arrays.sort(word, new Comparator<String>() {		
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					int sum1 = 0; int sum2 = 0;
					for(int i = 0; i < s1.length(); i++) {
						if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
							sum1 += s1.charAt(i) - '0';
						if(s2.charAt(i) >= '0' && s2.charAt(i) <= '9')
							sum2 += s2.charAt(i) - '0';
					}
					
					if(sum1 == sum2) {
						return s1.compareTo(s2);
					}
					
					return sum1 - sum2;
				}else {
					return s1.length() - s2.length();
				}
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(word[i]);
		}
	}
}

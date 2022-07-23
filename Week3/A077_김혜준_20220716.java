import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TreeMap<Integer, String> map = new TreeMap<>();

		for (int i = 0; i < 8; i++) {
			map.put(Integer.parseInt(br.readLine()), (i + 1) + "");
		}

		int sum = 0;
		String str[] = new String[5];
		int w = 0;

		for (Integer key : map.descendingMap().keySet()) {
			sum += key;
			str[w] = map.get(key);

			if (w == 4)
				break;
			w++;
		}
		Arrays.sort(str);
		System.out.println(sum);
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]);
			if (i != str.length - 1)
				System.out.print(" ");
		}
	}
}

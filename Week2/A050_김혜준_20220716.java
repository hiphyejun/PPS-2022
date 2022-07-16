import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 암호문 리스트
        List<Character> encodedList = br.readLine().codePoints().mapToObj(c -> (char) c).collect(Collectors.toList());

        // 평문 리스트
        List<Character> decodedList = encodedList.stream().map(Main::findDecodedChar).collect(Collectors.toList());

        // 출력
        decodedList.forEach(System.out::print);
    }

    private static char findDecodedChar(Character c) {
        int tempVal = Integer.valueOf(c) - 3;
        if (tempVal < 'A') {
            tempVal = 'Z' + ((tempVal) - 'A' + 1);
        }
        return (char) tempVal;
    }
}

package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String inputScreen() throws IOException {
        System.out.println("문자열을 입력해 주세요 ex)2 + 3 * 4 / 2");
        return br.readLine();
    }
}

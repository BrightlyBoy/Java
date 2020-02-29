import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zad_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chars = new char[s.length()];
        int ai = 0;
        char ch;
        boolean f = false;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(') {
                ai += 1;
                chars[ai] = ch;
            }
            if (ch == '[') {
                ai += 1;
                chars[ai] = ch;
            }
            if (ch == ')') {
                if (chars[ai] == '(') {
                    ai -= 1;
                } else
                    f = true;
            }
            if (ch == ']') {
                if (chars[ai] == '[') {
                    ai -= 1;
                } else
                    f = true;
            }
        }
        if ((f) || (ai != 0)) {
            System.out.println("Неверно");
        } else System.out.println("Верно");
    }
}


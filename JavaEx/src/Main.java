import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] mas = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = reader.readLine();
        String strArr[] = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            mas[i] = Integer.parseInt(strArr[i]);
        }
        for (int i = 0; i < mas.length; i++) {
            list.add(i + 1);
            if (mas[i] != 0) {
                list.add(mas[i]);
            } else break;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.remove(i)+" ");
        }
    }
}

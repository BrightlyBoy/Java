import java.util.*;

public class zad_1 {
    public static void main(String[] args) {
        int[] mas = {6, 1, 1, 1, 2, 2, 2, 4, 2, 3, 5, 4, 4, 3, 5, 4, 17, 8, 20, 6, 4, 13};
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        Arrays.sort(mas);
        int k = mas[0];
        int c = 0;
        for (int i = 0; i < mas.length; i++) {
            if (k == mas[i]) c++;
            else {
                map.put(k, c);
                k = mas[i];
                c = 1;
                continue;
            }
        }
        map.put(k, c);
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .forEach(x -> System.out.println("Число: " + x.getKey() + "\tКоличетсво вхождений: " + x.getValue()));
    }
}

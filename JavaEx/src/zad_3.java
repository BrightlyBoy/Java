public class zad_3 {
    public static void main(String[] args) {
        int x=7;
        System.out.println(Integer.toBinaryString(x));//Показывает число в 2-й системе до обработки
        x |= x+1;
        System.out.println(Integer.toBinaryString(x));//Показывает число в 2-й системе после обработки
    }
}

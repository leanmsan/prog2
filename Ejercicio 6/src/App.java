import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String s1 = sc.nextLine();
        String s2 = s1;
        for (int i = s1.length() - 2; i >= 0; i--) {
            s2 = s2 + s2.charAt(i);
        }
        System.out.println(s2);
    }
}
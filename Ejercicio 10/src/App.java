import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una frase");
        String s1 = sc.nextLine();
        int slength = s1.length();
        if (slength % 2 == 0) {
            String m1 = s1.substring(0, slength / 2);
            String m2 = s1.substring(slength / 2);
            System.out.println(m1);
            System.out.println(m2);
        }
    }
}
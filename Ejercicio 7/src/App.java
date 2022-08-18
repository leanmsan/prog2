import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime algo");
        String s1 = sc.nextLine();
        System.out.println("Dime la palabra que quieres pasar a mayuscula");
        String s2 = sc.nextLine();
        System.out.println(s1.replaceFirst(s2, s2.toUpperCase()));
    }
}

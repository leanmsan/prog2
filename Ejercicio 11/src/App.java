import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String s1 = sc.nextLine();
        String s2 = s1.replace(" ", "-");
        System.out.println(s2);
    }
}
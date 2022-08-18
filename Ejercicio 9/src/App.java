import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime algo");
        String s1 = sc.nextLine();
        System.out.println("Dime la letra que quieras");
        char s2 = sc.next().charAt(0);
        int cont = 0;
        int p = s1.length();
        for (int i = 0; i < p; i++)  {
            if (s1.charAt(i) == s2) {
                cont++;
            }
        }
        System.out.println("La letra " + s2 + " se repite " + cont + " veces");
    }
}

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos palabras");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Las dos palabras son iguales");
        } else {
            System.out.println("Las dos palabras no son iguales");
        }
    }
}

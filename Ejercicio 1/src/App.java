import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Dime una frase o palabra");
        String s1 = sc.nextLine(); 
        s1 = s1.toLowerCase();
        if (s1.length() < 5){
            if (s1.startsWith("a")) {
                System.out.println("La palabra tiene menos de 5 caracteres y empieza con a");
            } else {
                System.out.println("La palabra tiene menos de 5 caracteres y no empieza con a");
            }
        }
        if (s1.length() <= 15 && s1.length() >= 5) {
            if (s1.startsWith("a")) {
                System.out.println("La palabra tiene entre 5 y 15 caracteres y empieza con a");
            } else {
                System.out.println("La palabra tiene entre 5 y 15 caracteres y no empieza con a");
            }
        }
        if (s1.length() > 15){
            if (s1.startsWith("a")) {
                System.out.println("La palabra tiene mas de 15 caracteres y empieza con a");
            } else {
                System.out.println("La palabra tiene mas de 15 caracteres y no empieza con a");
            }
        }
    }
}

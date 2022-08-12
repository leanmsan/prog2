import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String s1 = sc.nextLine();
        int espacio = s1.indexOf(" ");
        String s2 = s1.substring(espacio + 1, s1.length());
        String s3 = s1.substring(0, espacio);
        String s4 = "";
        for (int i = s2.length() - 1; i >= 0; i--) {
            s4 = s4 + s2.charAt(i);
        }
        String s5 = "";
        for (int i = s3.length() - 1; i >= 0; i--) {
            s5 = s5 + s3.charAt(i);
        }
        System.out.println(s4 + " " + s5);
    }
}
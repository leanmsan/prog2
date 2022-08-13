import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        String s1 = sc.nextLine();
        //para control
        /* System.out.println("Control");
        System.out.println(s1); */
        int p = s1.indexOf("/");
        String dia = s1.substring(0, p);
        String s2 = s1.substring(p + 1);
        System.out.println(s1);
        System.out.println("Dia: " + dia);
        int j = s1.indexOf('/');
        System.out.println(j);
        String mes = s1.substring(0, j);
        String año = s1.substring(j + 1);
        System.out.println(año);
    }
}
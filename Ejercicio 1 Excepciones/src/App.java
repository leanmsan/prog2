import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un numero");
            String s1 = sc.nextLine();
            int numero = Integer.parseInt(s1);
            int res = numero * 2;
            System.out.println("El resultado es: " + res);
        }

        catch(Exception ex) {
            System.out.println("La cadena ingresada no se pudo convertir a entero" );
            System.out.println(ex.toString());
        }

        finally {
            System.out.println("Yo siempre me ejecuto xd");
        }
    }
}

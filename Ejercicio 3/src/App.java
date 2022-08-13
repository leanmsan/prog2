import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime algo");
        String s1 = sc.nextLine();
        int opcion = 0;
        do {
            System.out.println("Seleccione una opcion: " + "\n" + "1- Pasarlo a mayusculas" + "\n" + "2- Pasarlo a minusculas" + "\n" + "3- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println(s1.toUpperCase());
                    break;
                case 2: 
                    System.out.println(s1.toLowerCase());
                    break;
            }
        } while (opcion != 3);
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listacuenta = new ArrayList<>();
        int numcuenta = 0;
        int ncuenta = 0;
        int opcion = 0;
        do {
            System.out.println("Seleccione una opcion" + "\n" + "1- Dar de alta una cuenta" + "\n"
                    + "2- Realizar un deposito" + "\n" + "3- Realizar una extraccion" + "\n" + "4- Realizar busqueda"
                    + "\n" + "5- Activar una cuenta" + "\n" + "6- Desactivar una cuenta" + "\n"
                    + "7- Ver datos de todas las cuentas" + "\n" + "8- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Dni del titular");
                    int dnititular = sc.nextInt();
                    System.out.println("Ingrese el saldo");
                    Double saldo = sc.nextDouble();
                    String fechaApertura = LocalDate.now().toString();
                    boolean activa = true;
                    Cuenta cuenta = new Cuenta(numcuenta, dnititular, fechaApertura, activa, saldo);
                    listacuenta.add(cuenta.DatosCuenta());
                    numcuenta++;
                    break;
                case 2:
                    System.out.println("Ingrese el numero de cuenta");
                    ncuenta = sc.nextInt();

                    break;
                case 3:
                    System.out.println("Ingrese el numero de cuenta");
                    ncuenta = sc.nextInt();

                    break;
                case 4:
                    System.out.println("Ingrese el numero de documento del usuario");
                    int numDni = sc.nextInt();

                    break;
                case 5:
                    System.out.println("Ingrese el numero de cuenta");
                    ncuenta = sc.nextInt();

                    break;
                case 6:
                    System.out.println("Ingrese el numero de cuenta");
                    ncuenta = sc.nextInt();

                    break;
                case 7:
                    for (int i = 0; i < listacuenta.size(); i++) {
                        System.out.println(listacuenta.get(i));
                    }
                    break;
            }
        } while (opcion != 8);
        System.out.println("Gracias");
    }
}

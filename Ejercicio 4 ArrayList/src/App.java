import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> listacuenta = new ArrayList<>();
        int opcion = 0;
        do {
            System.out.println("Seleccione una opcion" + "\n" + "1- Dar de alta una cuenta" + "\n" + "2- Realizar un deposito" + "\n" + "3- Realizar una extraccion" + "\n" + "4- Realizar busqueda" + "\n" + "5- Activar una cuenta" + "\n" + "6- Desactivar una cuenta" + "\n" + "7- Ver datos de una cuenta" + "\n" + "8- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: 
                    System.out.println("Ingrese el Dni del titular");
                    int dni = sc.nextInt();
                    System.out.println("Ingrese el saldo"); 
                    double saldo = sc.nextDouble();

                    break;
                case 2: 
                    System.out.println("Ingrese el numero de cuenta");
                    int numcuenta = sc.nextInt();
                    if (numcuenta < listacuenta.size()) {
                        System.out.println("Ingrese el monto a depositar");
                        double montoDeposito = sc.nextDouble();
                        
                    } else {
                        System.out.println("La cuenta no existe");
                    }
                    break;
                case 3: 
                numcuenta = sc.nextInt();
                if (numcuenta < listacuenta.size()) {
                    System.out.println("Ingrese el monto a extraer");
                    double montoExtraccion = sc.nextDouble();
                    
                } else {
                    System.out.println("La cuenta no existe");
                }
                    break;
                case 4:
                    System.out.println("Ingrese el numero de documento del usuario");
                    int numDni = sc.nextInt();

                    break;
                case 5: 

                    break;
                case 6: 
                
                    break;
                case 7: 

                    break;
            }
        } while (opcion != 8);
        System.out.println("Gracias");
    }
}-

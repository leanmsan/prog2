import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

public class Ejercicio4ArrayList {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        int opcion = 0;
        int numCuenta = 0;

        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el documento del titular");
                    int dnititular = sc.nextInt();
                    String fechaApertura = LocalDate.now().toString();
                    boolean activa = true;
                    System.out.println("Ingrese el saldo de la cuenta");
                    Double saldo = sc.nextDouble();
                    Cuenta nuevaCuenta = new Cuenta(numCuenta, dnititular, fechaApertura, activa, saldo);
                    cuentas.add(nuevaCuenta);
                    numCuenta++;
                    break;
                case 2: 
                    deposito(cuentas, sc);
                    break;
                case 3: 
                    extraccion(cuentas, sc); 
                    break;
                case 4:
                    busquedaDni(cuentas, sc);
                    break;
                case 5:
                    activarcuenta(cuentas, sc);
                    break;
                case 6:
                    desactivarcuenta(cuentas, sc);
                    break;
                case 7:
                    for (Cuenta c: cuentas) {
                        System.out.println(c.DatosCuenta());
                    }
                    break;
            }
        }while (opcion != 8);

        System.out.println("Gracias");
    }

    private static void menu() {
        System.out.println("\n" + "Seleccione una opcion");
        System.out.println("1- Dar de alta una cuenta");
        System.out.println("2- Realizar un deposito");
        System.out.println("3- Realizar una extraccion");
        System.out.println("4- Buscar una cuenta");
        System.out.println("5- Activar una cuenta");
        System.out.println("6- Desactivar una cuenta");
        System.out.println("7- Ver todas las cuentas");
        System.out.println("8- Salir");
    }
    
    private static void busquedaDni(ArrayList<Cuenta> cuentas, Scanner sc) {
        System.out.println("Ingrese el numero de documento");
        int dniBusqueda = sc.nextInt();
        boolean encontrado = false;
        for (Cuenta c: cuentas) {
            if (c.getDniTitular() == dniBusqueda) {
                System.out.println(c.DatosCuenta());
                encontrado = true; 
                break;
            }
        }
        if (encontrado = false) {
            System.out.println("No hay una cuenta con ese dni");
        }
    }

    private static void deposito(ArrayList<Cuenta> cuentas, Scanner sc) {
        System.out.println("Ingrese un numero de cuenta");
        int nroCuentaIngresado = sc.nextInt();
        for (Cuenta c: cuentas) {
            if(c.getNroCuenta() == nroCuentaIngresado) {
                if(c.isEsActiva()) {
                    System.out.println("Ingrese el monto a depositar");
                    double montodeposito = sc.nextDouble();
                    c.Deposito(montodeposito);
                } else {
                    System.out.println("La cuenta no se encuentra activa");
                }
            } else {
                System.out.println("No hay una cuenta con ese dni");
            }
        }
    }

    private static void extraccion(ArrayList<Cuenta> cuentas, Scanner sc) {
        System.out.println("Ingrese un numero de cuenta");
        int nroCuentaIngresado = sc.nextInt();
        for (Cuenta c: cuentas) {
            if (c.getNroCuenta() == nroCuentaIngresado) {
                if (c.isEsActiva()) {
                    System.out.println("Ingrese el monto a extraer");
                    double montoextraccion = sc.nextDouble();
                    if (c.getSaldo() > montoextraccion) {
                        c.Extraccion(montoextraccion);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                } else {
                    System.out.println("La cuenta no se encuentra activa");
                }
            } else {
                System.out.println("No hay una cuenta con ese dni");
            }
        }
    }

    private static void activarcuenta(ArrayList<Cuenta> cuentas, Scanner sc) {
        System.out.println("Ingrese un numero de cuenta");
        int nroCuentaIngresado = sc.nextInt();
        for (Cuenta c: cuentas) {
            if (c.getNroCuenta() == nroCuentaIngresado) {
                if (c.isEsActiva()) {
                    System.out.println("La cuenta ya se encuentra activa");
                } else {
                    c.activarCuenta();
                    System.out.println("La cuenta fue activada correctamente");
                    break;
                }
            } else {
                System.out.println("No hay una cuenta con ese dni");
            }
        }
    }

    private static void desactivarcuenta(ArrayList<Cuenta> cuentas, Scanner sc) {
        System.out.println("Ingrese un numero de cuenta");
        int nroCuentaIngresado = sc.nextInt();
        for (Cuenta c: cuentas) {
            if (c.getNroCuenta() == nroCuentaIngresado) {
                if (c.isEsActiva()) {
                    c.desactivarCuenta();
                    System.out.println("La cuenta fue desactivada exitosamente");
                    break;
                } else {
                    System.out.println("La ya se encuentra desactivada");
                }
            } else {
                System.out.println("No hay una cuenta con ese dni");
            }
        }
    }
}
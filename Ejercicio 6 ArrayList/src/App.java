import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Persona> listado_infractores = new ArrayList<>();

        int opcion = 0;
        do {
            menu();
            switch (opcion) {
                case 1:
                    registrar_infractor(sc, listado_infractores);
                    break;
                case 2:
                    registrar_multa(sc, listado_infractores);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (opcion != 7);
    }

    private static void menu() {
        System.out.println("\n" + "Seleccione una opcion");
        System.out.println("1- Registrar infractor");
        System.out.println("2- Registrar multa");
        System.out.println("3- Ver todos los infractores");
        System.out.println("4- Ver multas de infractores");
        System.out.println("5- Ver multas por tipo");
        System.out.println("6- Ver multas por año");
        System.out.println("7- Salir");
    }

    private static void registrar_infractor(Scanner sc, ArrayList<Persona> listado_infractores) {
        int dni_infractor = 0;
        if (listado_infractores.isEmpty()) {
            System.out.println("Ingrese el Dni del infractor");
            dni_infractor = sc.nextInt();
            System.out.println("Ingrese el apellido del infractor");
            String apellido_infractor = sc.next();
            System.out.println("Ingrese el nombre del infractor");
            String nombre_infractor = sc.next();
            Persona nuevo_infractor = new Persona(dni_infractor, apellido_infractor, nombre_infractor, new ArrayList<>());
            listado_infractores.add(nuevo_infractor);
        } else {
            System.out.println("Ingrese el Dni del infractor");
            dni_infractor = sc.nextInt();
            for (int i = 0; i < listado_infractores.size(); i++) {
                if (listado_infractores.get(i).getDni() == dni_infractor) {
                    System.out.println("Error. El infractor ya esta registrado");
                } else {
                    System.out.println("Ingrese el apellido del infractor");
                    String apellido_infractor = sc.next();
                    System.out.println("Ingrese el nombre del infractor");
                    String nombre_infractor = sc.next();
                    Persona nuevo_infractor = new Persona(dni_infractor, apellido_infractor, nombre_infractor, new ArrayList<>());
                    listado_infractores.add(nuevo_infractor);
                }
            }
        }
    }

    private static void registrar_multa(Scanner sc, ArrayList<Persona> listado_infractores) {
        if (listado_infractores.isEmpty()) {
            System.out.println("Error. No hay infractores registrados");
        } else {
            
        }
    }

    
}

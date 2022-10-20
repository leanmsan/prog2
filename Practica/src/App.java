import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Lista infractores
        ArrayList<Infractor> lista_infractores = new ArrayList<>();

        // menu
        int opcion = 0;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    altaInfractor(sc, lista_infractores);
                    break;
                case 2:
                    registroMulta(sc, lista_infractores);
                    break;
                case 3:
                    for (Infractor li : lista_infractores) {
                        System.out.println(li.toString());
                    }
                    break;
                case 4:
                    multasinfractores(sc, lista_infractores);   
                    break;
                case 5:
                    multastipo(sc, lista_infractores);  
                    break;
                case 6:
                    multaAños(sc, lista_infractores);
                    break;
            }
        } while (opcion != 7);
    }

    // menu
    private static void menu() {
        System.out.println("Ingrese una opcion");
        System.out.println("1- Registrar Infractor");
        System.out.println("2- Registrar Multa");
        System.out.println("3- Ver todos los infractores");
        System.out.println("4- Ver el historial de un infractor");
        System.out.println("5- Ver las multas por tipo");
        System.out.println("6- Ver las muntas por año");
        System.out.println("7- Salir");
    }

    // metodo de menu que registra un infractor
    private static void altaInfractor(Scanner sc, ArrayList<Infractor> lista_infractores) {
        System.out.println("Ingrese el Dni del infractor");
        int dni = sc.nextInt();
        boolean repetido = false;
        for (Infractor li : lista_infractores) {
            if (li.getDni() == dni) {
                repetido = true;
                System.out.println("Error. El infractor ya esta registrado");
                break;
            }
        }

        if (!repetido) {
            System.out.println("Ingrese el Apellido del infractor");
            String apellido = sc.next();
            if (apellido.isBlank()) {
                System.out.println("Error. Debe ingresar un apellido");
            } else {
                System.out.println("Ingrese el nombre del infractor");
                String nombre = sc.next();
                if (nombre.isBlank()) {
                    System.out.println("Error. Debe ingresar un nombre");
                } else {
                    Infractor infractor = new Infractor(dni, apellido, nombre, new ArrayList<>());
                    lista_infractores.add(infractor);
                }
            }
        }
    }

    // metodo de menu que registra una infraccion
    private static void registroMulta(Scanner sc, ArrayList<Infractor> lista_infractores) {
        if (lista_infractores.isEmpty()) {
            System.out.println("Error. No hay ningun infractor registrado");
            altaInfractor(sc, lista_infractores);   
        } else {
            System.out.println("Ingrese el Dni del infractor");
            int dni = sc.nextInt();
            for (int i = 0; i < lista_infractores.size(); i++) {
                if (lista_infractores.get(i).getDni() == dni) {
                    System.out.println("Seleccione el tipo de multa" + "\n" + "1- Leve" + "\n" + "2- Grave" + "\n" + "3- Muy Grave");
                    int op = sc.nextInt();
                    String tipoMulta = "";
                    switch (op) {
                        case 1:
                            tipoMulta = "Leve";
                            break;
                        case 2:
                            tipoMulta = "Grave";
                            break;
                        case 3:
                            tipoMulta = "Muy Grave";
                            break;
                    }
                    System.out.println("Ingrese la descripcion de la infraccion");
                    String desc = sc.next();
                    System.out.println("Ingrese el año de la multa");
                    int año = sc.nextInt();
                    System.out.println("Ingrese el monto de la multa");
                    double monto = sc.nextDouble();
                    Multa nuevamulta = new Multa(tipoMulta, desc, año, monto);
                    lista_infractores.get(i).getInfracciones().add(nuevamulta);
                } else {
                    System.out.println("Error. No hay ningun infractor con ese Dni");
                }
            }
        }
    }

    //metodo de menu para ver las multas de un infractor
    private static void multasinfractores(Scanner sc, ArrayList<Infractor> lista_infractores) {
        if (lista_infractores.isEmpty()) {
            System.out.println("Error. No hay ningun infractor dado de alta");
        } else {
            System.out.println("Ingrese el Dni del infractor");
            int dni = sc.nextInt();
            for (Infractor infractor : lista_infractores) {
                if (infractor.getDni() == dni) {
                    for (Multa multas : infractor.getInfracciones()) {
                        System.out.println(multas.toString());
                    }
                } else {
                    System.out.println("Error. No hay ningun infractor con ese Dni");
                }
            }
        }
    }
    
    //metodo de menu para ver las multas por año
    private static void multaAños(Scanner sc, ArrayList<Infractor> lista_infractores) {
        int cant = 0;
        System.out.println("Ingrese un año");
        int año = sc.nextInt();
        for (Infractor infractor : lista_infractores) {
            cant = cant + infractor.cantmultas();
        }
        System.out.println(cant);
    }

    //metodo de menu para ver las multas por tipo
    private static void multastipo(Scanner sc, ArrayList<Infractor> lista_infractores) {
        System.out.println("Ingrese el tipo de multa a buscar" + "\n" + "1- Leve" + "\n" + "2- Grave" + "\n" + "3- Muy Grave");
        int op = sc.nextInt();
        String tipomulta = "";
        switch (op) {
            case 1:
                tipomulta = "Leve";
                break;
            case 2:
                tipomulta = "Grave";
                break;
            case 3:
                tipomulta = "Muy Grave";
                break;
        }
        int totalmultas = 0;
        for (Infractor infractor : lista_infractores) {
            totalmultas = infractor.multasTipo(tipomulta);
        }
        System.out.println(totalmultas);
    }
}

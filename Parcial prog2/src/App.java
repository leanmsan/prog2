import java.util.Scanner;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Lista de marcas
        ArrayList<Marca> listaMarcas = new ArrayList<>();

        // menu
        int opcion = 0;
        do {
            menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    altaMarca(sc, listaMarcas);
                    break;
                case 2:
                    altaAuto(sc, listaMarcas);
                    break;
                case 3:
                    for (Marca marca : listaMarcas) {
                        System.out.println(marca.DatosMarca());
                    }
                    break;
                case 4:
                    listarAutos(sc, listaMarcas);
                    break;
                case 5:
                    ventaAuto(sc, listaMarcas);
                    break;
                case 6:
                    buscarAuto(sc, listaMarcas);
                    break;
            }

        } while (opcion != 7);

    }

    // menu
    private static void menu() {
        System.out.println("Seleccione una opcion");
        System.out.println("1- Dar de alta una marca");
        System.out.println("2- Dar de alta un auto");
        System.out.println("3- Listar marcas");
        System.out.println("4- Listar autos de una marca");
        System.out.println("5- Vender un auto");
        System.out.println("6- Buscar un auto");
        System.out.println("7- Salir");
    }

    // metodo de menu para dar de alta una marca
    private static void altaMarca(Scanner sc, ArrayList<Marca> listaMarcas) {
        if (listaMarcas.isEmpty()) {
            System.out.println("Ingrese el codigo de marca");
            int codmarca = sc.nextInt();
            System.out.println("Ingrese el nombre de la marca");
            String nombre = sc.next();
            if (nombre.isBlank()) {
                System.out.println("Error. La marca debe tener un nombre" + "\n" + "Por favor vuelva a intentar");
                altaMarca(sc, listaMarcas);
            } else {
                Marca nuevamarca = new Marca(codmarca, nombre, new ArrayList<>());
                listaMarcas.add(nuevamarca);
            }
        }
    }

    // metodo de menu para dar de alta un auto
    private static void altaAuto(Scanner sc, ArrayList<Marca> listaMarcas) {
        if (listaMarcas.isEmpty()) {
            System.out.println("Error. No hay ninguna marca dada de alta" + "\n" + "Por favor, ingrese una marca");
            altaMarca(sc, listaMarcas);
        } else {
            System.out.println("Ingrese un codigo de marca");
            int codmarca = sc.nextInt();
            for (int i = 0; i < listaMarcas.size(); i++) {
                if (listaMarcas.get(i).getCodMarca() == codmarca) {
                    System.out.println("Ingrese el codigo del auto");
                    int codauto = sc.nextInt();
                    for (int j = 0; i < listaMarcas.get(i).getAutos().size(); j++) {
                        if (listaMarcas.get(i).getAutos().get(j).getCodAuto() == codauto) {
                            System.out.println(
                                    "Error. Ya existe un auto con ese codigo" + "\n" + "Por favor vuelva a intentar");
                            altaAuto(sc, listaMarcas);
                        } else {
                            System.out.println("Ingrese la patente del auto");
                            String patente = sc.next();
                            if (patente.isBlank()) {
                                System.out.println(
                                        "Error. El auto debe tener una patente" + "\n" + "Por favor vuelva a intentar");
                                altaAuto(sc, listaMarcas);
                            } else {
                                System.out.println("Ingrese el modelo del auto");
                                String modelo = sc.next();
                                if (modelo.isBlank()) {
                                    System.out.println("Error. El auto debe tener un modelo");
                                } else {
                                    System.out.println("Ingrese el año del auto");
                                    int añoauto = sc.nextInt();
                                    System.out.println("Ingrese el kilometraje del auto");
                                    int km = sc.nextInt();
                                    System.out.println("Ingrese el precio del auto");
                                    double precio = sc.nextDouble();
                                    boolean estado = true;
                                    Auto nuevAuto = new Auto(codauto, patente, modelo, añoauto, km, precio, estado);
                                    listaMarcas.get(i).getAutos().add(nuevAuto);
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Error. No hay ninguna marca con ese codigo");
                }
            }
        }
    }

    // metodo de menu para listar los autos de una marca
    private static void listarAutos(Scanner sc, ArrayList<Marca> listaMarcas) {
        if (listaMarcas.isEmpty()) {
            System.out.println("Error. No hay n");
        }
    }

    // metodo de menu para vender un auto
    private static void ventaAuto(Scanner sc, ArrayList<Marca> listaMarcas) {
        System.out.println("Ingrese un codigo de marca");
        int codmarca = sc.nextInt();
        for (int i = 0; i < listaMarcas.size(); i++) {
            if (listaMarcas.get(i).getCodMarca() == codmarca) {
                System.out.println("Ingrese un codigo de auto");
                int codauto = sc.nextInt();
                for (int j = 0; j < listaMarcas.get(i).getAutos().size(); j++) {
                    if (listaMarcas.get(i).getAutos().get(j).getCodAuto() == codauto) {
                        System.out.println("Ingrese la cantidad de cuotas (Entre 1 y 12)");
                        int cuotas = sc.nextInt();
                        if (cuotas <= 12 && cuotas >= 1) {
                            System.out.println("El precio de la cuota asciende a: " + listaMarcas.get(i).getAutos().get(j).venta(cuotas));
                        } else {
                            System.out.println("Error. La venta solo puede realizarse entre 1 y 12 cuotas");
                        }
                    }
                }
            } else {
                System.out.println("Error. No hay ninguna marca con ese codigo");
            }
        }
    }

    //metodo de menu para buscar un auto
    private static void buscarAuto(Scanner sc, ArrayList<Marca> listaMarcas) {
        System.out.println("Ingrese el modelo que desea buscar");
        String modelo = sc.next();
        for (int i = 0; i < listaMarcas.size(); i++) {
            listaMarcas.get(i).filtroAutos(modelo);
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // lista de rubros
        ArrayList<Rubro> rubros = new ArrayList<>();

        // menu
        int opcion = 0;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    altaRubro(sc, rubros);
                    break;
                case 2:
                    altaArt(sc, rubros);
                    break;
                case 3:
                    cambiar_precio(sc, rubros); 
                    break;
                case 4:
                    for (Rubro lr : rubros) { // lr = lista rubros
                        System.out.println(lr.DatosRubro());
                    }
                    break;
                case 5:
                    lista_art(sc, rubros);
                    break;
                case 6:
                    compra_art(sc, rubros); // falta probar 
                    break;
                case 7:
                    venta_art(sc, rubros); // falta probar
                    break;
                case 8:
                    buscar_art(sc, rubros);
                    break;
                case 9:
                    art_rubros(sc, rubros);
                    break;
            }
        } while (opcion != 10);

        System.out.println("Gracias");
    }

    // metodos del menu
    // art = articulo
    private static void menu() {
        System.out.println("\n" + "Seleccione una opcion");
        System.out.println("1- Dar de alta un rubro"); // listo
        System.out.println("2- Dar de alta un articulo"); // listo
        System.out.println("3- Modificar precio de un articulo"); // listo
        System.out.println("4- Ver lista de rubros"); // dentro del metodo main (listo)
        System.out.println("5- Ver los articulos de un rubro"); // listo
        System.out.println("6- Comprar un articulo"); // listo
        System.out.println("7- Vender un articulo"); // listo
        System.out.println("8- Buscar un articulo"); // para corregir
        System.out.println("9- Ver lista de articulos por rubro"); // listo
        System.out.println("10- Salir");
    }

    // metodo de menu que da de alta un rubro
    private static void altaRubro(Scanner sc, ArrayList<Rubro> rubros) {
        System.out.println("\n" + "Ingrese el codigo de rubro");
        int cod_rubro = sc.nextInt();
        if (rubros.isEmpty()) {
            if (cod_rubro <= 9 && cod_rubro >= 1) {
                System.out.println("\n" + "Ingrese la descripcion del rubro");
                String desc_rubro = sc.next();
                if (desc_rubro.length() < 20) {
                    Rubro nuevo_rubro = new Rubro(cod_rubro, desc_rubro, new ArrayList<>());
                    nuevo_rubro.setDescripcion(desc_rubro);
                    rubros.add(nuevo_rubro);
                    System.out.println("\n" + "Se agrego el rubro con exito");
                } else {
                    System.out.println("\n" + "La descripcion no puede contener mas de 20 caracteres");
                }
            } else {
                System.out.println("\n" + "Error. Vuelva a intentar por favor");
            }
        } else {
            for (int i = 0; i < rubros.size(); i++) {
                if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                    System.out.println("\n" + "El codigo de rubro ya existe");
                } else {
                    System.out.println("\n" + "Ingrese la descripcion del rubro");
                    String desc_rubro = sc.next();
                    if (desc_rubro.length() < 20) {
                        Rubro nuevo_rubro = new Rubro(cod_rubro, desc_rubro, new ArrayList<>());
                        nuevo_rubro.setDescripcion(desc_rubro);
                        rubros.add(nuevo_rubro);
                    } else {
                        System.out.println("\n" + "La descripcion no puede tener mas de 20 caracteres");
                    }
                }
            }
        }
    }

    // metodo de menu que da de alta un art de un rubro
    private static void altaArt(Scanner sc, ArrayList<Rubro> rubros) {
        int cod_barras = 0;
        if (rubros.isEmpty()) {
            System.out.println("\n" + "Error. No hay ningun rubro dado de alta");
        } else {
            System.out.println("\n" + "Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt();
            if (cod_rubro <= 9 && cod_rubro >= 1) {
                for (int i = 0; i < rubros.size(); i++) {
                    if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                        if (rubros.get(i).getArticulos().isEmpty()) {
                            System.out.println("\n" + "Ingrese el codigo de barras");
                            cod_barras = sc.nextInt();
                            System.out.println("\n" + "Ingrese el nombre del articulo");
                            String art_nombre = sc.next();
                            if (art_nombre.isBlank()) {
                                System.out.println("\n" + "Error. El articulo debe tener un nombre");
                            } else {
                                if (art_nombre.length() < 30) {
                                    System.out.println("\n" + "Ingrese el precio del articulo");
                                    double art_precio = sc.nextDouble();
                                    if (art_precio <= 999.99 && art_precio > 0) {
                                        System.out.println("\n" + "Ingrese el stock del articulo");
                                        int art_stock = sc.nextInt();
                                        if (art_stock <= 1000 && art_stock >= 0) {
                                            Articulo nuevo_art = new Articulo(cod_barras, art_nombre, art_precio,
                                                    art_stock);
                                            rubros.get(i).getArticulos().add(nuevo_art);
                                        } else {
                                            System.out.println(
                                                    "\n" + "El stock del articulo debe ser mayo a 0 y no mayor a 1000");
                                        }
                                    } else {
                                        System.out.println(
                                                "\n" + "El precio del articulo debe ser mayor a 0 y menor de 1000");
                                    }
                                } else {
                                    System.out.println("\n"
                                            + "Error. El nombre del articulo no debe contener mas de 30 caracteres");
                                }
                            }
                        } else {
                            for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                                if (rubros.get(i).getArticulos().get(j).getCod_Barras() == cod_barras) {
                                    System.out.println("\n" + "Error. El codigo de barra ya existe");
                                } else {
                                    System.out.println("\n" + "Ingrese el codigo de barras");
                                    cod_barras = sc.nextInt();
                                    if (cod_barras >= 1000) {
                                        System.out.println("\n" + "Ingrese el nombre del articulo");
                                        String art_nombre = sc.next();
                                        if (art_nombre.isBlank()) {
                                            System.out.println("\n" + "Error. El articulo debe tener un nombre");
                                        } else {
                                            if (art_nombre.length() < 30) {
                                                System.out.println("\n" + "Ingrese el precio del articulo");
                                                double art_precio = sc.nextDouble();
                                                if (art_precio <= 999.99 && art_precio > 0) {
                                                    System.out.println("\n" + "Ingrese el stock del articulo");
                                                    int art_stock = sc.nextInt();
                                                    if (art_stock <= 1000 && art_stock >= 0) {
                                                        Articulo nuevo_art = new Articulo(cod_barras, art_nombre, art_precio, art_stock);
                                                        rubros.get(i).getArticulos().add(nuevo_art);
                                                    } else {
                                                        System.out.println("\n"
                                                                + "El stock del articulo debe ser mayo a 0 y no mayor a 1000");
                                                    }
                                                } else {
                                                    System.out.println("\n"
                                                            + "Error. El precio del articulo debe ser mayor a 0 y menor de 1000");
                                                }
                                            } else {
                                                System.out.println("\n"
                                                        + "Error. El nombre del articulo no debe contener mas de 30 caracteres");
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    } else {
                        System.out.println("\n" + "Error. El codigo de rubro no existe");
                    }
                }
            } else {
                System.out.println("\n" + "Error. Vuelva a intentar por favor");
            }
        }
    } // son 89 lineas lpm xdd

    // metodo de menu para cambiar el precio de un art
    private static void cambiar_precio (Scanner sc, ArrayList<Rubro> rubros) {
        int cod_barras = 0;
        if (rubros.isEmpty()) {
            System.out.println("\n" + "Error. No hay ningun rubro dado de alta");
        } else {
            System.out.println("\n" + "Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt(); 
            if (cod_rubro <= 9 && cod_rubro >=1) {
                for (int i = 0; i < rubros.size(); i++) {
                    if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                        System.out.println("\n" + "Ingrese el codigo de barra del articulo");
                        for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                            if (rubros.get(i).getArticulos().get(j).getCod_Barras() == cod_barras) {
                                System.out.println("\n" + "Ingrese el nuevo precio");
                                double nuevo_precio = sc.nextDouble();
                                if (nuevo_precio <= 999.99 && nuevo_precio > 0) {
                                    rubros.get(i).getArticulos().get(j).setPrecio(nuevo_precio);
                                } else {
                                    System.out.println("\n" + "Error. El precio del articulo debe ser mayor a 0 y menor de 1000");
                                }
                            } else {
                                System.out.println("\n" + "Error. El codigo de barra no existe");
                            }
                        }
                    } else {
                        System.out.println("\n" + "Error. El codigo de rubro no existe");
                    }
                }
            } else {
                System.out.println("\n" + "Error. Vuelva a intentar por favor");
            }
        }
    }

    // metodo de menu que muestra la lista de art de un rubro
    private static void lista_art(Scanner sc, ArrayList<Rubro> rubros) {
        if (rubros.isEmpty()) {
            System.out.println("\n" + "Error. No hay ningun rubro dado de alta");
        } else {
            System.out.println("\n" + "Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt();
            for (int i = 0; i < rubros.size(); i++) {
                if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                    System.out.println("\n" + "Lista del rubro " + rubros.get(i).getDescripcion() + ":");
                    for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                        System.out.println(rubros.get(i).getArticulos().get(j).datosArticulos());
                    }
                } else {
                    System.out.println("\n" + "Error. El codigo de rubro no existe");
                }
            }
        }
    }

    // metodo de menu que realiza la compra de art
    private static void compra_art(Scanner sc, ArrayList<Rubro> rubros) { 
        int cod_barras = 0;
        if (rubros.isEmpty()) {
            System.out.println("\n" + "Error. No hay ningun rubro dado de alta");
        } else {
            System.out.println("\n" + "Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt();
            for (int i = 0; i < rubros.size(); i++) {
                if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                    System.out.println("\n" + "Ingrese el codigo de barra del articulo");
                    cod_barras = sc.nextInt();
                    for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                        if (rubros.get(i).getArticulos().get(j).getCod_Barras() == cod_barras) {
                            System.out.println("\n" + "Ingrese la cantidad a comprar");
                            int cant = sc.nextInt();
                            int aux = cant + rubros.get(i).getArticulos().get(j).getStock_Actual();
                            if (aux >= 1000) {
                                int res = aux - 1000;
                                System.out.println("\n" + "Error. La cantidad de stock no puede superar los mil articulos");
                                System.out.println("\n" + "Sobran " + res + " articulos");
                            } else {
                                rubros.get(i).getArticulos().get(j).Compra(cant);
                            }
                        } else {
                            System.out.println("\n" + "Error. El codigo de barra no existe");
                        }
                    }
                } else {
                    System.out.println("\n" + "Error. El codigo de rubro no existe");
                }
            }
        }
    }

    // metodo de menu que realiza la venta de un art 
    private static void venta_art(Scanner sc, ArrayList<Rubro> rubros) {
        int cod_barras = 0;
        if (rubros.isEmpty()) {
            System.out.println("\n" + "Error. No hay ningun rubro dado de alta");
        } else {
            System.out.println("\n" + "Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt();
            for (int i = 0; i < rubros.size(); i++) {
                if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                    System.out.println("\n" + "Ingrese el codigo de barra del articulo");
                    cod_barras = sc.nextInt();
                    for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                        if (rubros.get(i).getArticulos().get(j).getCod_Barras() == cod_barras) {
                            System.out.println("\n" + "Ingrese la cantidad a vender");
                            int cant = sc.nextInt();
                            double aux = rubros.get(i).getArticulos().get(j).Venta(cant);
                            if (aux == -1) {
                                System.out.println("\n" + "Error. No hay stock suficiente");
                            } else {
                                System.out.println("\n" + "La venta se realizo exitosamente");
                                System.out.println("\n" + "El monto asciende a: " + aux);
                            }
                        } else {
                            System.out.println("\n" + "Error. El codigo de barra no existe");
                        }
                    }
                } else {
                    System.out.println("\n" + "Error. El codigo de rubro no existe");
                }
            }
        }
    }

    // metodo de menu que realiza la busqueda de un art
    private static void buscar_art(Scanner sc, ArrayList<Rubro> rubros) {
        System.out.println("\n" + "Ingrese el articulo que desee buscar");
        String art = sc.next();
        for (int i = 0; i < rubros.size(); i++) {
            System.out.println(rubros.get(i).filtro(art));
        }
    }

    // metodo de menu que muestra todos los articulos discriminado por rubro
    private static void art_rubros(Scanner sc, ArrayList<Rubro> rubros) {
        if (rubros.isEmpty()) {
            System.out.println("Error. No hay ningun rubro dado de alta");
        } else {
            for (int i = 0; i < rubros.size(); i++) {
                System.out.println("_________________________________________________________________________________");
                System.out.println("                     LISTADO DE ARTICULOS POR RUBRO                              ");
                System.out.println("_________________________________________________________________________________");
                System.out.println("Rubro: " + rubros.get(i).getDescripcion() + "        Codigo de Rubro: " + rubros.get(i).getCod_Rubro());
                System.out.println("_________________________________________________________________________________");
                System.out.println("Codigo de Barra           Articulo Nombre           Precio        Stock Actual   ");
                for (int j = 0; j < rubros.get(i).getArticulos().size(); j++) {
                    System.out.println("     " + rubros.get(i).getArticulos().get(j).getCod_Barras() + "            " + rubros.get(i).getArticulos().get(j).getNombre() + "      $" + rubros.get(i).getArticulos().get(j).getPrecio() + "            " + rubros.get(i).getArticulos().get(j).getStock_Actual());
                }
                System.out.println("_________________________________________________________________________________");
                
            }
        }
    }
}
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // lista de rubros
<<<<<<< HEAD
        ArrayList<Rubro> Rubros = new ArrayList<>();
=======
        ArrayList<Rubro> rubros = new ArrayList<>();
>>>>>>> 19ffc32391ec50e5a39d2b2e06e1158583c5b1b5

        // menu
        int opcion = 0;
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
<<<<<<< HEAD
                    altaRubro(sc, Rubros);
=======
                    altaRubro(sc, rubros);
>>>>>>> 19ffc32391ec50e5a39d2b2e06e1158583c5b1b5
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
<<<<<<< HEAD
                    for (Rubro lista_rubros : Rubros) {
                        System.out.println(lista_rubros.DatosRubro());
=======
                    for (Rubro lr : rubros) {
                        System.out.println(lr.DatosRubro());
>>>>>>> 19ffc32391ec50e5a39d2b2e06e1158583c5b1b5
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } while (opcion != 10);

        System.out.println("Gracias");
    }

    private static void menu() {
        System.out.println("\n" + "Seleccione una opcion");
        System.out.println("1- Dar de alta un rubro");
        System.out.println("2- Dar de alta un articulo");
        System.out.println("3- Modificar precio de un articulo");
        System.out.println("4- Ver lista de rubros");
        System.out.println("5- Ver los articulos de un rubro");
        System.out.println("6- Comprar un articulo");
        System.out.println("7- Vender un articulo");
        System.out.println("8- Buscar un articulo");
        System.out.println("9- Ver lista de articulos por rubro");
        System.out.println("10- Salir");
    }

<<<<<<< HEAD
    private static void altaRubro(Scanner sc, ArrayList<Rubro> Rubros) {
        try {
            System.out.println("Ingrese el codigo de rubro");
            int cod_rubro = sc.nextInt();
            if ()

=======
    private static void altaRubro(Scanner sc, ArrayList<Rubro> rubros) {
        System.out.println("Ingrese el codigo de rubro");
        int cod_rubro = sc.nextInt();
        if (rubros.size() == 0) {
            if (cod_rubro <= 9 && cod_rubro >= 1) {
                System.out.println("Ingrese la descripcion del rubro");
                String desc_rubro = sc.next();
                if (desc_rubro.length() < 20) {
                    Rubro nuevo_rubro = new Rubro(cod_rubro, desc_rubro, new ArrayList<>());
                    nuevo_rubro.setDescripcion(desc_rubro);
                    rubros.add(nuevo_rubro);
                    System.out.println("Se agrego el rubro con exito");
                } else {
                    System.out.println("La descripcion no puede tener mas de 20 caracteres");
                }
            } else if (rubros.isEmpty() = false) {
                for (int i = 0; i < rubros.size(); i++) {
                    if (rubros.get(i).getCod_Rubro() == cod_rubro) {
                        System.out.println("El codigo de rubro ya existe");
                    } else {
                        System.out.println("Ingrese la descripcion del rubro");
                        String desc_rubro = sc.next();
                        if (desc_rubro.length() < 20) {
                            Rubro nuevo_rubro = new Rubro(cod_rubro, desc_rubro, new ArrayList<>());
                            nuevo_rubro.setDescripcion(desc_rubro);
                            rubros.add(nuevo_rubro);
                        } else {
                            System.out.println("La descripcion no puede tener mas de 20 caracteres");
                        }
                    }
                }
            }
>>>>>>> 19ffc32391ec50e5a39d2b2e06e1158583c5b1b5
        }
    }
}

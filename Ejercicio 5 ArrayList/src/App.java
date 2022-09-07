import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //lista de rubros
        ArrayList<Rubro> nuevoRubro = new ArrayList<>();

        //menu
        int opcion = 0;
        do {
            menu();
            switch (opcion) {
                case 1:
                    altaRubro(sc, nuevoRubro);
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4:
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

    private static void altaRubro(Scanner sc, ArrayList<Rubro> nuevoRubro) {

    }
}

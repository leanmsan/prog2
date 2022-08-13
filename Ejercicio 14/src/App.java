import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        String s1 = sc.nextLine();
        // para control
        /*
         * System.out.println("Control");
         * System.out.println(s1);
         */
        int p = s1.indexOf("/");
        String dia = s1.substring(0, p);
        String s2 = s1.substring(p + 1);
        System.out.println(s1);
        //System.out.println("Dia: " + dia);
        int j = s1.indexOf('/');
        String mes = s2.substring(0, j);
        String año = s2.substring(j + 1);
        //System.out.println("Mes: " + mes);
        //System.out.println("Año" + año);
        String fecha = "";
        switch (mes) {
            case "1": 
                
                break;
            case "2": 
                
                break;
            case "3":

                break;
            case "4": 

                break;
            case "5": 

                break;
            case "6": 

                break;
            case "7": 

                break;
            case "8": 

                break;
            case "9":

                break;
            case "10": 

                break;
            case "11":

                break;
            case "12": 

                break;
        }
        System.out.println(fecha);
    }
}
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Ingrese una palabra o frase"));
        String s1 = sc.nextLine();
        String s2 = s1.toLowerCase();
        int cont = 0;
        for (char caracter: s2.toCharArray()) {
            switch (caracter) {
                case 'a': 
                    cont++;
                    break;
                case 'e': 
                    cont++;
                    break;
                case 'i':
                    cont++;
                    break;
                case 'o':
                    cont++;
                    break;
                case 'u': 
                    cont++;
                    break;
            }
        }
        System.out.println(cont);
    }
}

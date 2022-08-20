import java.io.FileReader;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileReader fr;
            fr = new FileReader("C:\\archivo.txt");
            System.out.println("El archivo existe");
        }

        catch (Exception ex) {
            System.out.println("El archivo no existe");
            System.out.println(ex.toString());
        }

        finally {
            System.out.println("Yo me ejecuto");
        }
    }
}

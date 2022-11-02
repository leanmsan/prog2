import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        //abrir tabla ascii antes de empezar https://elcodigoascii.com.ar/
        System.out.write(75);
        System.out.flush();
        
        //
        String boquita = "Boca el mas grande";

        byte[] boquitabytes = boquita.getBytes();

        try {
            System.out.write(boquitabytes);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            System.out.close();
        }


        //
        try {
            
            int[] data = new int[10];
            
            for(int i = 0; i < data.length; i++) {
                data[i] = System.in.read();
            }

            for (int i = 0; i < data.length; i++){
                System.out.write(data[i]);
            }
            System.out.flush();

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}

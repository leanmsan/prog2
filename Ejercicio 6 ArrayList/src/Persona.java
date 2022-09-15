import java.util.ArrayList;

public class Persona {
    private int Dni;
    private String Apellido, Nombre;
    private ArrayList<Multa> Historial_Multas;

    public Persona(int dni, String apellido, String nombre, ArrayList<Multa> historial_Multas) {
        this.Dni = dni;
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Historial_Multas = historial_Multas;
    }

    public Persona() {
        Dni = 0;
        Apellido = "";
        Nombre = "";
        Historial_Multas = new ArrayList<>();
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Multa> getHistorial_Multas() {
        return Historial_Multas;
    }

    public void setHistorial_Multas(ArrayList<Multa> historial_Multas) {
        Historial_Multas = historial_Multas;
    }
}

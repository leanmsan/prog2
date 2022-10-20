import java.util.ArrayList;

public class Infractor {
    private int Dni;
    private String Apellido, Nombre;
    private ArrayList<Multa> Infracciones;

    public Infractor(int dni, String apellido, String nombre, ArrayList<Multa> infracciones) {
        this.Dni = dni;
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Infracciones = infracciones;
    }

    public Infractor() {
        Dni = 0;
        Apellido = "";
        Nombre = "";
        Infracciones = new ArrayList<>();
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

    public ArrayList<Multa> getInfracciones() {
        return Infracciones;
    }

    public void setInfracciones(ArrayList<Multa> infracciones) {
        Infracciones = infracciones;
    }

    public double MontoTotal(ArrayList<Multa> Infracciones) {
        double MontoTotal = 0;
        for (Multa multas : Infracciones) {
            MontoTotal = MontoTotal + multas.getMonto();
        }
        return MontoTotal;
    }

    public String toString() {
        return "Dni Infractor" + Dni + ". Apellido: " + Apellido + ". Nombre: " + Nombre;
    }

    public int cantmultas() {
        int cant = 0;
        cant = cant + Infracciones.size();
        return cant;
    }

    public int multasTipo(String tipoMulta) {
        int cant = 0;
        for (Multa multa : Infracciones) {
            if (multa.getTipo().equalsIgnoreCase(tipoMulta)) {
                cant++;
            }
        }
        return cant;
    }
}

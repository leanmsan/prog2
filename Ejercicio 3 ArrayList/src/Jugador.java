public class Jugador {
    private String Apellido, Nombre; 
    private int Edad, Goles;

    public Jugador(String apellido, String nombre, int edad, int goles) {
        Apellido = apellido;
        Nombre = nombre;
        Edad = edad;
        Goles = goles;
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
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public int getGoles() {
        return Goles;
    }
    public void setGoles(int goles) {
        Goles = goles;
    }
}
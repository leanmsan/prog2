public class Multa {
    private String Tipo, Descripcion;
    private int Año;
    private double Monto;

    public Multa(String tipo, String descripcion, int año, double monto) {
        Tipo = tipo;
        Descripcion = descripcion;
        Año = año;
        Monto = monto;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    @Override
    public String toString() {
        return "Multa [Tipo=" + Tipo + ", Descripcion=" + Descripcion + ", Año=" + Año + ", Monto=" + Monto + "]";
    }
    
}

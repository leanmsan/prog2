public class Multa {
    private String Tipo, Descripcion;
    private int Año;
    private double Monto;
    
    public Multa(String tipo, String descripcion, int año, double monto) {
        this.Tipo = tipo;
        this.Descripcion = descripcion;
        this.Año = año;
        this.Monto = monto;
    }

    public Multa() {
        Tipo = "";
        Descripcion = "";
        Año = 0;
        Monto = 0;
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

    public String tipoMulta(int grado) {
        switch (grado) {
            case 1:
                Tipo = "Leve";
                break;
            case 2:
                Tipo = "Grave";
                break;
            case 3: 
                Tipo = "Muy Grave";
                break;
        }
        return Tipo;
    }

    public String DatosMulta() {
        return "Tipo: " + Tipo + ". Descripcion: " + Descripcion + "Año: " + Año + ". Monto: " + Monto;
    }
}

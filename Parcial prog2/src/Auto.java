public class Auto {
    private int CodAuto;
    private String Patente, Modelo;
    private int Año, Km;
    private double Precio;
    private boolean Estado;

    public Auto(int codAuto, String patente, String modelo, int año, int km, double precio, boolean estado) {
        this.CodAuto = codAuto;
        this.Patente = patente;
        this.Modelo = modelo;
        this.Año = año;
        this.Km = km;
        this.Precio = precio;
        this.Estado = estado;
    }

    public Auto() {
        CodAuto = 0;
        Patente = "";
        Modelo = "";
        Año = 0;
        Km = 0;
        Precio = 0;
        Estado = false;
    }

    public int getCodAuto() {
        return CodAuto;
    }

    public void setCodAuto(int codAuto) {
        CodAuto = codAuto;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public int getKm() {
        return Km;
    }

    public void setKm(int km) {
        Km = km;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    public String DatosAuto() {
        return "CodAuto: " + CodAuto + ". Patente: " + Patente + ". Modelo: " + Modelo + ". Año: " + Año + ". Kilometraje: "
                + Km + ". Precio: " + Precio + ". Estado: " + Estado;
    }

    public double venta(int cantcuotas) {
        double preciocuota = 0;

        if (cantcuotas == 1) {
            preciocuota = Precio;
        }

        if (cantcuotas <= 3 && cantcuotas > 1 ) {
            preciocuota = Precio * 1.12;
            Precio = Precio * 1.12;
        }

        if (cantcuotas <= 6 && cantcuotas >= 4) {
            preciocuota = Precio * 1.17;
            Precio = Precio * 1.17;
        }

        if (cantcuotas <= 12 && cantcuotas >= 7) {
            preciocuota = Precio * 1.30;
            Precio = Precio * 1.30;
        }
        
        Estado = true;

        return preciocuota;
    }

}

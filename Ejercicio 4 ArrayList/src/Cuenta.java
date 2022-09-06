public class Cuenta {
    private int NroCuenta, DniTitular;
    private String FechaApertura;
    private boolean esActiva;
    private double Saldo;

    public Cuenta(int nroCuenta, int dniTitular, String fechaApertura, boolean esActiva, double saldo) {
        NroCuenta = nroCuenta;
        DniTitular = dniTitular;
        FechaApertura = fechaApertura;
        this.esActiva = esActiva;
        Saldo = saldo;
    }

    public Cuenta() {
        NroCuenta = 0;
        DniTitular = 0;
        FechaApertura = "";
        this.esActiva = false;
        Saldo = 0;
    }

    public int getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        NroCuenta = nroCuenta;
    }

    public int getDniTitular() {
        return DniTitular;
    }

    public void setDniTitular(int dniTitular) {
        DniTitular = dniTitular;
    }

    public String getFechaApertura() {
        return FechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        FechaApertura = fechaApertura;
    }

    public boolean isEsActiva() {
        return esActiva;
    }

    public void setEsActiva(boolean esActiva) {
        this.esActiva = esActiva;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public String DatosCuenta() {
        if (esActiva = true) {
            return "NroCuenta: " + NroCuenta + ". DniTitular: " + DniTitular + ". FechaApertura: " + FechaApertura
                    + ". Saldo: " + Saldo + " La cuenta se encuentra Activa";
        } else {
            return "NroCuenta: " + NroCuenta + ". DniTitular: " + DniTitular + ". FechaApertura: " + FechaApertura
                    + ". Saldo: " + Saldo + " La cuenta no se encuentra Activa";
        }
    }

    public boolean Deposito(double MontoDeposito) {
        boolean depositoExitoso = false;
        if (esActiva = true) {
            Saldo = Saldo + MontoDeposito;
            depositoExitoso = true;
        } else {
            depositoExitoso = false;
        }
        return depositoExitoso;
    }

    public boolean Extraccion(double MontoExtraccion) {
        boolean extraccionExitosa = false;
        if (esActiva = true) {
            if ((Saldo - MontoExtraccion) >= 0) {
                Saldo = Saldo - MontoExtraccion;
                extraccionExitosa = true;
            } else {
                extraccionExitosa = false;
            }
        } else {
            extraccionExitosa = false;
        }
        return extraccionExitosa;
    }

    public void activarCuenta() {
        esActiva = true;
    }

    public void desactivarCuenta() {
        esActiva = false;
    }
}

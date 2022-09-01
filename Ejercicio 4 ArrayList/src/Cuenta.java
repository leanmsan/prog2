public class Cuenta {
    private int NroCuenta, DniTitular;
    private String FechaApertura;
    private boolean Activa;
    private double Saldo;

    public Cuenta(int nroCuenta, int dniTitular, String fechaApertura, boolean activa, double saldo) {
        NroCuenta = nroCuenta;
        DniTitular = dniTitular;
        FechaApertura = fechaApertura;
        Activa = activa;
        Saldo = saldo;
    }

    public Cuenta() {
        NroCuenta = 0;
        DniTitular = 0;
        FechaApertura = "";
        Activa = false;
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

    public boolean isActiva() {
        return Activa;
    }

    public void setActiva(boolean activa) {
        Activa = activa;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public boolean Deposito(double montoDeposito, boolean esActiva) {
        boolean depositoExitoso;
        if (esActiva = true) {
            Saldo = Saldo + montoDeposito;
            depositoExitoso = true;
        } else {
            depositoExitoso = false;
        }
        return depositoExitoso;
    }

    public boolean Extraccion(double montoExtraccion, boolean esActiva) {
        boolean extraccionExitoso;
        if (esActiva = true) {
            if (montoExtraccion >= Saldo) {
                Saldo = Saldo - montoExtraccion;
                extraccionExitoso = true;
            } else {
                extraccionExitoso = false;
            }
        } else {
            extraccionExitoso = false;
        }
        return extraccionExitoso;
    }

    public String DatosCuenta() {
        if (Activa = true) {
            return "NroCuenta: " + NroCuenta + "\n" + "DniTitular: " + DniTitular + "\n" + "FechaApertura: " + FechaApertura
                + "\n" + "Saldo: " + Saldo + "\n" + "La cuenta se encuentra activa";
        } else {
            return "NroCuenta: " + NroCuenta + "\n" + "DniTitular: " + DniTitular + "\n" + "FechaApertura: " + FechaApertura
                + "\n" + "Saldo: " + Saldo + "\n" + "La cuenta no se encuentra activa";
        }
    }

    public void activarCuenta() {
        Activa = true;
    }

    public void desactivarCuenta() {
        Activa = false;
    }
}
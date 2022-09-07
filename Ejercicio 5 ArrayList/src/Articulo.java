public class Articulo {
    private int Cod_Barras;
    private String Nombre;
    private double Precio;
    private int Stock_Actual;

    public Articulo(int cod_Barras, String nombre, double precio, int stock_Actual) {
        Cod_Barras = cod_Barras;
        Nombre = nombre;
        Precio = precio;
        Stock_Actual = stock_Actual;
    }

    public Articulo() {
        Cod_Barras = 0;
        Nombre = "";
        Precio = 0;
        Stock_Actual = 0;
    }

    public int getCod_Barras() {
        return Cod_Barras;
    }

    public void setCod_Barras(int cod_Barras) {
        Cod_Barras = cod_Barras;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getStock_Actual() {
        return Stock_Actual;
    }

    public void setStock_Actual(int stock_Actual) {
        Stock_Actual = stock_Actual;
    }

    public String datosArticulos() {
        return "Codigo de Barras: " + Cod_Barras + ". Nombre: " + Nombre + ". Precio: " + Precio + ". Stock Actual: "
                + Stock_Actual;
    }

    public int Compra(int cantidad) {
        Stock_Actual = Stock_Actual + cantidad;
        return Stock_Actual;
    }    

    public double Venta(int cantidad) {
        if (Stock_Actual >= cantidad) {
            double precio_final = Precio * cantidad;
            Stock_Actual = Stock_Actual - cantidad;
            return precio_final;
        } else {
            return -1;
        }
    }
}

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
}

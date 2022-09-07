import java.util.ArrayList;

public class Rubro {
    private int Cod_Rubro;
    private String Descripcion ;
    private ArrayList Articulos;

    public Rubro(int cod_Rubro, String descripcion, ArrayList articulos) {
        Cod_Rubro = cod_Rubro;
        Descripcion = descripcion;
        Articulos = articulos;
    }

    public Rubro() {
        Cod_Rubro = 0;
        Descripcion = "";
    }

    public int getCod_Rubro() {
        return Cod_Rubro;
    }

    public void setCod_Rubro(int cod_Rubro) {
        Cod_Rubro = cod_Rubro;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String DatosRubro() {
        return "Codigo de Rubro:" + Cod_Rubro + ". Descripcion: " + Descripcion;
    }

    public void altaArticulo() {
        ArrayList<Articulo> articulos = new ArrayList<>();
    }
}

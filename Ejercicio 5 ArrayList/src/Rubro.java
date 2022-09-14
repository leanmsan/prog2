import java.util.ArrayList;

public class Rubro {
    private int Cod_Rubro;
    private String Descripcion ;
    private ArrayList<Articulo> Articulos;
    
    public Rubro(int cod_Rubro, String descripcion, ArrayList<Articulo> Articulos) {
        this.Cod_Rubro = cod_Rubro;
        this.Descripcion = descripcion;
        this.Articulos = Articulos;
    }

    public Rubro() {
        Cod_Rubro = 0;
        Descripcion = "";
        Articulos = new ArrayList<>();
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
    
    public ArrayList<Articulo> getArticulos() {
        return Articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        Articulos = articulos;
    }

    public String DatosRubro() {
        return "Codigo de Rubro: " + Cod_Rubro + ". Descripcion: " + Descripcion;
    }
    
    public ArrayList<String> filtro(String nombre_articulo) {
        ArrayList<String> filtro = new ArrayList<>();
        for (int i = 0; i < Articulos.size(); i++) {
            String res = Articulos.get(i).getNombre();
            if (res.startsWith(nombre_articulo)) {
                filtro.add(Articulos.get(i).datosArticulos());
            }
        }
        return filtro;
    }
}

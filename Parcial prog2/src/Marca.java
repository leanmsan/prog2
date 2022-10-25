import java.util.ArrayList;

public class Marca {
    private int CodMarca;
    private String Nombre;
    private ArrayList<Auto> Autos;

    public Marca(int codMarca, String nombre, ArrayList<Auto> autos) {
        this.CodMarca = codMarca;
        this.Nombre = nombre;
        this.Autos = autos;
    }

    public Marca() {
        CodMarca = 0;
        Nombre = "";
        Autos = new ArrayList<>();
    }

    public int getCodMarca() {
        return CodMarca;
    }

    public void setCodMarca(int codMarca) {
        CodMarca = codMarca;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public ArrayList<Auto> getAutos() {
        return Autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        Autos = autos;
    }

    public String DatosMarca() {
        return "Codigo de Marca: " + CodMarca + ". Nombre: " + Nombre;
    }

    public ArrayList<String> filtroAutos(modelo) {
        ArrayList<String> filtro = new ArrayList<>();
        for (int i = 0; i < Autos.size(); i++) {
            String res = Autos.get(i).getModelo();
            if (res.startsWith(modelo)) {
                filtro.add(Autos.get(i).DatosAuto());
            }
        }
    }
}

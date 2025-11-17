import java.util.ArrayList;

public class Linea {

    private String color;
    private ArrayList<Persona> personas;
    private ArrayList<Cabina> cabinas;
    private int cantidadCabinas;

    public Linea(String color, ArrayList<Persona> personas, ArrayList<Cabina> cabinas, int cantidadCabinas) {
        this.color = color;
        this.personas = (personas != null) ? personas : new ArrayList<>();
        this.cabinas = (cabinas != null) ? cabinas : new ArrayList<>();
        this.cantidadCabinas = cantidadCabinas;
    }
}

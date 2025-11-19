import java.util.ArrayList;

public class Linea {
    private int nroLinea;
    private String color;
    private ArrayList<Cabina> cabinas;

    public Linea(int nroLinea, String color) {
        this.nroLinea = nroLinea;
        this.color = color;
        this.cabinas = new ArrayList<>();
    }

    // Add a Cabina to the Linea
    public void agregarCabina(Cabina cabina) {
        cabinas.add(cabina);
    }

    // Get all the Cabinas in this Linea
    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }

    @Override
    public String toString() {
        return "Linea " + nroLinea + " (" + color + ")";
    }
}

import java.util.ArrayList;

public class MiTeleferico {
    private ArrayList<Cabina> cabinas;

    public MiTeleferico() {
        cabinas = new ArrayList<>();
    }

    public void agregarCabina(Cabina c) {
        cabinas.add(c);
    }

    // ✔ Punto 2: revisar que TODAS las cabinas cumplen los protocolos
    public boolean todasCumplenProtocolos() {
        boolean todoOK = true;

        for (Cabina c : cabinas) {
            if (!c.cumpleProtocolos()) {
                System.out.println("❌ La cabina " + c.getNroCabina() + " NO cumple los protocolos.");
                todoOK = false;
            }
        }

        if (todoOK) {
            System.out.println("✅ Todas las cabinas cumplen los protocolos.");
        }

        return todoOK;
    }
}

import java.util.ArrayList;

public class Cabina {
    private int nroCabina;
    private ArrayList<PersonasAbordo> personas;

    public Cabina(int nroCabina, ArrayList<PersonasAbordo> personas) {
        this.nroCabina = nroCabina;
        this.personas = (personas != null) ? personas : new ArrayList<>();
    }

    public void agregarPrimeraPersona(PersonasAbordo p) {
        personas.add(0, p);
    }

    public boolean agregarPersona(PersonasAbordo p) {
        if (personas.size() >= 10) {
            System.out.println("No se puede agregar más personas: límite de 10 alcanzado.");
            return false;
        }

        double pesoActual = 0;
        for (PersonasAbordo persona : personas) {
            pesoActual += persona.getPeso();
        }

        if (pesoActual + p.getPeso() > 850) {
            System.out.println("No se puede agregar a la persona: se supera el límite de 850 kg.");
            return false;
        }

        personas.add(p);
        return true;
    }

    // Verificación de protocolos para UNA cabina
    public boolean cumpleProtocolos() {
        if (personas.size() > 10) return false;

        double pesoActual = 0;
        for (PersonasAbordo p : personas) {
            pesoActual += p.getPeso();
        }

        return pesoActual <= 850;
    }

    public int getNroCabina() {
        return nroCabina;
    }
}

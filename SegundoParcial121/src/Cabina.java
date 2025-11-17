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

    // Método solicitado
    public boolean agregarPersona(PersonasAbordo p) {
        // Verificar límite de 10 personas
        if (personas.size() >= 10) {
            System.out.println("No se puede agregar más personas: límite de 10 alcanzado.");
            return false;
        }

        // Calcular peso total actual
        double pesoActual = 0;
        for (PersonasAbordo persona : personas) {
            pesoActual += persona.getPeso();
        }

        // Verificar límite de peso
        if (pesoActual + p.getPeso() > 850) {
            System.out.println("No se puede agregar a la persona: se supera el límite de 850 kg.");
            return false;
        }

        // Si todo está correcto, agregar persona
        personas.add(p);
        return true;
    }

    // MÉTODO PARA EL PUNTO 2: verificar si esta cabina cumple protocolos
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

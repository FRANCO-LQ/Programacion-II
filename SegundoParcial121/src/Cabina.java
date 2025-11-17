import java.util.ArrayList;

public class Cabina {
    private int nroCabina;
    private ArrayList<personasAbordo> personas;

    public Cabina(int nroCabina, ArrayList<personasAbordo> personas) {
        this.nroCabina = nroCabina;
        this.personas = (personas != null) ? personas : new ArrayList<>();
    }

    public void agregarPrimeraPersona(personasAbordo p) {
        personas.add(0, p);
    }

    // Método solicitado
    public boolean agregarPersona(personasAbordo p) {
        // Verificar límite de 10 personas
        if (personas.size() >= 10) {
            System.out.println("No se puede agregar más personas: límite de 10 alcanzado.");
            return false;
        }

        // Calcular peso total actual
        double pesoActual = 0;
        for (personasAbordo persona : personas) {
            pesoActual += persona.getPeso();
        }

        // Verificar límite de peso
        if (pesoActual + p.getPeso() > 850) {
            System.out.println("No se puede agregar a la persona: se supera el límite de 850 kg.");
            return false;
        }

        // Si todo está ok → agregar persona
        personas.add(p);
        return true;
    }
}

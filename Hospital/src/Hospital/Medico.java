package Hospital;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.google.gson.Gson;

public class Medico {

    private int idMed;
    private String nomMed;
    private String apMed;
    private int aniosExp;

    public Medico(int idMed, String nomMed, String apMed, int aniosExp) {
        this.idMed = idMed;
        this.nomMed = nomMed;
        this.apMed = apMed;
        this.aniosExp = aniosExp;
    }

    // Getters y Setters
    public int getIdMed() { return idMed; }
    public String getNomMed() { return nomMed; }
    public String getApMed() { return apMed; }
    public int getAniosExp() { return aniosExp; }

    public void setIdMed(int idMed) { this.idMed = idMed; }
    public void setNomMed(String nomMed) { this.nomMed = nomMed; }
    public void setApMed(String apMed) { this.apMed = apMed; }
    public void setAniosExp(int aniosExp) { this.aniosExp = aniosExp; }

    // --------------------------------------------------------------------
    //                       CLASE INTERNA ALTA
    // --------------------------------------------------------------------
    public static class Alta {

        private List<Medico> medicos;
        private List<Consulta> consultas;
        private Gson gson = new Gson();

        public Alta() {
            medicos = new ArrayList<>();
            consultas = new ArrayList<>();
        }

        // ------------------ AGREGAR MÉDICO ----------------------
        public void agregarMedico(Medico m) {
            medicos.add(m);
        }

        // ------------------ DAR ALTA A 3 MÉDICOS ----------------------
        public void altaTresMedicos() {
            medicos.add(new Medico(1, "Carlos", "Gomez", 10));
            medicos.add(new Medico(2, "Ana", "Lopez", 5));
            medicos.add(new Medico(3, "Juan", "Martinez", 15));
        }

        // ------------------ AGREGAR CONSULTA ----------------------
        public void agregarConsulta(Consulta c) {
            consultas.add(c);
        }

        // ------------------ DAR DE BAJA A UN MÉDICO Y SUS CONSULTAS ----------------------
        public void darDeBaja(String nombre, String apellido) {

            int idBorrar = -1;

            // Buscar y eliminar médico
            Iterator<Medico> it = medicos.iterator();
            while (it.hasNext()) {
                Medico m = it.next();
                if (m.getNomMed().equalsIgnoreCase(nombre) &&
                    m.getApMed().equalsIgnoreCase(apellido)) {

                    idBorrar = m.getIdMed();
                    it.remove();
                    System.out.println("Médico eliminado: " + nombre + " " + apellido);
                }
            }

            if (idBorrar == -1) {
                System.out.println("No se encontró al médico para eliminar.");
                return;
            }

            // Eliminar consultas del médico usando Iterator (sin lambda)
            Iterator<Consulta> itC = consultas.iterator();
            while (itC.hasNext()) {
                Consulta c = itC.next();
                if (c.getIdMed() == idBorrar) {
                    itC.remove();
                }
            }

            System.out.println("Consultas del médico eliminadas correctamente.");
        }

        // ------------------ EXPORTAR A JSON ----------------------
        public String exportarMedicosJSON() {
            return gson.toJson(medicos);
        }

        public String exportarConsultasJSON() {
            return gson.toJson(consultas);
        }
    }
}

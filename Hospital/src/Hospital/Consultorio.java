package Hospital;

import java.util.List;
import com.google.gson.Gson;

public class Consultorio {

    private List<Medico> medicos;
    private List<Consulta> consultas;
    private Gson gson = new Gson();

    public Consultorio(List<Medico> medicos, List<Consulta> consultas) {
        this.medicos = medicos;
        this.consultas = consultas;
    }

    // Exportar todos los médicos a JSON
    public String exportarMedicosJSON() {
        return gson.toJson(medicos);
    }

    // Exportar todas las consultas a JSON
    public String exportarConsultasJSON() {
        return gson.toJson(consultas);
    }

    // Exportar todo junto
    public String exportarTodoJSON() {
        return gson.toJson(this);
    }
}

package Hospital;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

public class Consulta {
    private int ci;
    private String nombrepaciente;
    private String apellidopaciente;
    private int idMed;
    private int dia;
    private String mes;
    private int anio;

    public Consulta(int ci, String nombrepaciente, String apellidopaciente,
                    int idMed, int dia, String mes, int anio) {

        this.ci = ci;
        this.nombrepaciente = nombrepaciente;
        this.apellidopaciente = apellidopaciente;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Getters y setters
    public int getCi() { return ci; }
    public void setCi(int ci) { this.ci = ci; }

    public String getNombrepaciente() { return nombrepaciente; }
    public void setNombrepaciente(String nombrepaciente) { this.nombrepaciente = nombrepaciente; }

    public String getApellidopaciente() { return apellidopaciente; }
    public void setApellidopaciente(String apellidopaciente) { this.apellidopaciente = apellidopaciente; }

    public int getIdMed() { return idMed; }
    public void setIdMed(int idMed) { this.idMed = idMed; }

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public String getMes() { return mes; }
    public void setMes(String mes) { this.mes = mes; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }


    // ---------------------------------------------------------
    //        CLASE ALTA DE CONSULTAS
    // ---------------------------------------------------------
    public static class AltaC {
        private List<Consulta> consultas = new ArrayList<>();
        private Gson gson = new Gson();

        // Dar alta a una consulta
        public void agregarConsulta(Consulta c) {
            consultas.add(c);
        }

        // Devolver JSON completo
        public String exportarJSON() {
            return gson.toJson(consultas);
        }

        // Cambiar fechas para Navidad y Año Nuevo
        public void corregirFechasEspeciales() {
            for (Consulta c : consultas) {
                if (c.getDia() == 25 && c.getMes().equalsIgnoreCase("diciembre")) {
                    c.setDia(26);  // mover Día Navidad
                }
                if (c.getDia() == 1 && c.getMes().equalsIgnoreCase("enero")) {
                    c.setDia(2); // mover Año Nuevo
                }
            }
        }

        // Mostrar pacientes atendidos un día específico
        public void mostrarPorFecha(int d, int m, int a) {
            String mesStr = obtenerMes(m);

            System.out.println("Pacientes atendidos el " + d + "/" + m + "/" + a + ":");

            for (Consulta c : consultas) {
                if (c.getDia() == d && c.getMes().equalsIgnoreCase(mesStr) && c.getAnio() == a) {
                    System.out.println("- " + c.getNombrepaciente() + " " + c.getApellidopaciente());
                }
            }
        }

        // Convertir número a nombre del mes
        private String obtenerMes(int m) {
            String[] meses = {"enero","febrero","marzo","abril","mayo","junio",
                              "julio","agosto","septiembre","octubre","noviembre","diciembre"};
            return meses[m-1];
        }
    }
}

    // ---------------------------------------------------------
    //  EJEMPLO DE USO - PUEDES PEGAR ESTO EN UN MAIN
    // ---------------------------------------------------------
   

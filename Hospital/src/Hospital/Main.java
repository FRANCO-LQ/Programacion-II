package Hospital;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Medico.Alta registro = new Medico.Alta();

        // 1️⃣ Dar de alta a 3 médicos
        registro.altaTresMedicos();

        // 2️⃣ Agregar consultas
        registro.agregarConsulta(new Consulta(101, "Luis", "Perez", 1, 12, "mayo", 2024));
        registro.agregarConsulta(new Consulta(102, "Maria", "Gomez", 2, 20, "junio", 2024));
        registro.agregarConsulta(new Consulta(103, "Ana", "Martinez", 3, 15, "julio", 2024));
        registro.agregarConsulta(new Consulta(104, "Pedro", "Lopez", 1, 25, "mayo", 2024));
        registro.agregarConsulta(new Consulta(105, "Sofia", "Gonzalez", 2, 10, "junio", 2024));

        // 3️⃣ Dar de baja a un médico
        System.out.println("\n=== Dar de baja a Ana Lopez ===");
        registro.darDeBaja("Ana", "Lopez");

        // 4️⃣ Exportar JSON a consola
        String jsonMedicos = registro.exportarMedicosJSON();
        String jsonConsultas = registro.exportarConsultasJSON();

        System.out.println("\n=== Médicos en JSON ===");
        System.out.println(jsonMedicos);

        System.out.println("\n=== Consultas en JSON ===");
        System.out.println(jsonConsultas);

        // 5️⃣ Guardar JSON en archivos externos
        try {
            FileWriter fileMedicos = new FileWriter("medicos.json");
            fileMedicos.write(jsonMedicos);
            fileMedicos.close();
            System.out.println("\nArchivo medicos.json creado correctamente.");

            FileWriter fileConsultas = new FileWriter("consultas.json");
            fileConsultas.write(jsonConsultas);
            fileConsultas.close();
            System.out.println("Archivo consultas.json creado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los archivos JSON: " + e.getMessage());
        }
    }
}

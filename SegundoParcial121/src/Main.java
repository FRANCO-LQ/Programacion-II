public class Main {
    public static void main(String[] args) {

        // Create Lineas (e.g., two lines: "Roja" and "Verde")
        Linea linea1 = new Linea(1, "Roja");
        Linea linea2 = new Linea(2, "Verde");

        // Create Cabinas for each Linea
        Cabina cabina1 = new Cabina(101);
        Cabina cabina2 = new Cabina(102);

        // Add Cabinas to Lineas
        linea1.agregarCabina(cabina1);
        linea2.agregarCabina(cabina2);

        // Create Personas (people)
        Persona p1 = new Persona("Juan", 25, 80);
        Persona p2 = new Persona("Maria", 65, 70);
        Persona p3 = new Persona("Pedro", 35, 75);
        Persona p4 = new Persona("Ana", 61, 60);

        // Add people to cabins
        cabina1.agregarPersona(p1);
        cabina1.agregarPersona(p2);

        cabina2.agregarPersona(p3);
        cabina2.agregarPersona(p4);

        // Display information about cabins and their people
        System.out.println("Cabina 1: " + cabina1);
        for (Persona p : cabina1.getPersonas()) {
            System.out.println(p);
        }

        System.out.println("Cabina 2: " + cabina2);
        for (Persona p : cabina2.getPersonas()) {
            System.out.println(p);
        }

        // Check if cabins comply with protocols
        System.out.println("\n--- VERIFICACIÓN DE PROTOCOLOS ---");
        System.out.println("Cabina 1 cumple protocolos: " + cabina1.cumpleProtocolos());
        System.out.println("Cabina 2 cumple protocolos: " + cabina2.cumpleProtocolos());
    }
}

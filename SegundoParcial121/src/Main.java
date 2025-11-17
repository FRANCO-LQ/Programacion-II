public class Main {
    public static void main(String[] args) {

        // Crear cabinas con línea usando herencia
        Linea c1 = new Linea(1, "Roja");
        Linea c2 = new Linea(2, "Verde");

        // Crear personas
        Persona p1 = new Persona("Juan", 25, 80);
        Persona p2 = new Persona("Maria", 65, 70);
        Persona p3 = new Persona("Pedro", 35, 75);
        Persona p4 = new Persona("Ana", 61, 60);

        // Agregar personas a cabinas
        c1.agregarPersona(p1);
        c1.agregarPersona(p2);

        c2.agregarPersona(p3);
        c2.agregarPersona(p4);

        // Mostrar cabinas y personas
        System.out.println(c1);
        for (Persona p : c1.getPersonas()) {
            System.out.println(p);
        }

        System.out.println(c2);
        for (Persona p : c2.getPersonas()) {
            System.out.println(p);
        }

        // Verificar protocolos
        System.out.println("\n--- VERIFICACIÓN DE PROTOCOLOS ---");
        System.out.println("Cabina 1 cumple protocolos: " + c1.cumpleProtocolos());
        System.out.println("Cabina 2 cumple protocolos: " + c2.cumpleProtocolos());
    }
}

public class Main {
	public static void main(String[]args) {
		
	}

}

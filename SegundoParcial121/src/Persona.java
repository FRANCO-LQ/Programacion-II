public class Persona {
    private String nombre;
    private int edad;
    private double peso;

    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    // ✔ TARIFA SEGÚN LO QUE TE PIDEN
    public double calcularPasaje() {
        if (edad >= 60) {     // Personas mayores de 60 años
            return 1.50;
        }
        return 3.00;          // Todos los demás
    }

    @Override
    public String toString() {
        return nombre + " | Edad: " + edad +
               " | Peso: " + peso + "kg" +
               " | Pasaje: " + calcularPasaje() + " Bs";
    }
}

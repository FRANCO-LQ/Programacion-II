package org.example;

public class Estadistica {
    private double[] numeros;

    public Estadistica(double[] numeros) {
        this.numeros = numeros;
    }

    public double getPromedio() {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    public double getDesviacion() {
        double promedio = getPromedio();
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}
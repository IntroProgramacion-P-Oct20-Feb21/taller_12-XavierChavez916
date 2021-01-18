/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base;
        double potencia;
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int i = 0; i < 5; i++) {
            base = bases[i];
            potencia = potencias[i];
            resultado[i] = obtenerPotencia(resultado, base, potencia);
            System.out.printf("%.1f^%.1f=%.1f\n", bases[i],potencias[i],
                    obtenerPotencia(resultado, base, potencia));
        }

    }

    public static double obtenerPotencia(double[] resultado, double base,
            double potencia) {

        if (potencia == 1) {
            return base;
        } else {
            return base * obtenerPotencia(resultado, base, potencia - 1);
        }
    }
}

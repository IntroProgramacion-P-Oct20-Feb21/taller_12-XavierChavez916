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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1;
        double numero2;
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];
        for (int i = 0; i < 5; i++) {
            numero1 = datos[i];
            numero2 = datos2[i];
            suma[i] = valorSuma(numero1, numero2);
            System.out.println(suma[i]);
        }

    }

    public static double valorSuma(double numero1, double numero2) {
        if (numero2 == 0) {
            return numero1;
        } else {
            if (numero1 == 0) {
                return numero2;
            } else {
                return 1 + valorSuma(numero1, numero2 - 1);
            }
        }

    }
}

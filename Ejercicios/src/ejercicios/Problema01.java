/*
Problema 
Dado el siguiente arreglo

double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
Use un método recursivo que permita encontrar el factorial de cada posición 
del arreglo. El resultado de cada posición debe ubicarlo en el siguiente arreglo

double[][] resultado = new double[4][2];
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] resultado = new double[4][2];
        double numero;
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                numero = datos[i][j];
                resultado[i][j] = factorial(numero);
                System.out.printf("Para el numero %s su factorial es: %s\n",
                        datos[i][j],factorial(numero));
            }
        }
    }

    public static double factorial(double numero) {
        if (numero <= 1) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }

    }

}

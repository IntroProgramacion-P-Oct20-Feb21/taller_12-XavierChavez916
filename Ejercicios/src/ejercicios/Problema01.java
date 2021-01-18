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
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double[][] resultado = new double[4][2];
        factorial(datos, resultado, 3, 1);
    }

    public static void factorial(double[][] datos, double[][] resultado,
            int fila, int columna) {
        double numero = datos[fila][columna];
        datos[fila][columna] = numero - 1;

        if (datos[fila][columna] == 0) {
            System.out.printf("%s\n", resultado[fila][columna]);
            columna = columna - 1;
            if (columna < 0) {
                fila = fila - 1;
                columna = 1;
            }
        }
        if (fila >= 0) {
            if (resultado[fila][columna] != 0) {
                numero = resultado[fila][columna];
            }
            resultado[fila][columna] = numero * datos[fila][columna];
            factorial(datos, resultado, fila, columna);
        }

    }

}

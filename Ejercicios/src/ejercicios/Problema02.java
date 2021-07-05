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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        suma(datos, 0);
    }

    public static void suma(double[][] datos, int fila) {
        double suma = datos[fila][0] + datos[fila][1] + datos[fila][2];
        System.out.println(suma);
        fila = fila + 1;
        if (fila < datos.length) {
            suma(datos, fila);
        }

    }

}

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
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) { // aquí se evalua el caso base
            return arreglo[0];
        } else {
            // se recorre el arreglo 
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }

    }

}

// Su salida es 17 
// Ya que se esta usando un metodo recursivo y se va sumando 
// el valor de cada posicion del arreglo
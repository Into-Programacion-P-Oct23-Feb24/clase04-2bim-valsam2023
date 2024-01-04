/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] primerValor = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] segundoValor = {{1, 2, 3}, {3, 2, 2}, {3, 1, 2}};
        int[][] arreglotres = new int[3][3];
        int respuesta;

        for (int i = 0; i < primerValor.length; i++) {
            for (int j = 0; j < segundoValor.length; j++) {
                respuesta = obtenerMultiplicacion(primerValor[i][j],
                        segundoValor[i][j]);
                arreglotres[i][j] = respuesta;
            }
        }
        for (int i = 0; i < primerValor.length; i++) {
            for (int j = 0; j < primerValor[i].length; j++) {
                System.out.printf("%d\t", arreglotres[i][j]);

            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < segundoValor.length; i++) {
            for (int j = 0; j < segundoValor[i].length; j++) {
                System.out.printf("%d\t", arreglotres[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        for (int i = 0; i < arreglotres.length; i++) {
            for (int j = 0; j < arreglotres[i].length; j++) {
                System.out.printf("%d\t", arreglotres[i][j]);
            }
            System.out.println("\n");
        }
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

}

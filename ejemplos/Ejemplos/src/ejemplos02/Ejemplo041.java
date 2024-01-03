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

        for (int i = 1; i < primerValor.length; i++) {
            for (int j = 1; j < segundoValor.length; i++) {
                System.out.printf("%d");
            }
        }

        for (int i = 1; i < primerValor.length; i++) {
            for (int j = 1; j < segundoValor.length; i++) {
                arreglotres[i][j] = obtenerMultiplicacion(primerValor[i][j],
                        segundoValor[i][j]);
            }
        }

    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

}

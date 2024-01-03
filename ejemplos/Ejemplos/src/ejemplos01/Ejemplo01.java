/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //System.out.printf("%s\n", miCiudad);
        obtenerMultiplicacion(7, 50);
        String miMensaje = obtenerMultiplicacionDos(7, 50);
        System.out.printf("%s\n", miMensaje);

    }

    public static String obtenerMultiplicacionDos(int tabla, int limite) {
        String cadenaFinal = "";
        int resultado;
        for (int i = 1; i <= limite; i++) {
            resultado = tabla * i;
            cadenaFinal = String.format("%s%d * %d = %d\n",cadenaFinal,
                    tabla, i,
                    resultado);
        }
        return cadenaFinal;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {
        int respuesta;
        for (int i = 1; i <= limite; i++) {
            respuesta = tabla * i;
            System.out.printf("%d * %d = %d\n", tabla, i,
                    respuesta);
        }
    }
/*
    Lo que hice aqui es en obtenerMultiplicacion realice la tabla del 7 hasta el
    100 usando procedimiento, sin retornar una variable, en cambio en el 
    obtenerMultiplicacionDos utilice una funcion que retorne una variable.
    */
    public static String obtenerNombre() {
        return "Luis";
    }

}

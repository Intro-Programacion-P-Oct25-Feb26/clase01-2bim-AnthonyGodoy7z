/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int operacion;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        String mensaje = "";

        for (int i = 30; i >= 10; i--) {
            operacion = i * 1;
            a += operacion;
            mensaje = String.format("%s%d-", mensaje, operacion);

            operacion = i * 2;
            b += operacion;
            mensaje = String.format("%s%d-", mensaje, operacion);

            operacion = i * 3;
            c += operacion;
            mensaje = String.format("%s%d-", mensaje, operacion);

            operacion = i * 4;
            d += operacion;
            mensaje = String.format("%s%d\n", mensaje, operacion);

        }
            mensaje = String.format("%sTotales = %d-%d-%d-%d\n", mensaje, 
                    a, b, c, d);
            
            System.out.printf("%s", mensaje);
    }
}

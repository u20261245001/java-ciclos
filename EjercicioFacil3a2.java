package PaqueteUno;
/*
Programa que muestre los números del 1 al 100, pero sin mostrar los múltiplos de 7.
*/

/**
 *
 * @author Martin Alba u20261245001
 */

public class EjercicioFacil3a2 {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=100; i++) {
            if (i % 7!=0){
             System.out.print(i+", ");   
            }
        }
    }   
}
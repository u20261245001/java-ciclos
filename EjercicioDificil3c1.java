package PaqueteUno;
/*
Pedir por teclado un número y calcular su factorial. Si el número introducido es negativo se seguirá pidiendo hasta que sea positivo.
*/
/**
 *
 * @author Martin Alba u20261245001
 */
import java.util.Scanner;
public class EjercicioDificil3c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long facto = 1;
        int a, b = 1, counter=1;
        while (counter<2){
            System.out.println("Ingresa un  numero");
            a = sc.nextInt();
            if (a<0){
                System.out.println("Tu numero es negativo, por favor, escribe un numero entero positivo ");
                continue;
            } while (b <= a){
                facto *= b;
                b++;
            } System.out.println("El factorial de tu numero ("+a+") es: "+facto);
            break;
        }
    }
}
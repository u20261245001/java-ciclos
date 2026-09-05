package PaqueteUno;
/*
Realizar un programa que pida al usuario un número, que debe estar entre 0 y 10. Si el usuario indica un número erróneo, vuelve a pedir el número. Cuando se indica un número válido, se muestra la tabla de multiplicar de dicho número.
*/
import java.util.Scanner;
/**
 *
 * @author Martin Alba u20261245001
 */
public class EjercicioFacil3a18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int b;
        int result;
        boolean execute=true;
        while (execute){
        System.out.println("Escribe un numero entre 0 y 10");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("Error, tu numero está fuera del rango entre 0 y 10");
        }  else if (num>10){
            System.out.println("Error, tu numero está fuera del rango entre 0 y 10");
         } else {
            for (b=0; b<=10;b++){
                result = b*num;
                System.out.println(num+" x "+b+" = "+result);
            }
            break;
        }
        }
    }
}
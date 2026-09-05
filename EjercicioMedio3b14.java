package PaqueteUno;
/*
Programa consistente en un juego en el que el ordenador genera aleatoriamente un número entre el 1 y el 100 y el usuario tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento del usuario
se mostrará el mensaje “Te pasaste”, o “No llegaste”, según corresponda. El programa terminará cuando se agoten los intentos y/o el usuario acierte el número. Se ha de mostrar el mensaje correspondiente al final así como informar del número “escondido”
*/
/**
 *
 * @author Martin Alba u20261245001
 */
import java.util.Scanner;
public class EjercicioMedio3b14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, intents = 0;
        int rvndom = (int) (Math.random()*100 + 1);
        while (intents < 10){
            intents++;
            System.out.println("Escribe un numero entre el 1 al 100");
            a = sc.nextInt();          
            if (a == rvndom){
                System.out.println("¡ Adivinaste ! tu numero ingresado es el numero aleatorio");
                break;
            } else if(a < rvndom){
                System.out.println("Tu numero es inferior al numero aleatorio");
            }else if (a > rvndom){
                System.out.println("Tu numero es superior al numero aleatorio");
            }
            System.out.println("Intentos hechos: "+intents+"/10");
            if (intents == 10){
            System.out.println("Perdiste, el numero aleatorio era "+rvndom);
            }
        }
    }
}
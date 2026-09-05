package PaqueteUno;
 /*
Programa que pide por teclado 5 números, y en el caso en el que el primero introducido sea igual al último, nos muestra la media de ambos. En caso contrario, no se mostrará nada.
*/
import java.util.Scanner;
/**
 *
 * @author Martin Alba u20261245001
 */
public class EjercicioMedio3b1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int pn = 0, un = 0, a, media, counter=1;
      while (counter<=5){
          System.out.println("Escribe el "+counter+" numero");
          a = sc.nextInt();
          if (counter==1){
            pn = a;
          }
          if (counter==5){
            un = a;
          }
          counter++;
      }
      if (pn == un) {
          media = (pn + un) / 2;
          System.out.println("La media entre el primer y el ultimo numero digitado es: "+media);
      }
    }
}
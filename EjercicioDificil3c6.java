package PaqueteUno;
/*
Escribir un programa que muestre esto por pantalla:
*
**
***
****
*****
*/
/**
 *
 * @author Martin Alba u20261245001
 */
public class EjercicioDificil3c6 {
    public static void main(String[] args) {
        String a="";
        int counter=1;
        while(counter<=5){
            a += "* ";
            System.out.println(a+"");
            counter++;
        }
    }
}

package progrmacionvisual;

import java.util.Scanner;

public class Programa_07 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuántos días trabajó?");
        int dias = teclado.nextInt();
        int contador = 0;
        int hs = 0, ms = 0, ss = 0;
        while(contador < dias){
            System.out.println("Hora trabajadas al día: ");
            System.out.println("Hora: ");
            int h = teclado.nextInt();
            System.out.println("Minuto: ");
            int m = teclado.nextInt();
            System.out.println("Segundo: ");
            int s = teclado.nextInt();
            ss = ss + s;
            if(ss >= 60){
                ss = ss - 60;
                ms = ms + 1;
            }
            ms = ms + m;
            if(ms >= 60){
                ms = ms - 60;
                hs = hs + 1;
            }
            hs = hs + h;
            contador++;
        }
        System.out.println("El tiempo total trabajado es: " + hs + ":" + ms +":" + ss);
    }
}

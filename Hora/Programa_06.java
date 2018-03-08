
package progrmacionvisual;

import java.util.Scanner;


public class Programa_06 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int h1, m1, s1;
        int h2, m2, s2;
        int res1, res2, res3;
        int r1,r2,r3;
        System.out.println("Introduce la hora de entrada");
        System.out.println("Hora: ");
        h1 = teclado.nextInt();
        System.out.println("Minuto: ");
        m1 = teclado.nextInt();
        System.out.println("Segundo: ");
        s1 = teclado.nextInt();
        System.out.println("Introduzca la hora de salida: ");
        System.out.println("Hora: ");
        h2 = teclado.nextInt();
        System.out.println("Minuto: ");
        m2 = teclado.nextInt();
        System.out.println("Segundo: ");
        s2 = teclado.nextInt();
        r3 = h2 - h1;
        r2 = m2 - m1;
        r1 = s2 - s1;
        int f1 = 0, f2 = 0, f3 = 0;
        if(r1 >= 0){
            f1 = r1;
        }else if(r1 < 0){
            f1 = r1 + 60;
            r2 = r2 - 1;
        }
        if(r2 >= 0){
            f2 = r2;
            f3 = h2 - h1;
        }else if(r2 < 0){
            f2 = r2 + 60;
            f3 = r3 - 1;
        }
        
        System.out.println("El tiempo total es: "+f3+":"+f2+":"+f1);
    }
}

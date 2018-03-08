
package progrmacionvisual;

import java.util.Scanner;

public class MainFecha {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el día: ");
        Integer di = teclado.nextInt();
        System.out.println("Mes: ");
        Integer me = teclado.nextInt();
        System.out.println("Anio: ");
        Integer an = teclado.nextInt();
        Fecha fe = new Fecha(di, me, an);
        fe.aumentar();
        System.out.println(fe);
        System.out.println("Cuantos días quieres aumentar?");
        Integer au = teclado.nextInt();
        fe.aumentar(au);
        System.out.println(fe);
    }
}

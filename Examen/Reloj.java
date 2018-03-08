
package Examen;

import java.util.Scanner;

public class Reloj {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        //introducir los valores de hora
        
        System.out.println("Dime el segundo: ");
        Integer se = teclado.nextInt();
        System.out.println("Dime el minuto: ");
        Integer mi = teclado.nextInt();
        System.out.println("Dime la hora: ");
        Integer hor = teclado.nextInt();
        Hora ho = new Hora(se, mi, hor);
        //Introducir valores de fecha
        System.out.println("Dime el dia: ");
        Integer di = teclado.nextInt();
        System.out.println("Dime el mes: ");
        Integer sem = teclado.nextInt();
        System.out.println("Dime el año: ");
        Integer ani = teclado.nextInt();
        Fecha fech = new Fecha(di, sem, ani);
        Resultado res = new Resultado(ho, fech);
        while(true){    
            res.aumentar();
            System.out.println(res);
        }
    }
}

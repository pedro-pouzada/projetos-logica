/**
 * @author Pedro Pouzada & Iuri Bittencourt
 * @version 1.0
 * @since 01/06/2020 - 11:40
 */

import java.util.Scanner;
public class Principal {
   
    public static void main (String args[]) {
    
        System.out.println("\f");
        
        Nadador nadador = new Nadador();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        nadador.setNomeNadador(scanner.next());
        System.out.println("Digite sua idade");
        nadador.setIdadeNadador(scanner.nextInt());
        System.out.println(nadador);
       
    
    }

}
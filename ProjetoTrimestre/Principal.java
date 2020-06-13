/**
 * @author Pedro Pouzada & Iuri Bittencourt
 * version 1.0
 * since 01/06/2020 - 09:30
 */

import java.util.Scanner;
public class Principal {

    public static void main(String args[]) {
     
        System.out.println("\f");
        
        Trimestre trimestre = new Trimestre();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o mês de nascimento");
        trimestre.setMesNascimento(scanner.next());
        System.out.println(trimestre);
    }
    

}
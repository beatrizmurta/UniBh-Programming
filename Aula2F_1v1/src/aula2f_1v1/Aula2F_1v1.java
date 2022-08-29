/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2f_1v1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Aula2F_1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota1, nota2, nota3, media;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite a 1° nota: ");
        nota1 = ler.nextInt();
        
        System.out.println("Digite a 2° nota: ");
        nota2 = ler.nextInt();
        
        System.out.println("Digite a 3° nota: ");
        nota3 = ler.nextInt();
        
        media = (nota1+nota2+nota3) /3;
        System.out.println("Sua média é: " +media);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2f_2v1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Aula2F_2v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double boleto1, boleto2, boleto3, boleto4, total;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o valor do 1° boleto: ");
        boleto1 = ler.nextDouble();
        
        System.out.println("Digite o valor do 2° boleto: ");
        boleto2 = ler.nextDouble();
        
        System.out.println("Digite o valor do 3° boleto: ");
        boleto3 = ler.nextDouble();
        
        System.out.println("Digite o valor do 4° boleto: ");
        boleto4 = ler.nextDouble();
        
        total = boleto1+boleto2+boleto3+boleto4;
        System.out.println("O total do valor dos boletos é de: "+total);
    }
    
}

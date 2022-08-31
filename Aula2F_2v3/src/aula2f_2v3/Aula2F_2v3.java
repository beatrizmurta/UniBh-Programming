/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2f_2v3;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Aula2F_2v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double boleto1, boleto2, boleto3, boleto4, totalboleto, salariobruto, salarioliquido, diferenca;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o se salário bruto: ");
        salariobruto = ler.nextDouble();
        
        System.out.println("Digite o valor do 1° boleto: ");
        boleto1 = ler.nextDouble();
        
        System.out.println("Digite o valor do 2° boleto: ");
        boleto2 = ler.nextDouble();
        
        System.out.println("Digite o valor do 3° boleto: ");
        boleto3 = ler.nextDouble();
        
        System.out.println("Digite o valor do 4° boleto: ");
        boleto4 = ler.nextDouble();
        
        salarioliquido = salariobruto*0.86;
        System.out.println("O seu salário líquido é: " +salarioliquido);
        
        totalboleto = boleto1+boleto2+boleto3+boleto4;
        System.out.println("O tota da soma dos boletos é: " +totalboleto);
        
        diferenca = salarioliquido-totalboleto;
        System.out.println("A diferença do seu salário líquido e o total dos boletos é: "+diferenca);
    }
    
}

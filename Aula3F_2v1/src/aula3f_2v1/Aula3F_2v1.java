/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3f_2v1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Aula3F_2v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota, frequencia;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite a nota: ");
        nota = ler.nextDouble();
        
        System.out.println("Digite a frequência: ");
        frequencia = ler.nextDouble();
        
        if (nota>=7 & frequencia >=0.75) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }
    
}

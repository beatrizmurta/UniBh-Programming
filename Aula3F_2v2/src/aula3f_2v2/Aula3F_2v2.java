/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula3f_2v2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Aula3F_2v2 {

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
        
        if (nota>=7 & frequencia>0.75){
            System.out.println("O aluno foi aprovado");
        } else {
            if (nota>8 || frequencia>0.9){
                System.out.println("Repescagem");
            } else {
                System.out.println("O aluno foi reaprovado");
            }
        }
    }
    
}

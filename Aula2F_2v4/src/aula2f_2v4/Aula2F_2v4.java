/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula2f_2v4;

import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author beatriz
 */
public class Aula2F_2v4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date vencimento1, vencimento2, dia = null;
        
        double boleto1, boleto2, totalboleto, salariobruto, salarioliquido, diferenca;
        String boleto1credor, boleto2credor, venc1, venc2, hoje;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o seu salário bruto: ");
        salariobruto = ler.nextDouble();
        
        System.out.println("Digite o valor do 1° boleto: ");
        boleto1= ler.nextDouble();
        System.out.println("Digite o nome do credor do 1° boleto: ");
        boleto1credor= ler.next();
        System.out.println("Digite a data de vencimento do 1° boleto: ");
        venc1= ler.next();
        
        System.out.println("Digite o valor do 2° boleto: ");
        boleto2= ler.nextDouble();
        System.out.println("Digite o nome do credor do 2° boleto: ");
        boleto2credor= ler.next();
        System.out.println("Digite a data de vencimento do 2° boleto: ");
        venc2= ler.next();
        
        System.out.println("Digite a data de hoje: ");
        hoje = ler.next();
        
        try {
            vencimento1 = sdf.parse(venc1);
            vencimento2 = sdf.parse (venc2);
            dia = sdf.parse(hoje);
        } catch (java.text.ParseException e) { return; }
        
        salarioliquido = salariobruto*0.70;
        System.out.println("O salário liquido é: "+ salarioliquido);
        
        totalboleto = boleto1+boleto2;
        System.out.println("O total dos boletos é: "+totalboleto);
        
        diferenca = salarioliquido-totalboleto;
        System.out.println("A diferença entre o salário líquido e os boeltos é: "+diferenca);
        
        long difData1 = (vencimento1.getTime()-dia.getTime())/86400000;
        long difData2 = (vencimento2.getTime()-dia.getTime())/86400000;
        
        System.out.println("A diferença do 1° boleto é: "+difData1);
        System.out.println("A diferença do 2° boleto é: "+difData2);
    }
    
}

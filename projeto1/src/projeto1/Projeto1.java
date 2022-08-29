/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto1;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author beatr
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        int n1, n2, n3, produtoNum;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        n3 = ler.nextInt(); 
        
        produtoNum = n1 * n2 * n3;
        System.out.println("O produto do número é: ");
        
           int a = 20;
           String Nome = "Alfred";
           for (int i=1; i<=10; ++i){
              System.out.println("a: "+a+" e i:"+i);
               a = a+i;
           }
           System.out.println("Seu número é: "+a+" "+Nome);
    }
    
}

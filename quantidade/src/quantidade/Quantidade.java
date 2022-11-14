/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quantidade;
import java.util.Scanner;
/**
 *
 * @author Beatriz Murta
 */
public class Quantidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        double hp, lp, ha, la, quantidade;
        String resposta;
        
        System.out.println("Gostaria de calcular a quantidade de azulejos necessárias para cobrir uma parede? sim ou não, visitante?");
        resposta = ler.next();
        
        hp = 0;
        lp = 0;
        ha = 0;
        la = 0;
        
        if (resposta.equals("Sim") || resposta.equals("sim") ){
            System.out.println("Qual a altura da parede? ");
            hp = ler.nextDouble();
            
            System.out.println("Qual a largura da parede? ");
            lp = ler.nextDouble();
            
            System.out.println("Qual a altura do azulejo? ");
            ha = ler.nextDouble();
            
            System.out.println("Qual a largura do azulejo? ");
            la = ler.nextDouble();
            
        }else{
            System.out.println("Que pena! Depois não reclama que comprou azulejo a mais");
        }
        
        quantidade = (hp * lp) / (ha * la);
       
        System.out.println("A quantidade de azulejos necessários é: " +quantidade);
    }
    
}

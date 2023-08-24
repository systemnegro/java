/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author camil
 */
public class Condicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //Scanner teclado = new Scanner(System.in);
       /* System.out.print("Digite sua nota:");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println(m);
        if(m >7){System.out.println("Parabéns");}*/
       
        /*System.out.print("Ano de nascimento");
        int nasc = teclado.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Sua idade e " +idade);
        if(idade >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }*/
        
        Scanner tec = new Scanner(System.in);
        String tipo;
        System.out.print("Quantas pernas? ");
        int pernas = tec.nextInt();
        switch (pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
       
    }
    
    
}

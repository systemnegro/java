/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testes;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author camil
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner tec = new Scanner(System.in);
         /*int numeros[] = new int[20];
         int cont = 0,cont2 = 0,acima5 = 0,divel3 = 0;
         while(cont < 20){
             numeros[cont] = ThreadLocalRandom.current().nextInt(0,10);
             cont++;
         }
         while(cont2 < 20){
             System.out.println("Os numeros sorteados foram " + numeros[cont2] );
             if(numeros[cont2] > 5){
                 acima5 += 1;
             }
             if(numeros[cont2] % 3 == 0){
                 divel3 += 1;
             }
             cont2++;
         }
         
        System.out.println("Numeros acima de 5 sao " + acima5 + " numeros divisivel por 3 sao " + divel3 );*/
         /*
         float produtos[] = new float[8];
         float maior ,menor;
         int cont = 1;
         System.out.println("Digite o preco do produto 1: ");
         produtos[1] = tec.nextFloat();
         maior = menor = produtos[1];
         while(cont < 8){
             System.out.println("Digite o preco do " + (cont + 1) + ":");
             produtos[cont] = tec.nextFloat();
             if(produtos[cont] > maior){
                 maior = produtos[cont];
             }
             if(produtos[cont] < menor){
                 menor = produtos[cont];
             }
             cont++;
         }
       
         System.out.println(maior );
         System.out.println(menor);
        */
         
         /*int idadePerson[] = new int [10];
         int cont = 1,maior,somaIdades,mais18 = 0,menor5 = 0;
         float media;
         System.out.println("Digite a idade da primeira pessoa: ");
         idadePerson[0] = tec.nextInt();
         maior = idadePerson[0];
         somaIdades = idadePerson[0];
         while(cont < 10){
                System.out.println("Digite a idade da pessoa " + (cont + 1) );
                idadePerson[cont] = tec.nextInt();
                somaIdades += idadePerson[cont];
                if(idadePerson[cont] > maior){
                    maior = idadePerson[cont];
                }
                if(idadePerson[cont] > 18){
                    mais18 ++;
                }
                if(idadePerson[cont] < 5){
                    menor5 ++;
                }
                cont++;
         }
         media = somaIdades/10;
         
         System.out.println("A meida da idade do grupo é: " + media);
         System.out.println("Um todal de " + mais18 + " tem mais que 18 anos");
         System.out.println("Um total de " + menor5 + " tem menos que 5 anos");
         System.out.println("A maior idade lida foi " + maior + " anos");*/
         
         /*int idade[] = new int[5];
         char sexo[] = new char[5];
         float mediaIdade = 0, mediaH =0;
         int m = 0,f =0,somaIdade = 0,somaH = 0;
         int cont = 0, quantF = 0;
         
        while(cont <5){
            System.out.println("Qual sua idade? ");
            idade[cont] = tec.nextInt();
            somaIdade += idade[cont];
            System.out.println("Seu sexo [M/F]:");
            sexo[cont] = tec.next().charAt(0);
            if(sexo[cont] == 'm'){
                m++;
                somaH += idade[cont];
                mediaH = somaH/m;
                
            }else if(sexo[cont] == 'f'){
                f++;
                if(idade[cont] > 20){
                    quantF++;
                }
            }
          
            cont++;
        }
        mediaIdade = somaIdade/5;
        System.out.println("Foram " + m + " homens" + " e " + f + " mulheres");
        System.out.println("A media do grupo e " + mediaIdade);
        System.out.println("Media de idade dos homens " + mediaH);
        System.out.println("foram " + quantF + " mulheres acima de 20 anos");*/
         
         
         /*float pesos[] = new float[7];
         float altura[] = new float[7];
         float mediaAlt = 0;
         int cont = 0,somaAlt = 0,mais90 = 0,baixas = 0,grandes = 0;
         while(cont <7){
             System.out.println("Qual o peso ?");
             pesos[cont] = tec.nextFloat();
             if(pesos[cont] > 90){
                 mais90++;
             }
             System.out.println("Qual sua altura? ");
             altura[cont] = tec.nextFloat();
             if(pesos[cont] < 50 && altura[cont] < 1.60){
                 baixas++;
             }
             if(pesos[cont] > 100 && altura[cont] > 1.90){
                 grandes++;85
             }
             somaAlt += altura[cont];
             mediaAlt = somaAlt/7;
             cont++;
         }
         System.out.println("A media de altura do grupo é: " + mediaAlt);
         System.out.println(mais90 + " pessoas pesam mais de 90kg ");
         System.out.println(baixas + " pessoas que pesam menos de 50Kg e tem menos de 1.60m");
         System.out.println(grandes + " pessoas que medem mais de 1.90m e pesam mais de 100Kg");*/
         /*char res ;
         do{
          
             System.out.println("ok");
             res = tec.next().charAt(0);
         }while(res == 's');*/
         
         
         
         /*
         String s = "5 years old";
         char idade = s.charAt(0);
         System.out.println(idade);
        */
         
         void soma (int a, int b){
            int s = a + b;
            System.out.println(s);
        }
         soma(5,2);
       
    }
    
}











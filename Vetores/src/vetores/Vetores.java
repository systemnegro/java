/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;
import java.util.Arrays;

/**
 *
 * @author camil
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n[] = {5,6,3,2,10,7};
        System.out.println(n.length);
        
        for(int c = 0; c < n.length; c++){
            System.out.println("Na posicao " + c + "tem o " + n[c]);
        }*/
        
        /*
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int dia[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int c = 0; c < mes.length; c++){
            System.out.println(" O mes " + mes[c] + " tem " + dia[c] + " dias");
        }*/
        /*
        int n[] = {5,7,8,6,8};
        Arrays.sort(n);
        for(int valor:n){
            System.out.println(valor);
        }*/
        
        /*
        int n[] = {3,6,7,2,5,8,7,4};
        Arrays.sort(n);
        for(int valor:n){
            System.out.println(valor);
        }
        int pos = Arrays.binarySearch(n, 5);
        System.out.println(pos);*/
        
        int n[] = new int [10];
        
        Arrays.fill(n, 1);
        for(int valor:n){
            System.out.println(valor);
        }
    }   
    
}

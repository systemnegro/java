/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package execiciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class ExecicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, totalV = 0, totalPar = 0, totalImpar = 0,acima100 = 0,somaV = 0;
        float media;
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog("<html>Informe um valor:  <br> <em>(0 interrompe)</em></html "));
          somaV += n;
          totalV++;
          if(n % 2 == 0){
              totalPar++;
          }else{
              totalImpar++;
          }
          if(n > 100){
              acima100++;
          }
          
        }while(n != 0);
        media = somaV/totalV;
        
        JOptionPane.showInternalMessageDialog(null,
                "<html>Total de Valores: " + totalV
                 + "<br>Total de Pares: " + totalPar
                 + "<br>Total de Impares " + totalImpar
                 + "<br>Acima de 100 " + acima100
                 + "<br>Média dos Valores: " + media 
                 + "</html>");
  
    }
    
}

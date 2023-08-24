/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author camil
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension tela = toolkit.getScreenSize();
 
        int largura = (int)tela.getWidth();
        int altura = (int)tela.getHeight();
        System.out.println("Resuloção da tela" + largura + "x" + altura);
    }
    
}

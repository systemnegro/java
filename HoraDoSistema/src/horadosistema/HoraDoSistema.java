/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horadosistema;

import java.util.Date;
import java.util.Locale;
import static java.util.Locale.getDefault;

/**
 *
 * @author camil
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é:");
        System.out.println(relogio.toString());
        Locale Idioma = getDefault();
        System.out.print("O sistema esta no idioma"+Idioma );
    }
    
}

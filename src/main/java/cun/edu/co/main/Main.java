/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cun.edu.co.main;

import cun.edu.co.main.designer.Showpanel;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/** 
 *
 * @author thor
 */
public class Main {

    public static void main(String[] args) {
        try {
             // Establece el Look and Feel (FlatLaf Dark)
             UIManager.setLookAndFeel(new FlatDarkLaf());

}   
        catch (UnsupportedLookAndFeelException ex) {
            // Registra un error si falla
            Logger.getLogger(Showpanel.class.getName())
            .log(Level.SEVERE, "Error al establecer el Look and Feel", ex);
}
        //creo la instancia de pantalla para que se muestre en el centro al ejecutarla
        Showpanel screen = new Showpanel();
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
        
    }
}

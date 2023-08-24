/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package javafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author camil
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblmsg;
    @FXML
    private Button btnClick;
    @FXML
    private Label lblmsgg;
    
    @FXML
    private void clicouBotao(ActionEvent event) { 
        lblmsg.setText("SEU ARROMBADO DO CARALHO .l.");
        lblmsgg.setText("kkkkk otaro");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

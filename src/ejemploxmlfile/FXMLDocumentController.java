/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploxmlfile;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Estudiante;

/**
 *
 * @author adrian.vargas
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
  @FXML
    private Label label1;
  @FXML
    private Label label2;
  @FXML
    private Label label3;
  @FXML
    private Label label4;
  @FXML
    private Label label5;
  @FXML
    private Button button;
  @FXML
    private Button Button2;
  @FXML
    private TextField Field;
  @FXML
    private TextField Field1;
  @FXML
    private TextField Field2;
  @FXML
    private TextField Field3;
  @FXML
    private TextField Field4;
  
  @FXML
  LinkedList<Estudiante> listaE;
  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        String nombre = Field.getText();
        String telefono = Field1.getText();
        String correo = Field2.getText();
        String codigo = Field3.getText();
        String carrera = Field4.getText();
        
        Estudiante objE= new Estudiante(nombre,telefono, correo,codigo,carrera);
                listaE.add(objE);
    }
    
     @FXML
     
     private void guardarXML (ActionEvent event){
     
         Estudiante objV = new Estudiante();
         
     boolean guardar = objV.crearArchivoXML(listaE);
     
     }
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        listaE = new LinkedList<>();
    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriam.iniciar;

/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class SeleccionDificultadController implements Initializable {
    

    
    iniciar nuevo=new iniciar();

       @FXML
    private Button btndificil;

    @FXML
    private Button btnfacil;

    @FXML
    private Button btnmedio;

    @FXML
    void entrardificil(ActionEvent event) throws IOException {
           
 
        
       nuevo.CambiarDificultad("FACIL");
       Object eventSource= event.getSource();
       Node sourceAsNode = (Node) eventSource;
       Scene oldScene= sourceAsNode.getScene();
       Window window =oldScene.getWindow();
       Stage stage =(Stage) window;
       stage.hide();
       
       
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/VistaModoDificil.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
    }

    @FXML
    void entrarfacil(ActionEvent event) throws IOException {
       Object eventSource= event.getSource();
       Node sourceAsNode = (Node) eventSource;
       Scene oldScene= sourceAsNode.getScene();
       Window window =oldScene.getWindow();
       Stage stage =(Stage) window;
       stage.hide();
       
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/VistaModoFacil.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
    }

    @FXML
    void entrarmedio(ActionEvent event) throws IOException {
       Object eventSource= event.getSource();
       Node sourceAsNode = (Node) eventSource;
       Scene oldScene= sourceAsNode.getScene();
       Window window =oldScene.getWindow();
       Stage stage =(Stage) window;
       stage.hide();
       
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/VistaModoMedio.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
       
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
    
    
}

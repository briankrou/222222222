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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriam.Contadores;


/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class PerdisteController implements Initializable {
        @FXML
    private Label puntos;
    
    @FXML
    private Button btnSalir;
    
    @FXML
    private Button btnPerdisteAceptar;

    @FXML
    private ImageView estrella1;

    @FXML
    private ImageView estrella2;

    @FXML
    private ImageView estrella3;

    @FXML
    private ImageView estrella4;

    @FXML
    private ImageView estrella5;

    @FXML
    private ImageView estrellaPerdida1;

    @FXML
    private ImageView estrellaPerdida2;

    @FXML
    private ImageView estrellaPerdida3;

    @FXML
    private ImageView estrellaPerdida4;

    @FXML
    private ImageView estrellaPerdida5;
    
        @FXML
    void Exit(ActionEvent event) throws IOException {
        
        
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
        
        Contadores.reiniciarNivel();
        
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/principal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        
        
    }

    @FXML
    void AceptarPerdida(ActionEvent event) throws IOException {
       
        
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
        switch(Contadores.getDificultad()){
            case "FACIL":
                    
                    Parent root1 = FXMLLoader.load(getClass().getResource("/vistas/VistaModoFacil.fxml"));
                    Scene scene1 = new Scene(root1);
                    stage.setScene(scene1);
                    stage.show();
                    break;
                    
            case "MEDIO":
                                    
                    Parent root2 = FXMLLoader.load(getClass().getResource("/vistas/.fxml"));
                    Scene scene2 = new Scene(root2);
                    stage.setScene(scene2);
                    stage.show();
                    break;
                    
            case "DIFICIL":
                                    
                    Parent root3 = FXMLLoader.load(getClass().getResource("/vistas/.fxml"));
                    Scene scene3 = new Scene(root3);
                    stage.setScene(scene3);
                    stage.show();
                    break;       
                    
        }                                    

    }
    
    /**
     * Initializes the controller class.
     */
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("el total de estrellas es "+Contadores.getEstrellasFinales());
        
        
        System.out.println("-------------------estrellas del juego "+Contadores.getNumeroDeEstrellas());
        
                
        //puntos acomulados
        puntos.setText(String.valueOf(Contadores.getPuntos()));
        
        switch(Contadores.getNumeroDeEstrellas()){
            case 3:
                estrellaPerdida1.setVisible(true);
                estrellaPerdida2.setVisible(true);
                estrellaPerdida3.setVisible(true);
                estrellaPerdida4.setVisible(false);
                estrellaPerdida5.setVisible(false);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
                
                break;
                
            case 4:
                
                estrellaPerdida1.setVisible(false);
                estrellaPerdida2.setVisible(true);
                estrellaPerdida3.setVisible(true);
                estrellaPerdida4.setVisible(true);
                estrellaPerdida5.setVisible(true);
                estrella1.setVisible(false);
                
                break;
            case 5:
                estrellaPerdida1.setVisible(true);
                estrellaPerdida2.setVisible(true);
                estrellaPerdida3.setVisible(true);
                estrellaPerdida4.setVisible(true);
                estrellaPerdida5.setVisible(true);
                break;                
        }
        
        if(Contadores.getNumeroDeEstrellas()==3){
              switch(Contadores.getEstrellasFinales()){
                  
                case 0:
                    estrella1.setVisible(false);
                    estrella2.setVisible(false);
                    estrella3.setVisible(false);
                case 1:
                    estrella1.setVisible(false);
                    estrella2.setVisible(false);
                    estrella3.setVisible(true);
                    estrellaPerdida3.setVisible(false);     
                    break;
                case 2:
                    estrella1.setVisible(true);
                    estrella2.setVisible(true);
                    estrella3.setVisible(false);
                    estrellaPerdida1.setVisible(false);
                    estrellaPerdida2.setVisible(false);
                    estrellaPerdida3.setVisible(true);
                    break;
                    
     
              }
              
        }

    }    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;
import juegomemoriam.Contadores;


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
import juegomemoriam.iniciar;
 

/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class GanasteController implements Initializable  {
    @FXML
    private Label puntos;

   @FXML
    private Button btnSalir;
   
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
    private Button btnGanasteAceptar;
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
    void pasarnivel(ActionEvent event) throws IOException {
    

                                            nivel();
        
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
    
    public static void  nivel(){
        iniciar.Subirnivel();
        

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //puntos acomulados
        puntos.setText(String.valueOf(Contadores.getPuntos()));
        
        // TODO
        switch(Contadores.getNumeroDeEstrellas()){
            case 3:
                estrella1.setVisible(true);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
                
                break;
            case 4:
                estrella1.setVisible(false);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(true);
                estrella5.setVisible(true);
                break;
            case 5:
                estrella1.setVisible(true);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(true);
                estrella5.setVisible(true);
                break;
        }
        
    }    

    
}

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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriam.Contadores;
import juegomemoriam.iniciar;

/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class PerdisteController implements Initializable {
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
    void AceptarPerdida(ActionEvent event) throws IOException {
        nivel();
                                            Object eventSource= event.getSource();
                                            Node sourceAsNode = (Node) eventSource;
                                             Scene oldScene= sourceAsNode.getScene();
                                             Window window =oldScene.getWindow();
                                             Stage stage =(Stage) window;
                                             stage.hide();
                                            
                                             System.out.print("funciona");
                                            Parent root = FXMLLoader.load(getClass().getResource("/vistas/SeleccionDificultad.fxml"));
                                             Scene scene = new Scene(root);
                                             stage.setScene(scene);
                                             stage.show();
    }
    /**
     * Initializes the controller class.
     */
    
    public static void  nivel(){
        iniciar.reiniciarNivel();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("el total de estrellas es "+Contadores.getEstrellasFinales());
        switch(Contadores.getEstrellasFinales()){
            case 1:
                estrella1.setVisible(true);
                estrella2.setVisible(false);
                estrella3.setVisible(false);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
                
                estrellaPerdida1.setVisible(false);
                estrellaPerdida2.setVisible(true);
                estrellaPerdida3.setVisible(true);
                estrellaPerdida4.setVisible(true);
                estrellaPerdida5.setVisible(true);
                
                break;
            case 2:
                estrella1.setVisible(false);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
                
                estrellaPerdida1.setVisible(true);
                estrellaPerdida2.setVisible(false);
                estrellaPerdida3.setVisible(false);
                estrellaPerdida4.setVisible(true);
                estrellaPerdida5.setVisible(true);
                break;
            case 3:
                estrella1.setVisible(true);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(false);
                estrella5.setVisible(false);
                
                estrellaPerdida1.setVisible(false);
                estrellaPerdida2.setVisible(false);
                estrellaPerdida3.setVisible(false);
                estrellaPerdida4.setVisible(true);
                estrellaPerdida5.setVisible(true);
                break;
            case 4:
                estrella1.setVisible(false);
                estrella2.setVisible(true);
                estrella3.setVisible(true);
                estrella4.setVisible(true);
                estrella5.setVisible(true);
                
                estrellaPerdida1.setVisible(true);
                estrellaPerdida2.setVisible(false);
                estrellaPerdida3.setVisible(false);
                estrellaPerdida4.setVisible(false);
                estrellaPerdida5.setVisible(false);
                break;
        }
    }    
    
}

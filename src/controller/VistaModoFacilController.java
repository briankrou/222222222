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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import juegomemoriam.ComparadorDeCartas;
import juegomemoriam.Contadores;
import juegomemoriam.iniciar;
import juegomemoriam.juegoNuevo;
import juegomemoriam.sound;

/**
 * FXML Controller class
 *
 * @author BrianKrou
 */
public class VistaModoFacilController implements Initializable {

int nivelinicial;
    int cartasSeleccionadas=0;
    sound reproduce = new sound();

    iniciar nuevo=new iniciar();
    
    juegoNuevo[] arreglo=new juegoNuevo[2];
    @FXML
    private Label Puntos;
      @FXML
    private HBox contenedorA1;

    @FXML
    private HBox contenedorA2;

    @FXML
    private HBox contenedorA3;

    @FXML
    private HBox contenedorB1;

    @FXML
    private HBox contenedorB2;

    @FXML
    private HBox contenedorB3;
    
    @FXML
    private Label btnA1L1;
  

    @FXML
    private Label btnA1L2;

    @FXML
    private Label btnA1L3;

    @FXML
    private Label btnA2L1;

    @FXML
    private Label btnA2L2;

    @FXML
    private Label btnA2L3;

    @FXML
    private Label btnA3L1;

    @FXML
    private Label btnA3L2;

    @FXML
    private Label btnA3L3;

    @FXML
    private Label btnB1L1;

    @FXML
    private Label btnB1L2;

    @FXML
    private Label btnB1L3;

    @FXML
    private Label btnB2L1;

    @FXML
    private Label btnB2L2;

    @FXML
    private Label btnB2L3;

    @FXML
    private Label btnB3L1;

    @FXML
    private Label btnB3L2;

    @FXML
    private Label btnB3L3;
    
    @FXML
    private ImageView Estrella1;

    @FXML
    private ImageView Estrella2;

    @FXML
    private ImageView Estrella3;
    
    @FXML
    private Label labelDificultad;
    
    @FXML
    private Label Nivel;
    
    @FXML
    private Button btna1;

    @FXML
    private Button btna2;

    @FXML
    private Button btna3;

    @FXML
    private Button btnb1;

    @FXML
    private Button btnb2;

    @FXML
    private Button btnb3;
    
     
    
    
//valores carta
    
    

    int a1=0;
    int a2=0;
    int a3=0;
    int b1=0;
    int b2=0;
    int b3=0;
    
    //texto carta A1
    String TextA1L1,TextA1L2,TextA1L3;
    //texto carta A2
    String TextA2L1,TextA2L2="",TextA2L3;
    //texto carta A3
    String TextA3L1,TextA3L2="",TextA3L3;
    //texto carta B1
    String TextB1L1,TextB1L2="",TextB1L3;
    //texto carta B2
    String TextB2L1,TextB2L2="",TextB2L3;
    //texto carta B3
    String TextB3L1,TextB3L2="",TextB3L3;
  
    
    
 ////////////////////////// BOTON A1 /////////////////////////////
@FXML
void cartaElegidaA1(ActionEvent event) throws IOException {
   
    CartasSeleccionadas();
    
    contenedorA1.setVisible(true);

//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a1;                    //
//------------------------------------_--//

    eventoClick(valorCarta,ID);
    
    if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
        Object eventSource= event.getSource();
        Node sourceAsNode = (Node) eventSource;
        Scene oldScene= sourceAsNode.getScene();
        Window window =oldScene.getWindow();
        Stage stage =(Stage) window;
        stage.hide();
                
        if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
            abrirVistaGanaste(stage);
        }else{
            abrirVistaPerdiste(stage);
        }
        
    }

}
 ////////////////////////// BOTON A2 /////////////////////////////
@FXML
void cartaElegidaA2(ActionEvent event) throws IOException {
     ocultarCartas(); 
     contenedorA2.setVisible(true);
     
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON A3 /////////////////////////////
@FXML
void cartaElegidaA3(ActionEvent event) throws IOException {
         ocultarCartas(); 
    contenedorA3.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "a3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=a3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
                                Contadores.setEstrellasFinales(nuevo.getEstrellasOptenidas());
                               
                             
       //*****SI LAS CARTAS ESTAN COMPLETAS
                            
                        //CIERRA LA INTERFAS ACTUAL
                                            
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                        //INICIA SIGUIENTE INTERFAS
                                             
                                //Comprueba las estrellas del juego para decidir que interfas iniciar
                                             
                if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            
                
            }
            //*******SI LAS CARTAS NO ESTAN COMPLETAS  CONTINUA EL JUEGO 
        
}

 ////////////////////////// BOTON B1 /////////////////////////////
@FXML
void cartaElegidaB1(ActionEvent event) throws IOException {
     ocultarCartas(); 
    contenedorB1.setVisible(true);
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b1";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b1;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B2 /////////////////////////////

@FXML
void cartaElegidaB2(ActionEvent event) throws IOException {
 CartasSeleccionadas();
    contenedorB2.setVisible(true);
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b2";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b2;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}
 ////////////////////////// BOTON B3 /////////////////////////////

@FXML
void cartaElegidaB3(ActionEvent event) throws IOException {
 CartasSeleccionadas();
    contenedorB3.setVisible(true);
   
    
   
//--------------VALORES DE LA CARTA------//   
//VALOR ID UNICO DEL BOTON               //
    String ID = "b3";                    //
                                         //
//VALOR DEL BOTON                        //   
    int valorCarta=b3;                    //
//------------------------------------_--//

            eventoClick(valorCarta,ID);
            if(nuevo.getNumeroDeCartas()==nuevo.getCartasOptenidas()){
                
                Object eventSource= event.getSource();
                Node sourceAsNode = (Node) eventSource;
                Scene oldScene= sourceAsNode.getScene();
                Window window =oldScene.getWindow();
                Stage stage =(Stage) window;
                stage.hide();
                
                System.out.print("estrellas optenidas"+ nuevo.getEstrellasOptenidas()+"  ");
                if(nuevo.getEstrellasOptenidas()==nuevo.getNumeroDeEstrellas()){
                    abrirVistaGanaste(stage);
                }else{
                    abrirVistaPerdiste(stage);
                }
                
            }
            
        
}

     int contador=0;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     //INICIA LOS VALORES DEL JUEGO
            //puntos acomulados
            Puntos.setText(String.valueOf(Contadores.getPuntos()));
     
            crearCartas();
            nuevo.reiciarEstrellasOptenidas();
            
  
            //muestra el valor de la dificultad
            labelDificultad.setText(Contadores.getDificultad());
            
            //inicia el numero de estrellas que hay que optener en el juego
            Contadores.setNumeroDeEstrellas(3);

            //Asignamos el numero de cartas del juego
            nuevo.setNumeroDeCartas(3);
                      
            // muestra el valor de dficultad 
            Nivel.setText(String.valueOf(Contadores.getNivel()));
            
            //muestra las estrellas iniciales Optenidas
            mostrarestrella(nuevo.getEstrellasOptenidas());
            
            //ocultar cartas
             ocultarCartas();

            
            //VALORES DE CARTA FILA A
              btnA1L1.setText(TextA1L1);btnA1L2.setText(TextA1L2);btnA1L3.setText(TextA1L3);
              btnA2L1.setText(TextA2L1);btnA2L2.setText(TextA2L2);btnA2L3.setText(TextA2L3); 
              btnA3L1.setText(TextA3L1);btnA3L2.setText(TextA3L2);btnA3L3.setText(TextA3L3);
              
            //VALORES DE CARTA FILA B
              btnB1L1.setText(TextB1L1);btnB1L2.setText(TextB1L2);btnB1L3.setText(TextB1L3);
              btnB2L1.setText(TextB2L1);btnB2L2.setText(TextB2L2);btnB2L3.setText(TextB2L3); 
              btnB3L1.setText(TextB3L1);btnB3L2.setText(TextB3L2);btnB3L3.setText(TextB3L3);

    }   
    
    
    public void CartasSeleccionadas(){
        
        if(ComparadorDeCartas.getValorCarta1()==0&&ComparadorDeCartas.getValorCarta2()==0){
            
            ocultarCartas(); 
        
        }
    }
           
    public void eventoClick(int valorCarta,String ID){
        
        if(ComparadorDeCartas.asignarvalorCartasSeleccionadas(valorCarta,ID)){
            
            if(ComparadorDeCartas.ComparaCartas()){//<<---Cartas son iguales?
              
                sonIguales();  
            
            }else{
                
                NoSonIguales();   
            }
                
        }
    
    }

    public void abrirVistaGanaste(Stage stage) throws IOException{
            System.out.println("Abre venta ganaste ");
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/Ganaste.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

    }
    
    public void abrirVistaPerdiste(Stage stage) throws IOException{
            System.out.print("la estrellas cargan "+nuevo.getEstrellasOptenidas());
            Contadores.setEstrellasFinales(nuevo.getEstrellasOptenidas());
            System.out.println("Abre venta Perdiste ");
            Parent root = FXMLLoader.load(getClass().getResource("/vistas/Perdiste.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            
    }
    public void NoSonIguales(){
        
        System.out.println("No son iguales");
        nuevo.disminuirNumeroDeEstrellasOptenidas();
        mostrarestrella(nuevo.getEstrellasOptenidas());
       Contadores.RestarPuntos();
        Puntos.setText(String.valueOf(Contadores.getPuntos()));
        ComparadorDeCartas.reiniciarCartas();
 
        
                       
    }
    public void sonIguales(){ 
        System.out.println("son iguales ");
        nuevo.sumarCartasOptenidas();
        nuevo.aumentarNumeroDeEstrellasOptenidas();
        System.out.print("Las estreñas optenidaso son ---->"+nuevo.getEstrellasOptenidas());
        mostrarestrella(nuevo.getEstrellasOptenidas());
        eliminarCarta1();
        eliminarCarta2();
        Contadores.SumarPuntos();

         Puntos.setText(String.valueOf(Contadores.getPuntos()));
        ComparadorDeCartas.reiniciarCartas();
        
    }
    
 //METODO QUE MUESTRA O OCULTA  ESTRELLA EN LA INTERFAS GRAFICA
    
   public void mostrarestrella(int num){
        switch(num){
            case 0:
            System.out.println("mostramos 0 estrellas");
                  Estrella1.setVisible(false);
                  Estrella2.setVisible(false);
                  Estrella3.setVisible(false);   
                  break;
            case 1:
            System.out.println("mostramos 1 estrella");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(false);
                  Estrella3.setVisible(false);   
                  break;
            case 2:
            System.out.println("mostramos 2 estrellas");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(true);
                  Estrella3.setVisible(false);   
                  break;
            case 3:
            System.out.println("mostramos 3 estrellas");
                  Estrella1.setVisible(true);
                  Estrella2.setVisible(true);
                  Estrella3.setVisible(true);   
                  break;
      
        }

    }
            juegoNuevo Carta1=new juegoNuevo();
            juegoNuevo Carta2=new juegoNuevo();
            juegoNuevo Carta3=new juegoNuevo();

//metood que crea y reparte cartas
    public void crearCartas(){
        
        
        Carta1.juegoNuevo(1);
        Carta2.juegoNuevo(2);
        Carta3.juegoNuevo(3);
                  carta1(Carta1);
                  carta1(Carta2);
                  carta1(Carta3);
                  
                  
            
        

        
}

    public void carta1(juegoNuevo Carta){
                System.out.println("INICIAAAA CARTA ------------------1");
            int contador2=0;

        while(contador2<1){
            switch(nuevo.numeroaleatorio("FACIL")){
                case 0:
                       
                    if(a1==0){
                        System.out.println("1>>>carta A1 es "+a1);

                        TextA1L1=String.valueOf(Carta.getNumero1());
                        TextA1L2=Carta.getOperador();
                        TextA1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1----carta A1 es "+Carta.getResultado());
                        a1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                    
                case 1:
                    if(a2==0){
                        System.out.println("1>>>carta A2 es "+a2);

                        TextA2L1=String.valueOf(Carta.getNumero1());
                        TextA2L2=Carta.getOperador();
                        TextA2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta A2 es "+Carta.getResultado());
                        a2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 2:
                    if(a3==0){
                        System.out.println("1>>>carta A3 es "+a3);
                        
                        TextA3L1=String.valueOf(Carta.getNumero1());
                        TextA3L2=Carta.getOperador();
                        TextA3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta A3 es "+Carta.getResultado());
                        a3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 3:
                    if(b1==0){
                        System.out.println("1>>>carta B1 es "+b1);
                        
                        TextB1L1=String.valueOf(Carta.getNumero1());
                        TextB1L2=Carta.getOperador();
                        TextB1L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B1 es "+Carta.getResultado());
                        b1=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 4:
                    if(b2==0){
                        System.out.println("1>>>carta B2 es "+b2);
                        
                        TextB2L1=String.valueOf(Carta.getNumero1());
                        TextB2L2=Carta.getOperador();
                        TextB2L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B2 es "+Carta.getResultado());
                        b2=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
                case 5:
                    if(b3==0){
                        System.out.println("1>>>carta B3 es "+b3);
                        
                        TextB3L1=String.valueOf(Carta.getNumero1());
                        TextB3L2=Carta.getOperador();
                        TextB3L3=String.valueOf(Carta.getNumero2());
                    
                        System.out.println("1---carta B3 es "+Carta.getResultado());
                        b3=Carta.getResultado();
                        PosicionaCarta2(Carta);
                        contador2++;
                        break;
                    }
            }   
        }
    }

    
  
            int contador3=0;
    public void PosicionaCarta2(juegoNuevo Carta){

     System.out.println("INICIAAAA CARTA----------------- 2");
     
            int contador2=0;

        while(contador2<1){
            switch(nuevo.numeroaleatorio("FACIL")){
                
                case 0:
                    if(a1==0){
                        System.out.println("2>>>carta A1 es "+a1);
                           
                        TextA1L2=String.valueOf(Carta.getResultado());
                        a1=Carta.getResultado();
                        System.out.println("2---carta A1 es "+a1); 
                        contador2++;
                        break;
                    }

                case 1:
                    if(a2==0){
                        System.out.println("2>>>carta A2 es "+a2);
                        TextA2L2=String.valueOf(Carta.getResultado());
                        a2=Carta.getResultado();
                         System.out.println("2---carta A2 es "+a2); 
                         contador2++;
           
                        break;
                    }
                case 2:
                    if(a3==0){
                        System.out.println("2>>>carta A3 es "+a3);  
                        TextA3L2=String.valueOf(Carta.getResultado());
                        a3=Carta.getResultado();
                         System.out.println("2---carta A3 es "+a3); 
                         contador2++;
           
                        break;
                    }
                case 3:
                    if(b1==0){
                        System.out.println("2>>>carta B1 es "+b1);  
                        TextB1L2=String.valueOf(Carta.getResultado());
                        b1=Carta.getResultado();
                         System.out.println("2---carta B1 es "+b1);
                         contador2++;
                  
                        break;
                    }
                case 4:
                    if(b2==0){
                        System.out.println("2>>>carta B2 es "+b2);    
                        TextB2L2=String.valueOf(Carta.getResultado());
                        b2=Carta.getResultado();
                        System.out.println("2---carta B2 es "+b2); 
                        contador2++;
           
                        break;
                    }
                case 5:
                    if(b3==0){
                        System.out.println("2>>>carta B3 es "+b3);  
                        TextB3L2=String.valueOf(Carta.getResultado());
                        b3=Carta.getResultado();
                        System.out.println("2---carta B3 es "+b3); 
                        contador2++;
                
                        break;
                    }
            
     }
    }}


        

    //METODO QUE OCULTA CARTAS
    
    public void ocultarCartas(){
        System.out.println("--Ocultando cartas--");
        
            contenedorA1.setVisible(false);contenedorA2.setVisible(false);contenedorA3.setVisible(false);
            contenedorB1.setVisible(false);contenedorB2.setVisible(false);contenedorB3.setVisible(false);
    }
    
    //metodo que elimina la primer carta y invoca al metodo para eliminar la segunda carta 
    public void eliminarCarta1(){
        System.out.println("Elimina carta 1 con ID: "+ComparadorDeCartas.getIDcarta1());
        switch(ComparadorDeCartas.getIDcarta1()){
            case "a1":
          
               btna1.setVisible(false);
               break;
            case "a2":
                
                btna2.setVisible(false);
                break;
            case "a3":
               
                btna3.setVisible(false);
                break;
            case "b1":
                
                btnb1.setVisible(false);
                break;
            case "b2":
                
                btnb2.setVisible(false);
                break;
        
            case "b3":
               
                 btnb3.setVisible(false);
                break;
               
        }
    }
    
    
    
    
    //metodo que elimina la segunda carta
    public void eliminarCarta2(){
           System.out.println("Elimina carta 2 con ID: "+ComparadorDeCartas.getIDcarta2());
        switch(ComparadorDeCartas.getIDcarta2()){
            case "a1":
                btna1.setVisible(false);
                break;
            case "a2":
                btna2.setVisible(false);
                break;
            case "a3":
                btna3.setVisible(false);
                break;
            case "b1":
                btnb1.setVisible(false);
                break;
            case "b2":
                btnb2.setVisible(false);
                break;
            case "b3":
                btnb3.setVisible(false);
                break;
        }
        
    }

    
    

}
  


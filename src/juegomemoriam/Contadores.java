/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriam;


/**
 *
 * @author BrianKrou
 */

//Esta clse permite crear  instancias para el funcionamiento del juego menos el nivel que es satic para todo el juego
public class Contadores {
    
    
//------------------------------------------------------variables------------------------------------------------------------- 
static int nivel=0;

String Dificultad;

int carta1=0;

int carta2=0;

String IDcarta1="";

String IDcarta2="";

int Estrellasoptenidas; 

static int EstrelalsoptenidasFinales;

static int NumeroDeEstrellas;

int cartasOptenidas=0;

int  numeroDeCartas;

//------------------------------------------------------Metodos Get------------------------------------------------------------


// RETORNA EL NUMERO DE ESTRELLAS DEL JUEGO SEGUN EL NIVEL 
public static  int getNumeroDeEstrellas(){
    return NumeroDeEstrellas;
}
//RETORNA EL NUMERO DE ESTRELLAS OPTENIDAS 
public  int getEstrellasOptenidas(){
    return Estrellasoptenidas;
}

//METODO RETORNA NUMERO DE ESTRELLAS DEL JUEGO 
public static  void setNumeroDeEstrellas(int num){
    NumeroDeEstrellas=num;
}
//RETORNA LAS ESTRELLAS FINALES 
public static int getEstrellasFinales(){
    return EstrelalsoptenidasFinales;
}
//RETORNA NUMERO DE CARYAS DEL JUEGO SEGUN EL NIVEL 

public int getNumeroDeCartas(){
    return numeroDeCartas;
}
// CAMBIA EL NUMERO DE CARTAS QUE HAY QUE DESTAPAR 

public void setNumeroDeCartas(int num){
    numeroDeCartas=num;
}

//REINICIA LAS ESTRELLAS OPTENIDAS 
public  void reiciarEstrellasOptenidas(){
    
    Estrellasoptenidas=0;
    
    System.out.print("recinicai estrellas a "+Estrellasoptenidas);
}

//RETORNA EL NIVEL DEL JUEGO
public static int getNivel(){
    return nivel;
}
//REINICIA LAS CARTAS ELEGIDAS 1 Y 2
public  void ReiniciarCartas(){
    carta1=0;
    carta2=0;
    IDcarta1="";
    IDcarta2="";
    
    System.out.println("Reinicia carta 1 a valor : "+carta1+" y ID "+IDcarta1+"\ncarta 2 a valor: "+carta2+" y ID "+IDcarta2);
}
///-----------------------------------------------------Metodos Set-----------------------------------------------------------




//METODO CAMBIA LAS ESTRELLAS FINAL DEL JUEGO PARA MOSTRAR CUANDO GANA O PIERDE 
public static void setEstrellasFinales(int num){
    EstrelalsoptenidasFinales=num;
}



//METODO AYUDO AUMENTA LAS ESTRELLAS 
public  void aumentarNumeroDeEstrellasOptenidas(){

        if(Estrellasoptenidas<getNumeroDeEstrellas()){
            
            System.out.print("Estrellas a optenr cuando suma "+getNumeroDeEstrellas());
            Estrellasoptenidas++; 
        }
       
    

}

//METODO RESTA ESTRELLAS 
public void disminuirNumeroDeEstrellasOptenidas(){
    System.out.println("menos una estrella");
    
       if(Estrellasoptenidas>0){
           Estrellasoptenidas--;
       }
        
}






//SUMA A EL CONTADOR DE CARTAS OPTENIDAS A MEDIA QUE LAS ENCUENTRA 

public  void sumarCartasOptenidas(){
    cartasOptenidas++;
}

//RESTONA EL NUMERO DE CARTAS OPTENIDAS 

public  int  getCartasOptenidas(){
    
    return cartasOptenidas;
    
}
//CAMBIA EL 
public  void cambiarIdCarta1(String id){
    IDcarta1=id;
}
//CAMBIA EL VALOR DEL ID DE LA CARTA 2 PARA POSTERIO COMPARAR 
public void cambiarIdCarta2(String id){
    IDcarta2=id;
}
//RETORNA EL VALOR DEL ID DE LA CARTA 1
public String valorIdCarta1(){
    return IDcarta1;
}
//RETORNA EL VALOR DEL ID DE LA CARTA 2
public  String valorIdCarta2(){
    return IDcarta2;
}
//SUBE EL NIVEL A MEDIAD QUE GANA 
public static void  Subirnivel(){
    nivel++;
}
//REINICIA EL CONTADOR DE NIVELES 
public static void reiniciarNivel(){
    nivel=0;
}

//CAMBIA EL TEXTO DE DIFICULTAD 
public  void CambiarDificultad(String dificultad){
    Dificultad=dificultad;
}
//RETORNA EL VALOR DEL TEXTO DE DIFICULTAD
public   String getDificultad(){
    return Dificultad;
}
//CAMBIA EL VALOR DE LA CARTA 1 QUE ES PARA COMPARAR CARTAS SELECCIONADAS
public  void CambiarValorCarta1(int num){
    carta1=num;
}
//CAMBIA EL VALOR DE LA CARTA 2 QUE ES PARA COMPARAR CARTAS SELECCIONADAS
public  void CambiarValorCarta2(int num){
    carta2=num;
}
//RETORNA EL CALOR DE LA CARTA 1 QUE ES PARA COMPARAR CARTAS SELECCIONADAS
public  int valorcata1(){
    return carta1;
}
//RETORNA EL VALOR DE LA CARTA 2 QUE ES PARA COMPARAR CARTAS SELECCIONADAS
public int valorcata2(){
    return carta2;
}



    
}

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
    
    
//variables 
static int nivel=0;

String Dificultad;

int carta1=0;

int carta2=0;

String IDcarta1;

String IDcarta2;
static int Estrellasoptenidas; 
static int EstrelalsoptenidasFinales;

int NumeroDeEstrellas;
int cartasOptenidas=0;
int  numeroDeCartas;

//------------------------------------------------


// RETORNA EL NUMERO DE ESTRELLAS DEL JUEGO SEGUN EL NIVEL 
public  int getNumeroDeEstrellas(){
    return NumeroDeEstrellas;
}
//RETORNA EL NUMERO DE ESTRELLAS OPTENIDAS 
public  int getEstrellasOptenidas(){
    return Estrellasoptenidas;
}

//METODO AYUDO AUMENTA LAS ESTRELLAS 
public  void aumentarNumeroDeEstrellasOptenidas(){
    System.out.println("aumenta las estrella");
        Estrellasoptenidas++;

}
//METODO RETORNA NUMERO DE ESTRELLAS DEL JUEGO 
public  void setNumeroDeEstrellas(int num){
    NumeroDeEstrellas=num;
}
//METODO RESTA ESTRELLAS 
public void disminuirNumeroDeEstrellasOptenidas(){
    System.out.println("menos las estrella");
        Estrellasoptenidas--;
        
}
//METODO CAMBIA LAS ESTRELLAS FINAL DEL JUEGO PARA MOSTRAR CUANDO GANA O PIERDE 
public static void setEstrellasFinales(int num){
    EstrelalsoptenidasFinales=num;
}

//RETORNA LAS ESTRELLAS FINALES 
public static int getEstrellasFinales(){
    return EstrelalsoptenidasFinales;
}

//REINICIA LAS ESTRELLAS OPTENIDAS 
public  static void reiciarEstrellasOptenidas(){
    Estrellasoptenidas=0;
}
//RETORNA NUMERO DE CARYAS DEL JUEGO SEGUN EL NIVEL 
public int getNumeroDeCartas(){
    return numeroDeCartas;
}
// CAMBIA EL NUMERO DE CARTAS QUE HAY QUE DESTAPAR 
public void setNumeroDeCartas(int num){
    numeroDeCartas=num;
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
//RETORNA EL NIVEL DEL JUEGO
public static int getNivel(){
    return nivel;
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

//REINICIA LAS CARTAS ELEGIDAS 1 Y 2
public  void ReiniciarCartas(){
    carta1=0;
    carta2=0;
}

    
}

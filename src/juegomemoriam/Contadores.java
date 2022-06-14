/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriam;


/**
 *
 * @author BrianKrou
 */
public class Contadores {
    
    

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

public  int getNumeroDeEstrellas(){
    return NumeroDeEstrellas;
}
public  void setNumeroDeEstrellas(int num){
    NumeroDeEstrellas=num;
}
public  int getEstrellasOptenidas(){
    return Estrellasoptenidas;
}
public  void aumentarNumeroDeEstrellasOptenidas(){
    System.out.println("aumenta las estrella");
        Estrellasoptenidas++;

}
public void disminuirNumeroDeEstrellasOptenidas(){
    System.out.println("menos las estrella");
        Estrellasoptenidas--;
        
}
public static void setEstrellasFinales(int num){
    EstrelalsoptenidasFinales=num;
}
public static int getEstrellasFinales(){
    return EstrelalsoptenidasFinales;
}
public  static void reiciarEstrellasOptenidas(){
    Estrellasoptenidas=0;
}

public int getNumeroDeCartas(){
    return numeroDeCartas;
}
public void setNumeroDeCartas(int num){
    numeroDeCartas=num;
}

public  void sumarCartasOptenidas(){
    cartasOptenidas++;
}
public  int  getCartasOptenidas(){
    return cartasOptenidas;
}
public  void cambiarIdCarta1(String id){
    IDcarta1=id;
}

public void cambiarIdCarta2(String id){
    IDcarta2=id;
}

public String valorIdCarta1(){
    return IDcarta1;
}

public  String valorIdCarta2(){
    return IDcarta2;
}

public static void  Subirnivel(){
    nivel++;
}
public static void reiniciarNivel(){
    nivel=0;
}

public static int getNivel(){
    return nivel;
}
public  void CambiarDificultad(String dificultad){
    Dificultad=dificultad;
}
public   String getDificultad(){
    return Dificultad;
}

public  void CambiarValorCarta1(int num){
    carta1=num;
}
public  void CambiarValorCarta2(int num){
    carta2=num;
}
public  int valorcata1(){
    return carta1;
}

public int valorcata2(){
    return carta2;
}

//rinicia Cartas Elegidas
public  void ReiniciarCartas(){
    carta1=0;
    carta2=0;
}

    
}

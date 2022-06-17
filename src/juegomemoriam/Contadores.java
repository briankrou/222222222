/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriam;

import java.util.Random;


/**
 *
 * @author BrianKrou
 */

//Esta clse permite crear  instancias para el funcionamiento del juego menos el nivel que es satic para todo el juego
public class Contadores {
    
    
//------------------------------------------------------variables------------------------------------------------------------- 
static int nivel=0;

static String Dificultad;



int Estrellasoptenidas; 

static int EstrelalsoptenidasFinales;

static int NumeroDeEstrellas;

int cartasOptenidas=0;

int  numeroDeCartas;
static int  puntos;

//------------------------------------------------------Metodos Get------------------------------------------------------------
//SUMA PUNTOS POR CANTAS ENCONTRADAS 
public static void SumarPuntos(){
    puntos=puntos+10;
}

public static void RestarPuntos(){
    if(getPuntos()>0){
        puntos=puntos-10;
    }
    
}
public static void ReiniciarPuntos(){

        puntos=0;

}

public  static int getPuntos(){
    return puntos;
}

// RETORNA EL NUMERO DE ESTRELLAS DEL JUEGO SEGUN EL NIVEL 
public static  int getNumeroDeEstrellas(){
    return NumeroDeEstrellas;
}

//METODO RETORNA NUMERO DE ESTRELLAS DEL JUEGO 
public static  void setNumeroDeEstrellas(int num){
    NumeroDeEstrellas=num;
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
//SUBE EL NIVEL A MEDIAD QUE GANA 
public static void  Subirnivel(){
    nivel++;
}
//REINICIA EL CONTADOR DE NIVELES 
public static void reiniciarNivel(){
    nivel=0;
}

//SUMA A EL CONTADOR DE CARTAS OPTENIDAS A MEDIA QUE LAS ENCUENTRA 

public  void sumarCartasOptenidas(){
    cartasOptenidas++;
}

///-----------------------------------------------------Metodos Set-----------------------------------------------------------

//RETORNA EL NUMERO DE ESTRELLAS OPTENIDAS 
public  int getEstrellasOptenidas(){
    return Estrellasoptenidas;
}

//RETORNA LAS ESTRELLAS FINALES 
public static int getEstrellasFinales(){
    return EstrelalsoptenidasFinales;
}
//RETORNA NUMERO DE CARYAS DEL JUEGO SEGUN EL NIVEL 

public int getNumeroDeCartas(){
    return numeroDeCartas;
}
//RETORNA EL NIVEL DEL JUEGO
public static int getNivel(){
    return nivel;
}

//RESTONA EL NUMERO DE CARTAS OPTENIDAS 

public  int  getCartasOptenidas(){
    
    return cartasOptenidas;
    
}



//CAMBIA EL TEXTO DE DIFICULTAD 
public static  void CambiarDificultad(String dificultad){
    Dificultad=dificultad;
}
//RETORNA EL VALOR DEL TEXTO DE DIFICULTAD
public static  String getDificultad(){
    return Dificultad;
}



    public static int numeroaleatorio(String dificultad){
        int n=0;
        switch(dificultad){
            
            case "FACIL":
                n=5;
        }
                Random rd = new Random();
                int numeroAleatorio = rd.nextInt(n);
                System.out.println("nuemero aleatorio "+numeroAleatorio);
                return numeroAleatorio;
    }


    
}

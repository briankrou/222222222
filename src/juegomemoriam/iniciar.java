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
public class iniciar extends Contadores{

    public int numeroaleatorio(String dificultad){
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegomemoriam;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author BrianKrou
 */
public class sound {
    File click = new File("clicksound.mp3");//creamos un objeto file
    String sclick="/"+click.getAbsolutePath();//ruta del ejecutable
    
    MediaPlayer mediaplayer;
    
    public void sonidoClick(){
     sclick= sclick.replace("\\","/");
     Media musicFile=new Media(sclick);
     mediaplayer=new MediaPlayer(musicFile);
     mediaplayer.play();
    }

}

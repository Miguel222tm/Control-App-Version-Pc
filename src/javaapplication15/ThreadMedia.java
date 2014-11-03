/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication15.ThreadFunciones.mouse;

/**
 *
 * @author Miguel
 */
public class ThreadMedia extends Thread{
     MainHome  Main= new MainHome();
          static Robot media;
          String texto="";
          int type=0;
          
          @Override
             public void run(){
                 
                 try{
		  media = null;   

             try {
                 media = new Robot();
                 
                  
            } catch (AWTException ex) {
                    Logger.getLogger(ThreadTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
             Thread.sleep(100);
         texto= Main.getText();
         type=Main.getMediaType();
         if(type==1){
             if(texto.contains("backward")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                  media.keyPress(KeyEvent.VK_SHIFT);
                 media.keyPress(KeyEvent.VK_B);
                 media.keyRelease(KeyEvent.VK_SHIFT);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("previous")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_B);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("stop")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_S);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("play-pause")){
                 media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_P);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("forward")){
                 media.keyPress(KeyEvent.VK_CONTROL);
                  media.keyPress(KeyEvent.VK_SHIFT);
                 media.keyPress(KeyEvent.VK_F);
                 media.keyRelease(KeyEvent.VK_SHIFT);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                  
             }if(texto.contains("next")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_F);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("volumedown")){
                 media.keyPress(KeyEvent.VK_F8);
                 
             }if(texto.contains("mute")){
                 media.keyPress(KeyEvent.VK_F7);
                 

             }if(texto.contains("volumeup")){
            media.keyPress(KeyEvent.VK_F9);

             }
             
         }
         if(type==2){
             if(texto.contains("backward")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_LEFT);
                 media.keyRelease(KeyEvent.VK_CONTROL);
             }if(texto.contains("previous")){
                 media.keyPress(KeyEvent.VK_P);
             }if(texto.contains("stop")){
                 media.keyPress(KeyEvent.VK_S);
                 
             }if(texto.contains("play-pause")){
                 media.keyPress(KeyEvent.VK_SPACE);
                 
             }if(texto.contains("forward")){
                  media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_RIGHT);
                 media.keyRelease(KeyEvent.VK_CONTROL);
             }if(texto.contains("next")){
                 media.keyPress(KeyEvent.VK_N);
             }if(texto.contains("volumedown")){
                media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_DOWN);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }if(texto.contains("mute")){
                 media.keyPress(KeyEvent.VK_M);
                 
             }if(texto.contains("volumeup")){
                 media.keyPress(KeyEvent.VK_CONTROL);
                 media.keyPress(KeyEvent.VK_UP);
                 media.keyRelease(KeyEvent.VK_CONTROL);
                 
             }
             
         }
             
             
             
                 
                 }catch (Exception e){
                     
                 }   
                 
             }
}

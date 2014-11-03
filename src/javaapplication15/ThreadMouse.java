/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.Spring.width;


/**
 *
 * @author Itic
 */
 class ThreadMouse  extends Thread{
     
     
          MainHome  Main= new MainHome();
          static Robot mouse;
          String texto="";
          
          int X=0;
          int Y=0;
       
          @Override
             public void run(){
                 
	  try {
		  mouse = null;   
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                  int width = (int) screenSize.getWidth();
                     int height = (int) screenSize.getHeight();
                     
                  
        
             try {
                 mouse = new Robot();
                 
                  
            } catch (AWTException ex) {
                    Logger.getLogger(ThreadTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
             
              
                
               Thread.sleep(100);
            
            
            
              
            
         if(texto.contains("Right-Click")){
                 mouse.mousePress(InputEvent.BUTTON3_MASK);
                 mouse.mouseRelease(InputEvent.BUTTON3_MASK);
              }
              else if (texto.contains("Left-Click")){
                     mouse.mousePress(InputEvent.BUTTON1_MASK);
                     Thread.sleep(20);
                  mouse.mouseRelease(InputEvent.BUTTON1_MASK);
              }
              else if(texto.contains("ScrollDown")){
                  mouse.mouseWheel(1);
                  Thread.sleep(200);
              } else if( texto.contains("ScrollUp")){
                  mouse.mouseWheel(-1);
                   Thread.sleep(200);
              }
         if(Main.getMouseX()!=X && Main.getMouseY()!=Y){
              mouse.mouseMove(MouseInfo.getPointerInfo().getLocation().x+(Main.getMouseX()/15), MouseInfo.getPointerInfo().getLocation().y+(Main.getMouseY()/15));
            
          }
              
                         
              
              
              X=Main.getMouseX();
            Y=Main.getMouseY();
              texto= Main.getText();
       
        } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
   // static String boton;
        //System.out.println(Thread.currentThread()); 
    }
             
          

 
    
}

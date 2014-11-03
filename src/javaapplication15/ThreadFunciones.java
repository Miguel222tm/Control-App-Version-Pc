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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.Spring.width;


/**
 *
 * @author Itic
 */
 class ThreadFunciones  extends Thread{
     
     
          MainHome  Main= new MainHome();
          static Robot mouse;
          String texto="";
       
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
         texto= Main.getText();
            
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
              } else if(texto.contains("lockscreen")){
                     try {
                          Runtime.getRuntime().exec("rundll32 user32.dll,LockWorkStation");
                      } catch (IOException ex) {
                          System.err.println(ex);
                      }
              }else if( texto.contains("shutdown")){
                  String shutdownCmd = "shutdown -s -t 5";
                      try {
                          Runtime.getRuntime().exec(shutdownCmd);
                      } catch (IOException ex) {
                          Logger.getLogger(ThreadFunciones.class.getName()).log(Level.SEVERE, null, ex);
                      }
              }else if( texto.contains("restart")){
                     try {
                          Runtime.getRuntime().exec("shutdown -r -t 5");
                      } catch (IOException ex) {
                          Logger.getLogger(ThreadFunciones.class.getName()).log(Level.SEVERE, null, ex);
                      }
              }
                     else if (texto.contains("logout")){
                             try{
                                 Runtime.getRuntime().exec("shutdown -l");
                             }catch (IOException e){
                                 System.err.println(e);
                             }
                  } else if (texto.contains("hibernate")){
                          try{
                                 Runtime.getRuntime().exec("shutdown -h");
                             }catch (IOException e){
                                 System.err.println(e);
                             }
                          
                  }else if(texto.contains("backslider")){
                                  mouse.keyPress(KeyEvent.VK_LEFT);
                                  }
                  else if(texto.contains("nextslider")){
                      mouse.keyPress(KeyEvent.VK_RIGHT);
                  }
              
              
         
             
              
       
        } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
   // static String boton;
        //System.out.println(Thread.currentThread()); 
    }
             
          

 
    
}

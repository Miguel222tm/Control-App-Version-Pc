/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.StreamConnection;


public class ProcessConnectionThread implements Runnable{

	private StreamConnection mConnection;
	
	// Constant that indicate command from devices
	private static final int EXIT_CMD = -1;
	private static final int KEY_RIGHT = 1;
	private static final int KEY_LEFT = 2;
        MainHome home=new MainHome();
	InputStream inputStream =null; 
        String msg="";
       Container container;

	public ProcessConnectionThread(StreamConnection connection)
	{
		mConnection = connection;
	}
        
        
	
	@Override
	public void run() {
		try {
			inputStream=mConnection.openInputStream();
			System.out.println("waiting for input");     
	        while (true) {
                            msg=RecieveMessages();
                                 System.out.println("mensaje: "+msg);
                                 
                        if(msg.contains("FuncionWrite.class")){
                         
                            home.jLabel3.setText("sx");
                            System.out.println("entro");
                        
                          
                        }
                                    if(msg.startsWith("Write")){       
                         String startPosition= msg;
                             String[] arrayStartPosition= new String[3];
                                     arrayStartPosition=startPosition.split("xel'ha,");
                                        home.setText(arrayStartPosition[1].trim());
                                        ThreadTexto texto= new ThreadTexto();
                                        texto.start();
                              // System.out.println("entro");
              }if (msg.startsWith("0")){
                  String startPosition= msg;
                             String[] arrayStartPosition= new String[3];
                                     arrayStartPosition=startPosition.split(",");
                                        home.setMouseX(Integer.parseInt(arrayStartPosition[1]));
                                         home.setMouseY(Integer.parseInt(arrayStartPosition[2]));
                                        ThreadMouse mouse= new ThreadMouse();
                                        mouse.start();
              }if (msg.startsWith("f")){
                    String funcion= msg;
                             String[] arrayfuncion= new String[3];
                                     arrayfuncion=funcion.split(",");
                                        home.setText(arrayfuncion[1].trim());
                                        ThreadFunciones func= new ThreadFunciones();
                                        func.start();
              } if(msg.startsWith("System")){
                   String funcion= msg;
                             String[] arrayfuncion= new String[3];
                                     arrayfuncion=funcion.split(",");
                                        home.setText(arrayfuncion[1].trim());
                                        ThreadFunciones func= new ThreadFunciones();
                                        func.start();   
              
              }if(msg.startsWith("FuncionMediaPlayer.class")){
                home.setMediaType(1);
              }
              if(msg.startsWith("FuncionVLC.class")){
                  home.setMediaType(2);
              }
              if(msg.startsWith("Media")){
                String media= msg;
                  String[] arraymedia= new String [3];
                    arraymedia=media.split(",");
                    home.setText(arraymedia[1].trim());
                    ThreadMedia mediaf= new ThreadMedia();
                    mediaf.start();
                    
              }if(msg.startsWith("Presentation")){
                  String funcion= msg;
                             String[] arrayfuncion= new String[3];
                                     arrayfuncion=funcion.split(",");
                                        home.setText(arrayfuncion[1].trim());
                                        ThreadFunciones func= new ThreadFunciones();
                                        func.start();   
              }
                
              
                
                
    	}
                }catch (NullPointerException nell){
                    System.err.println("entra en el primer null pointer exception");
                }
        catch (Exception e) {
    		e.printStackTrace();
    	}
               
	}
        
        
	
	
        public String  RecieveMessages(){
            byte[] data = null;

                try   {      
                  int length = inputStream.read();
                   data       = new byte[length];
                         length     = 0;
                          if (length != data.length)
                                 {
                                 int ch = inputStream.read(data,0, data.length);
                                      if (ch == -1)
                                     {
                                           throw new IOException("Can't read data");
                                         }
                         }
                
               }
                catch (IOException e)
            {
                    System.err.println(e);
            }
                catch (NegativeArraySizeException xd){
                     System.err.println(xd);
                }
                catch (Exception err){
                    System.err.println("Entro a este final catch.");
                }
                                              String x= new String(data);
                                                                      return x;
                                        
        }
                    }
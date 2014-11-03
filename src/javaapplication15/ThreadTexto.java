package javaapplication15;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author miguel
 */

    class ThreadTexto extends Thread{
        
          MainHome  test1= new MainHome();
    static int tiempo=1000;   
    static int valor=0;
    static Robot home;
     int numMsg= test1.getnumMesg();
    
    int cont=0;
        @Override
             public void run(){
                 
	  try {
		  home = null;   
                 numMsg=test1.getnumMesg();
        
             try {
                 home = new Robot();
                 
                  
            } catch (AWTException ex) {
                    Logger.getLogger(ThreadTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             
                 
                  Thread.sleep(300);
                 /* Este metodo es para bloquear la computadora
                      try {
                          Runtime.getRuntime().exec("rundll32 user32.dll,LockWorkStation");
                      } catch (IOException ex) {
                          Logger.getLogger(ThreThreadTextoss.getName()).log(Level.SEVERE, null, ex);
                      }
                */
               
             switch(test1.getText()){
                 
                 case "Command1-Enter":
                      home.keyPress(KeyEvent.VK_ENTER);
                     home.keyRelease(KeyEvent.VK_ENTER);
                     break;
                 case "Command2-Back":
                         home.keyPress(KeyEvent.VK_BACK_SPACE);
                         home.keyRelease(KeyEvent.VK_BACK_SPACE);
                     break;
                 case "Right-Click":
                        break;
                 case "Left-Click":
                     break;
                 case "ScrollDown":
                     break;
                 case "ScrollUp":
                     break;
                 default:
                      type(test1.getText());
                         
                     
             }
          
         
        } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
   
    }
        
/*
  private void type(String s)
  {
   System.out.println(s);
   
   for(int i=0; i<s.length(); i++){
 
        switch (s.charAt(i)) {
      case 'a': home.keyPress(KeyEvent.VK_A); break;
      case 'b': home.keyPress(KeyEvent.VK_B); break;
      case 'c': home.keyPress(KeyEvent.VK_C); break;
      case 'd': home.keyPress(KeyEvent.VK_D); break;
      case 'e': home.keyPress(KeyEvent.VK_E); break;
      case 'f': home.keyPress(KeyEvent.VK_F); break;
      case 'g': home.keyPress(KeyEvent.VK_G); break;
      case 'h': home.keyPress(KeyEvent.VK_H); break;
      case 'i': home.keyPress(KeyEvent.VK_I); break;
      case 'j': home.keyPress(KeyEvent.VK_J); break;
      case 'k': home.keyPress(KeyEvent.VK_K); break;
      case 'l': home.keyPress(KeyEvent.VK_L); break;
      case 'm': home.keyPress(KeyEvent.VK_M); break;
      case 'n': home.keyPress(KeyEvent.VK_N); break;
      case 'o': home.keyPress(KeyEvent.VK_O); break;
      case 'p': home.keyPress(KeyEvent.VK_P); break;
      case 'q': home.keyPress(KeyEvent.VK_Q); break;
      case 'r': home.keyPress(KeyEvent.VK_R); break;
      case 's': home.keyPress(KeyEvent.VK_S); break;
      case 't': home.keyPress(KeyEvent.VK_T); break;
      case 'u': home.keyPress(KeyEvent.VK_U); break;
      case 'v': home.keyPress(KeyEvent.VK_V); break;
      case 'w': home.keyPress(KeyEvent.VK_W); break;
      case 'x': home.keyPress(KeyEvent.VK_X); break;
      case 'y': home.keyPress(KeyEvent.VK_Y); break;
      case 'z': home.keyPress(KeyEvent.VK_Z); break;
      case 'A': home.keyPress(KeyEvent.VK_SHIFT);  home.keyPress(KeyEvent.VK_A);  home.keyRelease(KeyEvent.VK_SHIFT);    break;
      case 'B': home.keyPress(KeyEvent.VK_SHIFT);  home.keyPress(KeyEvent.VK_B);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'C': home.keyPress(KeyEvent.VK_SHIFT);   home.keyPress(KeyEvent.VK_C);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'D': home.keyPress(KeyEvent.VK_SHIFT);   home.keyPress(KeyEvent.VK_D);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'E': home.keyPress(KeyEvent.VK_SHIFT);    home.keyPress(KeyEvent.VK_E); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case 'F': home.keyPress(KeyEvent.VK_SHIFT);    home.keyPress(KeyEvent.VK_F); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case 'G': home.keyPress(KeyEvent.VK_SHIFT);   home.keyPress(KeyEvent.VK_G);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'H': home.keyPress(KeyEvent.VK_SHIFT);  home.keyPress(KeyEvent.VK_H);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'I': home.keyPress(KeyEvent.VK_SHIFT);   home.keyPress(KeyEvent.VK_I);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'J': home.keyPress(KeyEvent.VK_SHIFT);   home.keyPress(KeyEvent.VK_J);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'K': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_K);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'L': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_L);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'M': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_M); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case 'N': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_N);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'O': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_O);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'P': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_P); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case 'Q': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_Q);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'R': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_R);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'S': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_S);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'T': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_T);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'U': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_U); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case 'V': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_V);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'W': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_W);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'X': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_X);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'Y': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_Y);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case 'Z': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_Z);  home.keyRelease(KeyEvent.VK_SHIFT);break;
      case '!': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_1);  home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '@': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_2); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '#': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_3); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '$': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_4); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '%': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_5); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '^': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_6); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '&': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_7); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '*': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_8); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '(': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_9); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case ')': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_0); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '/': home.keyPress(KeyEvent.VK_SLASH);
      case '?': home.keyPress(KeyEvent.VK_SHIFT); home.keyPress(KeyEvent.VK_SLASH); home.keyRelease(KeyEvent.VK_SHIFT); break;
      case '1': home.keyPress(KeyEvent.VK_1); break;
      case '2':  home.keyPress(KeyEvent.VK_2);break;
      case '3':  home.keyPress(KeyEvent.VK_3);break;
      case '4':  home.keyPress(KeyEvent.VK_4);break;
      case '5':  home.keyPress(KeyEvent.VK_5);break;
      case '6':  home.keyPress(KeyEvent.VK_6);break;
      case '7':  home.keyPress(KeyEvent.VK_7);break;
      case '8':  home.keyPress(KeyEvent.VK_8);break;
      case '9':  home.keyPress(KeyEvent.VK_9);break;
      case '0':  home.keyPress(KeyEvent.VK_0);break;
      case ' ': home.keyPress(KeyEvent.VK_SPACE); break;   
      default:
          
          
      }
             }
 }*/
       
   
    /*  
    byte[] bytes = s.getBytes();
    for (byte b : bytes)
    {
      int code = b;
      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
      if (code > 96 && code < 123) code = code - 32;
      home.delay(40);
      home.keyPress(code);
      home.keyRelease(code);
     
    }*/
             
              public void type(CharSequence characters) {
      int length = characters.length();
      for (int i = 0; i <length ; i++) {
          char character = characters.charAt(i);
          type(character);
      }
  }

  public void type(char character) {
      switch (character) {
      case 'a': doType(KeyEvent.VK_A); break;
      case 'b': doType(KeyEvent.VK_B); break;
      case 'c': doType(KeyEvent.VK_C); break;
      case 'd': doType(KeyEvent.VK_D); break;
      case 'e': doType(KeyEvent.VK_E); break;
      case 'f': doType(KeyEvent.VK_F); break;
      case 'g': doType(KeyEvent.VK_G); break;
      case 'h': doType(KeyEvent.VK_H); break;
      case 'i': doType(KeyEvent.VK_I); break;
      case 'j': doType(KeyEvent.VK_J); break;
      case 'k': doType(KeyEvent.VK_K); break;
      case 'l': doType(KeyEvent.VK_L); break;
      case 'm': doType(KeyEvent.VK_M); break;
      case 'n': doType(KeyEvent.VK_N); break;
      case 'o': doType(KeyEvent.VK_O); break;
      case 'p': doType(KeyEvent.VK_P); break;
      case 'q': doType(KeyEvent.VK_Q); break;
      case 'r': doType(KeyEvent.VK_R); break;
      case 's': doType(KeyEvent.VK_S); break;
      case 't': doType(KeyEvent.VK_T); break;
      case 'u': doType(KeyEvent.VK_U); break;
      case 'v': doType(KeyEvent.VK_V); break;
      case 'w': doType(KeyEvent.VK_W); break;
      case 'x': doType(KeyEvent.VK_X); break;
      case 'y': doType(KeyEvent.VK_Y); break;
      case 'z': doType(KeyEvent.VK_Z); break;
      case 'A': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
      case 'B': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
      case 'C': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
      case 'D': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
      case 'E': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
      case 'F': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
      case 'G': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
      case 'H': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
      case 'I': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
      case 'J': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
      case 'K': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
      case 'L': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
      case 'M': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
      case 'N': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
      case 'O': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
      case 'P': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
      case 'Q': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
      case 'R': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
      case 'S': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
      case 'T': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
      case 'U': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
      case 'V': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
      case 'W': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
      case 'X': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
      case 'Y': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
      case 'Z': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
      case '/': doType(KeyEvent.VK_SLASH); break;
      case '0': doType(KeyEvent.VK_0); break;
      case '1': doType(KeyEvent.VK_1); break;
      case '2': doType(KeyEvent.VK_2); break;
      case '3': doType(KeyEvent.VK_3); break;
      case '4': doType(KeyEvent.VK_4); break;
      case '5': doType(KeyEvent.VK_5); break;
      case '6': doType(KeyEvent.VK_6); break;
      case '7': doType(KeyEvent.VK_7); break;
      case '8': doType(KeyEvent.VK_8); break;
      case '9':doType(KeyEvent.VK_9); break;
      case ':': doType(KeyEvent.VK_COLON); break;
      case '@': doType(KeyEvent.VK_AT); break;
      case '\\': doType(KeyEvent.VK_BACK_SLASH); break;
      case '[': doType(KeyEvent.VK_OPEN_BRACKET); break;
      case ']': doType(KeyEvent.VK_CLOSE_BRACKET); break;
      case ',': doType(KeyEvent.VK_COMMA); break;
      case '=': doType(KeyEvent.VK_EQUALS); break;
      case '^':  doType(KeyEvent.VK_CIRCUMFLEX); break;
      case '$': doType(KeyEvent.VK_DOLLAR); break;
  
      //case '¡': doType(KeyEvent.VK_INVERTED_EXCLAMATION_MARK); break;
      //case '(': doType(KeyEvent.VK_LEFT_PARENTHESIS); break;
      //case ')': doType(KeyEvent.VK_RIGHT_PARENTHESIS); break;
      //case '_': doType(KeyEvent.VK_UNDERSCORE); break;
      case ';': doType(KeyEvent.VK_SEMICOLON);break;
      case '+': doType(KeyEvent.VK_PLUS); break;
      case '.': doType(KeyEvent.VK_PERIOD); break;
      case '-': doType(KeyEvent.VK_MINUS); break;
      case '*': doType(KeyEvent.VK_ASTERISK); break;
      case '#': doType(KeyEvent.VK_NUMBER_SIGN); break;
      
      case '!': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_1); break;
      //case '@': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_2);break;
         // case '#': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_3);break;
             // case '$': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_4);break;
                  case '%': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5);break;
                    //  case '^': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_6);break;
                          case '&': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_7);break;
                             // case '*': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_8);break;
                                //case '(': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_9);break;
                                 //     case ')': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_0);break;
                                          case '?': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH);break;
      case ' ': doType(KeyEvent.VK_SPACE); break;   
      default:
        
      }
     home.delay(40);
  }
  


  private void doType(int... keyCodes) {
      doType(keyCodes, 0, keyCodes.length);
  }

  private void doType(int[] keyCodes, int offset, int length) {
      if (length == 0) {
          return;
      }

      home.keyPress(keyCodes[offset]);
      doType(keyCodes, offset + 1, length - 1);
      home.keyRelease(keyCodes[offset]);
  }

             
             
             
  }
    

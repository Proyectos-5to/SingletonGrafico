/* 

*/
package org.carlostomas.clases;

import javax.swing.JFrame;
import org.carlostomas.system.Login;


public class LoginSingleton {
    
    private static JFrame log;
            
    private LoginSingleton() {
        
    }
    public static JFrame getInstance(){
      if (log == null)  
          log = new Login();
      return log;
    }
 }    
    


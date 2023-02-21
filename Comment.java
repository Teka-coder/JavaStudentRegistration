/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static studentregistration.Registering.display;

/**
 *
 * @author user
 */
public abstract class Comment { ///abstract class
    public void comment(){
        System.out.println("\t\tWe need your Comment");
    }
    public abstract void yourcomment();
    
}
class Commentimplmentor extends Comment{
  @Override
  public void  yourcomment(){
      
          System.out.println("\t\tEnter your Comment here:\n");
          Scanner sca=new Scanner(System.in);
          String com=sca.nextLine();
          System.out.println("\t\tScanning your Comment:\n");
         System.out.println("\t\t"+com+"\n");
          //wait();
         System.out.println("\t\t\n\nExit by 5\n\n");
         System.out.println("\t\tBack menu by 1\n");
      int oo=sca.nextInt();
      switch(oo){
          case 1:
              exit(0);
              break;
          case 5:
          {
              try {
                  display();
              } catch (IOException ex) {
                  Logger.getLogger(Commentimplmentor.class.getName()).log(Level.SEVERE, null, ex);
              }
          }
              break;
          default:
             System.out.println("Invalid key"); 
      }
  }
    
}


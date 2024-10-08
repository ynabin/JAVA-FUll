/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class JavaApplication6 extends Thread{

    /**
     * @param args the command line arguments
     */
    
    public void run()
    {
      System.out.print("welcome to Java");
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication6 g=new JavaApplication6();
        g.start();
        
    }
    
}

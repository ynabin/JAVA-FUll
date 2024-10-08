/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wrapperclass;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class Wrapperclass {

   
       
            public static void main(String args[]){
                //Converting Integer to int
                //Integer a=new Integer(3);
               // int i=a.intValue();//converting Integer to int explicity
               // int j=a;//unboxing, now compiler will write a.intvalue() internally
               // System.out.println(a+" "+i+" "+j);
          Operation op=new Operation();
    System.out.println("before change"+op.data);
    op.change(500);
    System.out.println("after change"+op.data);
        
      //  Integer myInt = 5; 
      //  Double myDouble = 5.99;
      //  Character myChar = 'A';
        //System.out.println(myInt);
        //System.out.println(myInt.intValue());
        //System.out.println(myDouble.doubleValue());
        //System.out.println(myChar.charValue());
    }
}

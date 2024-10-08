/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.updatingelement;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class Updatingelement {

    public static void main(String[] args) {
        List<String> al=new ArrayList<>();
        //Adding ele,ents to obejct of List class
        al.add("Geeeks");
        al.add("Geeks");
        al.add(1,"Geeks");
        
        // Display theinitial elements in list
        System.out.println("Initial ArrayList" +al);
        
        //Setting(updating)element at 1st index
        //using set()method
        al.set(1,"For");
        
        //print and display the updated List
        System.out.print("Updated ArrayList" +al);
    }
}

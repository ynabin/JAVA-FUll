/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.searchingforelements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nabin Yaduvanshi
 */
public class Searchingforelements {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //add some integers to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        //use indedof() to find the first occurence of an //element in the list
        
        int index = numbers.indexOf(2);
        System.out.println("THe first occurence of 2 is at index" + index);
    }
}

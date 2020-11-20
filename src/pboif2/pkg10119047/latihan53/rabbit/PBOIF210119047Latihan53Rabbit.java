/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan53.rabbit;

import data.Rabbit;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN DATA KELINCI
 */

public class PBOIF210119047Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        
        //output
        System.out.println("Hallo, His name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs.");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }
    
}

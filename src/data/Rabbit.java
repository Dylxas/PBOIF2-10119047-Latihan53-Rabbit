/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENAMPILKAN DATA KELINCI
 */

public class Rabbit extends Animal{
    
    private String color;
    private String name;

    public Rabbit(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.color = color;
        this.name = name;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.end_game;

/**
 *
 * @author obed
 */
public class Heroe extends Personaje{
    protected String arma;
    
public Heroe (String nombre,String poder,String arma){
    super (nombre,poder);
    this.arma=arma;
        
}
 @Override 
 public void atacar(){
  System.out.println(nombre+"realizar ataque con el arma"+arma+"!");
}
}

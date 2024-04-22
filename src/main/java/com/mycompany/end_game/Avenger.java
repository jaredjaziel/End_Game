/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.end_game;

/**
 *
 * @author obed
 */
public class Avenger extends Heroe {
    protected String equipo;
    
public Avenger(String nombre,String poder,String arma,String equipo){
    super(nombre,poder,arma);
    this.equipo=equipo;
    
}
public void reuniirse(){
    System.out.println(nombre+"se une al equipo "+equipo+" de los Avengers");
}    
    
}
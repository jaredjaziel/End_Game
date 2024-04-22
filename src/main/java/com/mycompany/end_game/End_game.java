/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.end_game;

/**
 *
 * @author obed
 */

public class End_game {
    
    public static void main (String[]args){
        Heroe blackPanter=new Heroe("Black Panter ","ser el rey de wakanda "," Garras de Vibranium ");
        Villano galactus=new Villano("Galactus","Devorar mundos ","usa de chalan a Silver Surfer ");
        Avenger iroMan=new Avenger ("Tonny Stark ","Genio,Filantropo "," multimillonario,playboy "," Prime");
        Thanos thanos=new Thanos("Thanos ","El titán loco ","Ejercito Chitaury "," Gemas del infinito ");
    
        //aplicando polimorfismo
        
        Personaje[] personajes={blackPanter,galactus,iroMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        //metod especifico de avenger
       ((Avenger)iroMan).reuniirse();
       //ejemplo metodo especifico de thanos 
       thanos.chasquearDedos();

}}
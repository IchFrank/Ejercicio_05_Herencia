/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author 54935
 */
public class Caballo extends Animal {
    
    //Constructores:
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Metodos:
    //Metodo mostrarCaballo():
    public void mostrarCaballo(){
        System.out.println("Nombre: " + nombre + " Alimento: " + alimento + " Edad: " + edad + " Raza: " + raza);
    }
    
    
}

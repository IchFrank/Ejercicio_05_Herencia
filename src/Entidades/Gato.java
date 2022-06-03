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
public class Gato extends Animal {

    //Constructores:
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    //Metodos:
    //Metodo mostrarGato():
    public void mostrarGato(){
        System.out.println("Nombre: " + nombre + " Alimento: " + alimento + " Edad: " + edad + " Raza: " + raza);
    }
    
    

}

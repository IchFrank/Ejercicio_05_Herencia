/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_01_g5_herencia;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author 54935
 */
public class Ejercicio_01_G5_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tenemos una clase padre (Animal), con sus 3 clases hijas: Perro, Gato y Caballo.✓
        //La clase animal tendra como atributos: nombre, alimento, edad y raza.✓
        //Crear un metodo en la clase (Animal), a traves del cual cada clase hija debera mostrar un mensaje por pantalla informando de que se alimenta.
        //Generar  una clase main que realice lo siguiente: (ver guia).
        //...
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Lista de Perros: ");
        //Creacion de objetos: "Perro".
        Perro perro1 = new Perro("Rebeca ", " Balanceado", 7, "Trucho");
        Perro perro2 = new Perro("Spot", "Croquetas", 14, "Trucho");
        perro1.mostrarPerro();
        perro1.alimentaicion();
        perro2.mostrarPerro();
        perro2.alimentaicion();

        System.out.println("Lista de Gatos: ");
        //Creacion de objetos: "Gato".
        Gato gato1 = new Gato("Luna", "Atun", 7, "Trucho");
        gato1.mostrarGato();
        gato1.alimentaicion();

        System.out.println("Lista de Caballos: ");
        //Creacion de objetos: "Caballo".
        Caballo caballo1 = new Caballo("Juan", "Manzanas", 6, "Salvaje");
        caballo1.mostrarCaballo();
        caballo1.alimentaicion();

    }

}

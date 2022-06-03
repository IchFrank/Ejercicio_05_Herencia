package Entidades;

public class Animal {

    //Atributos;
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    //Constructores;
    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    //Metodos:
    //Metodo alimetacion(): 
    public void alimentaicion(){
        System.out.println(alimento);
    }

}

package ar.com.codoacodo;

public abstract class Animal {
     
    private String nombre;
    private Integer edad;

    //constructor

    public Animal(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //métodos set get

    public void comer(){
        System.out.println("Comiendo....");
    }

    public void dormir(){
        System.out.println("Shhhhhhhhhh... durmiendo");
    }

    //método abstracto

    public abstract void alimentarse();

}


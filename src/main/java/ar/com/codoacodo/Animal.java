package ar.com.codoacodo;

public abstract class Animal {
     
    private String nombre;
    private Integer edad;

    //constructor

    public Animal(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos get set

    public void comer(){
        System.out.println("comiendo.....");
    }

    public void dormir(){
        System.out.println("Shsssss durmiendo...");
    }

    //metodo abstracto

    public abstract void alimentarse();
}


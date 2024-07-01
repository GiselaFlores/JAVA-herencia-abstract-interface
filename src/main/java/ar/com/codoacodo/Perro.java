package ar.com.codoacodo;

public class Perro extends Animal implements TipoAnimal{

    public String raza;

    //constructor

    public Perro(String nombre, Integer edad, String raza){
        super(nombre, edad);
        this.raza = raza;
    }
/* 
    public Perro(){
        super();
    }
*/
    //métodos get set

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }
    
    //método propio

    public void ladrar(){
        System.out.println("Guauuuu guauuuu....");
    }

    @Override
    public void alimentarse(){
        System.out.println("Me alimento de croquetas de eukanuba");
    }

    @Override
    public void mostrarTipo(){
        System.out.println("Es un perro lindo");
    }

    @Override
    public void mostrarNombre(){
        System.out.println("El nombre es:");
    }
}

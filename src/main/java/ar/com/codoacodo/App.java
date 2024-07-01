package ar.com.codoacodo;

public class App 
{
    public static void main( String[] args )
    {
        //Animal animalito = new Animal("Conejo", 2);

        //animalito.comer();

        Perro miPerro = new Perro("Firulais", 12, "pepe");

        miPerro.dormir();

        //Perro miOtroPerro = new Perro();

        miPerro.ladrar();

        miPerro.alimentarse();

        miPerro.mostrarNombre();
    }
}

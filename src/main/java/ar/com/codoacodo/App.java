package ar.com.codoacodo;

public class App 
{
    public static void main( String[] args )
    {
        
        //Animal animalito = new Animal("Firulais", 12);

        //animalito.comer();

        Perro miPerro = new Perro("Firulais", 12,"pepe");

        miPerro.ladrar();

        miPerro.comer();

        miPerro.alimentarse();

        miPerro.mostrarNombre();

        Gato miGato = new Gato("Garfield", 10, "atigrado naranja");

        miGato.ladrar();

        miGato.maullar();

        miGato.comer();

        miGato.alimentarse();

        miGato.mostrarNombre();
    }
}

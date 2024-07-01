package ar.com.codoacodo;

public class Gato extends Animal implements TipoAnimal {
    
    public String tipoGato;

    public Gato(String nombre, Integer edad, String tipoGato){
        super(nombre, edad);
        this.tipoGato = tipoGato;
    }

        //métodos get set

        public String getTipoGato(){
            return tipoGato;
        }
    
        public void setTipoGato(String tipoGato){
            this.tipoGato = tipoGato;
        }
    
        // método propio
    
        public void maullar(){
            System.out.println("Miauuuuu miauuuu...");
        }

            //método abtracto de animal

    @Override
    public void alimentarse(){
        System.out.println("Me alimento de atún");
    }

    @Override
    public void mostrarNombre(){
        System.out.println("El nombre es: ");
    }

    @Override
    public void mostrarTipo(){
        System.out.println("Soy un felino");
    }
}

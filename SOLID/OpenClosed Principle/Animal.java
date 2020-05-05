package principio2;

/*
    Crear clase abstracta
    @param animal
    */
public abstract class Animal {

    /*
    Clase Abstracta
    Otro tipo de clases en java, para hacer herencia
    LLeva la palabra reservada abstrac
    Lleva metodos abstracticos
    Una clase abstracta no puede ser usada para crear objetos --Animal objeto = new Animal (); ERROR
    Modelo de como debe ser una clase
    Define el comportamiento de la clase
    */
    
    /*
    Metodos abstractos
    No tienen cuerpo los metodos
    Los hijps  le dan la funcionalidad
    */
    public abstract void dormir();
    
    public abstract void comer();
    
    /*
    Metodos regular
    */
    public void jugar (){
        System.out.println("Juego con mi mascota");
    }
    
    public void volar(){
        System.out.println("Animal volando");
    }
}

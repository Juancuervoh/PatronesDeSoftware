package principio5;

public class Montoya implements Piloto {
    // para poder conducir necesito un carro

    private vehiculo vehiculo;
    String tipo = "lamborgini";
    //FORMA 1 (ya mo depende de la clase si no depende del constructor)

    public Montoya() {
        vehiculo = new vehiculo(tipo);

    }

    @Override
    public void pilotear() {
        //FORMA 2
        vehiculo.setTipo("BMW");

        vehiculo.conducir_ferrari();
    }

}
/*
DEPENDENCIA FUERTEMENTE ACOPLADA
No es muy flexible por que solo 
tengo ferraris(SOLO FERRARIS).
-------------------------------
IRON MAN 
inyeccion de dependencias 
---------------------
1 FORMA (Constructor)
2 FORMA (MITADOR ó SETTERS)
 */

package principio5;

public class vehiculo {

    String tipo = "Ferrari";

    public vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void conducir_ferrari() {
        System.out.println("Manejo un " + tipo);
    }
}

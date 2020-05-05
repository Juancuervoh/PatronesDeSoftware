package principio3;

/**
 *
 * @author danie
 */
public class Principal {
    public static void main(String[] args){
        /*Rectangulo objetoRectangulo = new Rectangulo();
        objetoRectangulo.setHeight(5);
        objetoRectangulo.setWidth(2);
        
        System.out.println("El area del rectangulo: "+objetoRectangulo.calculoArea());
        
        Cuadrado objetoCuadrado = new Cuadrado();
        objetoCuadrado.setHeight(5);
        objetoCuadrado.setWidth(6);
        
        System.out.println("El area del cuadrado es: "+objetoCuadrado.calculoArea());
        */
        
        
        
        /*
        Solucion 1.
        Clase padre abstracta qie se llame Figura
        public abstract calcularArea();
        
        Solucion 2
        Usar clase tipo interface
        
        Solucion 3
        Inmutabilidad = una vez creado un objeto, el estado no puede volver a modificarse.
        Ventaja: Mejora el uso de la memoria
        Hilos mejora uso de concurrencia
        */
        
        Cuadrado objetoCuadrado = new Cuadrado(5);
        System.out.println(objetoCuadrado.calculoArea());
        
        Rectangulo objetoRectangulo = new Rectangulo(20,5);
        System.out.println(objetoRectangulo.calculoArea());
    }
}

package pruebacalculadora;

public class PruebaCalculadora {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float dividir(int a, int b) {
        float div=0;
        try {
            div = a / b;

        } catch (ArithmeticException e) {
            System.out.println("no se puede dividir entre cero");
        }
        return div;
    }

    public static void main(String[] args) {
        System.out.println("suma "+ sumar(10, 20));
        System.out.println("Resta "+restar(10, 20));
        System.out.println("Multiplicacion "+multiplicar(10, 20));
        System.out.println("divicion "+dividir(10, 5));
        
    }

}

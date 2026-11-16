package poojava.polimorfismo.sobrecargametodo;

public class Calculadora {
    //uso de Polimorfismo em sobre carga do metodo em tempo de compilação
    public static int somar(int a, int b){
        return a+b;
    }
    public static double somar(double a, double b){
        return a+b;
    }
    public static Integer somar(Integer a, Integer b, Integer c){
        return a+b+c;
    }
}

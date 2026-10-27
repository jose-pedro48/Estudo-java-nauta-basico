package classesDeEstudo;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int num = 3;
        int num1 = 5;
        int num2 = 7;
        //os valores mudam quando não segue a precedência
        int num3 = num2 + num1/2;
        System.out.println("o valor diferente sem precedência "+num3);
        //os valores certos quando segue a precedência
        int num4 = (num2 + num1) /2;
        System.out.println("o valor correto com a precedência "+num4);

    }
}

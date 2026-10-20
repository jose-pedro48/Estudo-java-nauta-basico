import java.util.Scanner;

public class ConversaoDeTipos {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        int numero = 10;
        float numero1 = 20.5f;
        double numero2 = 8.5d;
        long numero3 = 152L;
        String nu = "27";

        // 1-Casting do tipo Double para Long, obs= long é do tipo número inteiro
        long foi = (long) numero2;
        System.out.println("Trocando o Double pra long "+foi);

        // 2-Casting do tipo Double para inteiro, obs= int é do tipo número inteiro
        int troca = (int)numero2;
        System.out.println("Trocando o Double para int "+troca);

        // 3-Casting do tipo Double para float, obs= double e float são do tipo que contem número flutuante
        float mais = (float)numero2;
        System.out.println("Trocando o Double para float "+mais);

        // 4-Casting do tipo Double para String
        String ver = String.valueOf(numero2);
        System.out.println("Trocando o Double para String '"+ver+"'");
        System.out.println("---------------------------------------------------------");



       // input.close();
    }
}

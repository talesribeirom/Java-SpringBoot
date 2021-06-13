import java.util.*;

public class CalcularMultiplos {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int numero = input.nextInt();
        Multiplos multiplo = new Multiplos();

        System.out.println(multiplo.calculaMultiplos(numero));
    }
}

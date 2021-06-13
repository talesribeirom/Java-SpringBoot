import java.util.*;

public class CalculaFatorial {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        Fatorial fatorial = new Fatorial();

        System.out.print("Digite o numero a ser calculado: ");
        int numero = input.nextInt();

        System.out.print("O fatorial de " + numero + " eh: " + fatorial.calcularFatorial(numero));
    }
}
import java.util.*;

public class Fatorial {

    //Calcula fatorial
    int calcularFatorial(int numero){
        //Inicia-se com 1 para 0! ou 1!
        int resultado = 1;

        // Se entrada for 0 ou 1 -> retorna resultado (1)
        if(numero == 0 || numero == 1){
            return resultado;
        }
        else{
            for (int i = 1; i <= numero; i++){
                resultado *= i;
            }
        }
        return resultado;
    }
}

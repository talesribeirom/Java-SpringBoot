import java.util.*;

public class Multiplos {
    
    public int calculaMultiplos (int numero){
        //Se menor que 3, nao possui multiplos
        if(numero < 3){
            return 0;
        }else{
            int i = 1;
            int soma = 0;
            while(i < numero){
                if(i % 3 == 0 || i % 5 == 0){
                    soma += i;
                    i++;
                }else{
                    i++;
                }
            }
            return soma;
        }
    }
}

import java.util.*;

public class OrdenarVetor {
    public static void main(String[] args){

        BubbleSort bubble = new BubbleSort();
        int v[] = {5, 3, 2, 4, 7, 1, 0, 6};

        bubble.ordernar(v);
        bubble.imprimeVetor(v);
    }
}

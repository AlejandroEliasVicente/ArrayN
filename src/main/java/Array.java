import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final byte tam = 10;
        int cont = 0;
        int []aNum=new int[tam];

        for(int i=0;i<tam;i++){
            System.out.println("Núm:");
            aNum[i]=Integer.parseInt(teclado.nextLine());
        }

        Arrays.sort(aNum);
        int aux = aNum[0];
        System.out.printf("{");

        for (int i=0; i<tam; i++) {
            if (aux==aNum[i])
                cont++;
            else{
                System.out.printf(aux +"="+ cont+",");
                aux=aNum[i];
                cont=1;
            }
        }

        System.out.printf(aux +"="+ cont);
        System.out.printf("}");
    }
}

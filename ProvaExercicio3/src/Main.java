import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> numeros = new ArrayList<String>();
        String[] teste1 = {"12", "13", "15", "18", "48", "98", "Cesar"};
        Integer valorTotal = 0;
        Integer media = 0;
        int i = 0;
        int maior = 0;
        int menor = 2147483647;



        for (String item : teste1)
        {
            Integer teste2 = tryParseInt(item);

            if(teste2 != null){
                System.out.println(teste2);
                valorTotal = valorTotal + teste2;
                i++;
                if (teste2 > maior){
                    maior = teste2;
                }
                if (teste2 < menor){
                    menor = teste2;
                }
            }
        }
       media = valorTotal/i;
        System.out.println("A media é: " + media);
        System.out.println("O menor valor é : " + menor);
        System.out.println("O maior valor é: " + maior);
    }

    public static Integer tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
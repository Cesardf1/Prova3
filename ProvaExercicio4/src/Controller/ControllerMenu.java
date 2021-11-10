package Controller;
import java.util.Scanner;

public class ControllerMenu {
    Scanner sc1 = new Scanner(System.in);

    public void selecionarOpcao() {

            if (sc1.next() == String.valueOf(1))
            {
                System.out.println("Lista de Clientes");

            }
            if (sc1.next() == String.valueOf(2))
            {
                System.out.println("Selecionar Cliente");

            }

            if (sc1.next() == String.valueOf(3))
            {
                System.out.println("Escreva o nome do Cliente\n");

            }


        }






    }



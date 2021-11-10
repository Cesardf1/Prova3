package View;

import Controller.ControllerMenu;

import java.util.Scanner;
import java.util.ArrayList;
public class Inicio {

    public static void main(String[] args) {

        System.out.println("BEM VINDO, ESCOLHA A OPÇÃO DE ACORDO COM A AÇÃO QUE DESEJA REALIZAR\n\n");
        System.out.println("1.Listar Clientes\n2.Selecionar um Cliente\n3.Cadastrar um Cliente\n");

        ControllerMenu cm = new ControllerMenu();
        cm.selecionarOpcao();


    }
}
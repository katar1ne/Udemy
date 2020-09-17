package aplicacoes;

import java.util.Locale;
import java.util.Scanner;

import entididades.EntidadesBanco;

public class Banco {

public static void main(String [] args){

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        EntidadesBanco conta;


        System.out.println("Entre com o seu id");
        int id = s.nextInt();

        System.out.println("Entre com seu nome");
        s.nextLine();
        String nome = s.nextLine();

        System.out.println("Deseja fazer um deposito incial (S/N)?");
        char resposta1 = s.next().charAt(0);

        if(resposta1 == 's'){
        System.out.println("Entre com o valor a ser depositado: ");
        double depositoInicial = s.nextDouble();
        conta = new EntidadesBanco(nome, depositoInicial, id);

        }
        else{
        conta = new EntidadesBanco(nome, id);
        }

        System.out.println();
        System.out.println("Dados da contaa: ");
        System.out.println(conta);
        System.out.println();

        System.out.println("Deseja continuar (S/N)?");
        char resposta2 = s.next().charAt(0);
        if(resposta2 == 's'){
        System.out.println("Para deposito D e para saque S: ");
        char res = s.next().charAt(0);
        if(res == 'd'){
        System.out.println("Entre com o valor a ser depositado: ");
        double depositoInicial = s.nextDouble();
        conta.deposito(depositoInicial);
        } else if(res == 's'){
        System.out.println("Entre com o valor a ser sacado: ");
        double saqueInicial = s.nextDouble();
        conta.saque(saqueInicial);
        }
    }
        else if(resposta2 == 'n'){
            System.out.println("Dados da conta: ");
            System.out.println(conta);
            
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        System.out.println();


    s.close();
    }
}





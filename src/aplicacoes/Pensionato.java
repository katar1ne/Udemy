package aplicacoes;

import java.util.Scanner;

import entidades.EntidadesPensionato;

public class Pensionato {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        
        EntidadesPensionato[] vet = new EntidadesPensionato[10];
        System.out.println("Quantos quarto deseja reservar? ");
        int n = s.nextInt();
        for(int i=0; i<vet.length; i++){
            System.out.println("Alugar #"+ i + ":");
            System.out.println("Nome: ");
            s.nextLine();
            String nome = s.nextLine();
            System.out.println("Email: ");
            String email = s.nextLine();
            System.out.println("Quarto: ");
            int quarto = s.nextInt();

            vet[quarto] = new EntidadesPensionato(nome, email);

        }
        System.out.println();
        System.out.println("Quarto ocupados: ");
        for(int i=0; i<vet.length; i++){
            if(vet[i] != null){
                System.out.println(i + ": "+vet[i]);
            }

        }








        s.close();
        
    }
    
}

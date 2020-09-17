package aplicacoes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.EntidadesPensionatoList;

public class PensionatoList { 

    public static void main(String[] args) {    

    Scanner s = new Scanner(System.in);
    Locale.setDefault(Locale.US);   

    List<EntidadesPensionatoList> list = new ArrayList<>();
    System.out.println("Quantos quartos deseja resistrar? ");
    int n = s.nextInt();

    for(int i=1; i<=n; i++){
        System.out.println("Alugar #"+ i + ":");
        System.out.println("Qual quarto deseja reservar? ");
        int quarto = s.nextInt();
        while (hasQuarto(list, quarto)){
            System.out.println("Quarto já cadastrado. Tente novamente.");
            quarto = s.nextInt();
        }
            System.out.println("Nome: ");
            s.nextLine();
            String nome = s.nextLine();
            System.out.println("Email: ");
            String email = s.nextLine();
            list.add(new EntidadesPensionatoList(nome, email, quarto));
        }

        System.out.println();
        System.out.println("Lista de quartos reservados: ");
        for(EntidadesPensionatoList hotel : list){
            System.out.println(hotel);
            System.out.println();
        }
        s.close();
    }
        public static boolean hasQuarto(List<EntidadesPensionatoList> list, int quarto){
            EntidadesPensionatoList quart = list.stream().filter(x -> x.getQuarto() == quarto).findFirst().orElse(null);
            return quart != null;
        }
 

}

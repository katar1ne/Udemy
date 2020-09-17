package aplicacoes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.EntidadesEmpregado;


public class Empregado {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    Locale.setDefault(Locale.US);


    List<EntidadesEmpregado> list = new ArrayList<>();
    System.out.println("Quantos empregados deseja resistrar? ");
    int n = s.nextInt();

    for(int i=1; i<=n; i++){
        System.out.println();
        System.out.println("Empregado #" + i + ": ");
        System.out.print("Id: ");
        int id = s.nextInt();
        while (hasId(list, id)){
            System.out.println("Id já cadastrado. Tente novamente");
            id = s.nextInt();
        }
        System.out.println("Nome: ");
        s.nextLine();
        String nome = s.nextLine();
        System.out.println("Salario: ");
        double salario = s.nextDouble();
        list.add(new EntidadesEmpregado(id, nome, salario));
    }
System.out.println();
System.out.print("Entre com o id do empregado para ter o acrescimo do salario: ");
int id = s.nextInt();
EntidadesEmpregado empr = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
if(empr == null){
    System.out.println("Esse id não existe!");
}
else {
    System.out.println("Entre com a porcetagem: ");
    double aumento = s.nextDouble();
    empr.incrementarSalario(aumento);
}
System.out.println();
System.out.println("Lista de empregados: ");
for(EntidadesEmpregado obj : list){
    System.out.println(obj);
}
s.close();

}


public static boolean hasId(List<EntidadesEmpregado> list, int id) {
    EntidadesEmpregado empr = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return empr != null;
}
}

package entidades;

public class EntidadesBanco { 
    private String nome;
    private double valor;
    private int id;

    public EntidadesBanco(String nome, int id){
        this.nome = nome;
        this.id = id; 
    }

    public EntidadesBanco(String nome, double depositoInicial, int id){
        this.nome = nome;
        this.id = id;
        deposito(depositoInicial);
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSaldo(){
        return valor;
    }
    public int getId(){
        return id;
    }
    public void deposito(double quantidade){
        valor += quantidade;
    }
    public void saque(double quantidade){
        valor -= quantidade + 5;
    }
    public String toString(){
        return "Conta: "
                + id
                +", Nome: "
                + nome
                +", valor: $"
                +String.format("%.2f", valor);
    }
}

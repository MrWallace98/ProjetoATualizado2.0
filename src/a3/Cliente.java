package a3;

public class Cliente {
    private static int counter = 1;
    private String nome;
    private String cpf;
    private String celular;
    
    
public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        counter += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular){
        this.celular = celular;
    }

    
    public String toString(){
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nCelular: " + this.getCelular();
    }

    String getCPF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
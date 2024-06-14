package model;

public class Cliente {
    
    private String nome;
    private int conta;
    private int senha;
    private String celular;
    private double cpf;
    
    /**
     *
     * @param conta
     * @param nome
     * @param senha
     * @param celular
     * @param cpf
     */
    public Cliente( int conta, String nome, int senha, String celular, double cpf) {
        
        this.nome = nome;
        this.conta = conta;
        this.senha = senha;
        this.celular = celular;
        this.cpf = cpf;
                
    }

    public Cliente(String nome, int conta, int senha, String celular, double cpf) {
        this.nome = nome;
        this.conta = conta;
        this.senha = senha;
        this.celular = celular;
        this.cpf = cpf;
    }

      
    
   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 
        
    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    
    
}

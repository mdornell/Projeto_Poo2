package domain;

public class Cliente extends Pessoa{
    
    private String cpf;
    private String rg;

    public Cliente(String nome, String celular, String email, Endereco endereco, String cpf, String rg) {
        super(nome, celular, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

}

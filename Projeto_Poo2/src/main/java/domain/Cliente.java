package domain;

import javax.persistence.*;

@Entity
public class Cliente extends Pessoa {

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    public Cliente(String cpf, String rg, String nome, String celular, String email, Endereco endereco) {
        super(nome, celular, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public Cliente(int idPessoa,String cpf, String rg, String nome, String celular, String email, Endereco endereco) {
        super(idPessoa, nome, celular, email, endereco);
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

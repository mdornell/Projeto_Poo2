package domain;

import java.text.ParseException;
import java.util.List;

import javax.persistence.*;

@Entity
public class Cliente extends Pessoa {
    @Column(name = "cpf")
    private String cpf;
    
    @Column(name = "rg")
    private String rg;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private List<Orcamento> orcamentos;

    public Cliente() {
    }

    public Cliente(String cpf, String rg, String nome, String celular, String email, Endereco endereco) {
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

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this,this.rg,this.cpf, "" };
    }

    @Override
    public String toString() {
        return super.getNome();
    }
    
}

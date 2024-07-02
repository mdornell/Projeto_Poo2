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

    public Object[] toArray() throws ParseException {
        return new Object[]{this,this.rg,this.cpf, "" };
    }

    @Override
    public String toString() {
        return super.getNome();
    }
    
}

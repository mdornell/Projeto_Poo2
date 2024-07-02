package domain;

import java.text.ParseException;
import java.util.List;
import javax.persistence.*;
import javax.swing.text.html.HTMLDocument.BlockElement;

@Entity
public class Fornecedor extends Pessoa {
    
    @Column(name = "cnpj")
    private String cnpj;

    @OneToMany(mappedBy = "fornecedor", fetch = FetchType.LAZY)
    private List<Material> materiais;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String nome, String celular, String email, Endereco endereco) {
        super(nome, celular, email, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    // public Object toArray() throws ParseException {
    //     return this;
    // }

    public Object[] toArray() throws ParseException {
        return new Object[]{this,"","", this.cnpj };
    }

    @Override
    public String toString() {
        return super.getNome();
    }
}

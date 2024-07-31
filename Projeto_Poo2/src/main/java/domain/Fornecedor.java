package domain;

import java.text.ParseException;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Fornecedor extends Pessoa {
    
    @Column(name = "cnpj")
    private String cnpj;

    @OneToMany(mappedBy = "fornecedor", fetch = FetchType.EAGER)
    private List<Material> materiais;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String nome, String celular, String email, Endereco endereco) {
        super(nome, celular, email, endereco);
        this.cnpj = cnpj;
    }

    public Fornecedor(int id, String cnpj, String nome, String celular, String email, Endereco endereco) {
        super(id, nome, celular, email, endereco);
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


    public Object[] toArray() throws ParseException {
        return new Object[]{this,"","", this.cnpj };
    }

    @Override
    public String toString() {
        return super.getNome();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.cnpj);
        hash = 19 * hash + Objects.hashCode(this.materiais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return Objects.equals(this.materiais, other.materiais);
    }
    
    
}

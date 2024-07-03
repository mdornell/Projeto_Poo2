package domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import javax.persistence.*;

@Entity
public class TipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private double valor;

    @OneToMany(mappedBy = "tipoServico", fetch = FetchType.EAGER)
    private List<Orcamento> orcamentos;

    public TipoServico() {
    }

    public TipoServico(String descricao, double valor, List<Orcamento> orcamentos) {
        this.descricao = descricao;
        this.valor = valor;
        this.orcamentos = orcamentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    public Object toArray() throws ParseException {
        return this;
    }

    @Override
    public String toString() {
        return descricao;
    }

}

package domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class TipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoServico;

    @Column(name = "descricao_tipo_servico")
    private String descricao;

    @Column(name = "valor_tipo_servico")
    private double valor;

//    @Transient
    @OneToMany(mappedBy = "servico", fetch = FetchType.EAGER)
    private List<Orcamento> orcamentos = new ArrayList<>();

    public TipoServico() {
    }

    public TipoServico(int idTipoServico, String descricao, double valor) {
        this.idTipoServico = idTipoServico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public TipoServico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getIdTipoServico() {
        return idTipoServico;
    }

    public void setIdTipoServico(int idTipoServico) {
        this.idTipoServico = idTipoServico;
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

}
